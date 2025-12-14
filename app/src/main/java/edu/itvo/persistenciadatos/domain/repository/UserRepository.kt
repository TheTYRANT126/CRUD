package edu.itvo.persistenciadatos.domain.repository

import edu.itvo.persistenciadatos.domain.model.User
import kotlinx.coroutines.flow.Flow

sealed class ResultadoRegistro {
    object Exito : ResultadoRegistro()
    data class Error(val mensaje: String) : ResultadoRegistro()
}

sealed class ResultadoLogin {
    data class Exito(val usuario: User) : ResultadoLogin()
    data class Error(val mensaje: String) : ResultadoLogin()
}

interface UserRepository {
    // Autenticación
    suspend fun registrarUsuario(nombre: String, email: String, contrasena: String, esAdmin: Boolean): ResultadoRegistro
    suspend fun loginUsuario(email: String, contrasena: String): ResultadoLogin
    suspend fun cerrarSesion()

    // Usuario actual logueado
    fun obtenerUsuarioLogueado(): Flow<User?>

    // CRUD de usuarios (para admin)
    fun obtenerTodosLosUsuarios(): Flow<List<User>>
    suspend fun obtenerUsuarioPorId(userId: Int): User?
    suspend fun actualizarUsuario(usuario: User): Boolean
    suspend fun eliminarUsuario(userId: Int): Boolean

    // Preferencias
    suspend fun actualizarTema(userId: Int, tema: String)
    suspend fun actualizarNotificaciones(userId: Int, activadas: Boolean)
    suspend fun actualizarContrasena(userId: Int, contrasenaActual: String, contrasenaNueva: String): Boolean

    // Validaciones
    suspend fun existeEmail(email: String): Boolean
}
