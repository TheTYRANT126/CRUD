package edu.itvo.persistenciadatos.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.itvo.persistenciadatos.domain.model.User
import edu.itvo.persistenciadatos.domain.repository.ResultadoLogin
import edu.itvo.persistenciadatos.domain.repository.ResultadoRegistro
import edu.itvo.persistenciadatos.domain.usecase.CerrarSesionUseCase
import edu.itvo.persistenciadatos.domain.usecase.LoginUsuarioUseCase
import edu.itvo.persistenciadatos.domain.usecase.ObtenerUsuarioActualUseCase
import edu.itvo.persistenciadatos.domain.usecase.RegistrarUsuarioUseCase
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class AuthUiState {
    object Idle : AuthUiState()
    object Loading : AuthUiState()
    data class LoginSuccess(val usuario: User) : AuthUiState()
    data class RegisterSuccess(val mensaje: String) : AuthUiState()
    data class Error(val mensaje: String) : AuthUiState()
}

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val loginUsuarioUseCase: LoginUsuarioUseCase,
    private val registrarUsuarioUseCase: RegistrarUsuarioUseCase,
    private val cerrarSesionUseCase: CerrarSesionUseCase,
    obtenerUsuarioActualUseCase: ObtenerUsuarioActualUseCase
) : ViewModel() {

    private val _authUiState = MutableStateFlow<AuthUiState>(AuthUiState.Idle)
    val authUiState: StateFlow<AuthUiState> = _authUiState.asStateFlow()

    // Usuario actualmente logueado
    val usuarioActual: StateFlow<User?> = obtenerUsuarioActualUseCase()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = null
        )

    fun login(email: String, contrasena: String) {
        viewModelScope.launch {
            _authUiState.value = AuthUiState.Loading

            when (val resultado = loginUsuarioUseCase(email, contrasena)) {
                is ResultadoLogin.Exito -> {
                    _authUiState.value = AuthUiState.LoginSuccess(resultado.usuario)
                }
                is ResultadoLogin.Error -> {
                    _authUiState.value = AuthUiState.Error(resultado.mensaje)
                }
            }
        }
    }

    fun registrar(nombre: String, email: String, contrasena: String, esAdmin: Boolean) {
        viewModelScope.launch {
            _authUiState.value = AuthUiState.Loading

            when (val resultado = registrarUsuarioUseCase(nombre, email, contrasena, esAdmin)) {
                is ResultadoRegistro.Exito -> {
                    _authUiState.value = AuthUiState.RegisterSuccess("Usuario registrado exitosamente")
                }
                is ResultadoRegistro.Error -> {
                    _authUiState.value = AuthUiState.Error(resultado.mensaje)
                }
            }
        }
    }

    fun cerrarSesion() {
        viewModelScope.launch {
            cerrarSesionUseCase()
        }
    }

    fun resetState() {
        _authUiState.value = AuthUiState.Idle
    }
}
