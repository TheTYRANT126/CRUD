package edu.itvo.persistenciadatos.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.itvo.persistenciadatos.domain.model.User
import edu.itvo.persistenciadatos.domain.usecase.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class AdminUiState {
    object Idle : AdminUiState()
    object Loading : AdminUiState()
    data class Success(val mensaje: String) : AdminUiState()
    data class Error(val mensaje: String) : AdminUiState()
}

@HiltViewModel
class AdminViewModel @Inject constructor(
    obtenerTodosLosUsuariosUseCase: ObtenerTodosLosUsuariosUseCase,
    private val obtenerUsuarioPorIdUseCase: ObtenerUsuarioPorIdUseCase,
    private val actualizarUsuarioUseCase: ActualizarUsuarioUseCase,
    private val eliminarUsuarioUseCase: EliminarUsuarioUseCase,
    private val actualizarContrasenaUseCase: ActualizarContrasenaUseCase,
    obtenerUsuarioActualUseCase: ObtenerUsuarioActualUseCase,
    private val actualizarTemaUseCase: ActualizarTemaUseCase,
    private val actualizarNotificacionesUseCase: ActualizarNotificacionesUseCase
) : ViewModel() {

    private val _adminUiState = MutableStateFlow<AdminUiState>(AdminUiState.Idle)
    val adminUiState: StateFlow<AdminUiState> = _adminUiState.asStateFlow()

    // Lista de todos los usuarios
    val todosLosUsuarios: StateFlow<List<User>> = obtenerTodosLosUsuariosUseCase()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    // Usuario actual logueado
    val usuarioActual: StateFlow<User?> = obtenerUsuarioActualUseCase()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = null
        )

    fun obtenerUsuarioPorId(userId: Int, onResult: (User?) -> Unit) {
        viewModelScope.launch {
            val usuario = obtenerUsuarioPorIdUseCase(userId)
            onResult(usuario)
        }
    }

    fun actualizarUsuario(usuario: User, nuevaContrasena: String? = null) {
        viewModelScope.launch {
            _adminUiState.value = AdminUiState.Loading

            // Si hay nueva contraseña, actualizarla primero
            if (nuevaContrasena != null && nuevaContrasena.isNotBlank()) {
                // Para simplificar, no pedimos contraseña actual en el panel admin
                // Solo validamos que sea >= 6 caracteres
                if (nuevaContrasena.length < 6) {
                    _adminUiState.value = AdminUiState.Error("La contraseña debe tener al menos 6 caracteres")
                    return@launch
                }
                // Nota: En un caso real de admin, podríamos tener una función especial para cambiar contraseña sin verificar la actual
                // Por ahora, esta funcionalidad se manejará de manera diferente
            }

            val resultado = actualizarUsuarioUseCase(usuario)
            if (resultado) {
                _adminUiState.value = AdminUiState.Success("Usuario actualizado exitosamente")
            } else {
                _adminUiState.value = AdminUiState.Error("Error al actualizar usuario")
            }
        }
    }

    fun eliminarUsuario(userId: Int) {
        viewModelScope.launch {
            _adminUiState.value = AdminUiState.Loading

            val resultado = eliminarUsuarioUseCase(userId)
            if (resultado) {
                _adminUiState.value = AdminUiState.Success("Usuario eliminado exitosamente")
            } else {
                _adminUiState.value = AdminUiState.Error("No se puede eliminar el usuario actual")
            }
        }
    }

    fun actualizarTema(userId: Int, tema: String) {
        viewModelScope.launch {
            actualizarTemaUseCase(userId, tema)
        }
    }

    fun actualizarNotificaciones(userId: Int, activadas: Boolean) {
        viewModelScope.launch {
            actualizarNotificacionesUseCase(userId, activadas)
        }
    }

    fun actualizarContrasena(userId: Int, contrasenaActual: String, contrasenaNueva: String) {
        viewModelScope.launch {
            _adminUiState.value = AdminUiState.Loading

            val resultado = actualizarContrasenaUseCase(userId, contrasenaActual, contrasenaNueva)
            if (resultado) {
                _adminUiState.value = AdminUiState.Success("Contraseña actualizada exitosamente")
            } else {
                _adminUiState.value = AdminUiState.Error("Contraseña actual incorrecta o nueva contraseña inválida")
            }
        }
    }

    fun resetState() {
        _adminUiState.value = AdminUiState.Idle
    }
}
