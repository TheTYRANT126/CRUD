package edu.itvo.persistenciadatos.data.repository

import edu.itvo.persistenciadatos.data.local.database.UserDao
import edu.itvo.persistenciadatos.data.local.database.UserEntity
import edu.itvo.persistenciadatos.domain.model.User
import edu.itvo.persistenciadatos.domain.repository.ResultadoLogin
import edu.itvo.persistenciadatos.domain.repository.ResultadoRegistro
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import edu.itvo.persistenciadatos.util.PasswordHasher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {

    // ===== AUTENTICACIÓN =====

    override suspend fun registrarUsuario(
        nombre: String,
        email: String,
        contrasena: String,
        esAdmin: Boolean
    ): ResultadoRegistro {
        return try {
            // Verificar si el email ya existe
            if (userDao.existeEmail(email) > 0) {
                return ResultadoRegistro.Error("Este email ya está registrado")
            }

            // Validar nombre
            if (nombre.length < 3 || nombre.length > 50) {
                return ResultadoRegistro.Error("El nombre debe tener entre 3 y 50 caracteres")
            }

            if (!nombre.matches(Regex("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$"))) {
                return ResultadoRegistro.Error("El nombre solo puede contener letras y espacios")
            }

            // Validar contraseña
            if (contrasena.length < 6) {
                return ResultadoRegistro.Error("La contraseña debe tener al menos 6 caracteres")
            }

            // Hashear contraseña
            val passwordHash = PasswordHasher.hashearContrasena(contrasena)

            // Crear usuario
            val nuevoUsuario = UserEntity(
                nombre = nombre,
                email = email,
                passwordHash = passwordHash,
                esAdmin = esAdmin,
                temaActual = "system",
                notificacionesActivadas = true,
                estaLogueado = false
            )

            userDao.insertarUsuario(nuevoUsuario)
            ResultadoRegistro.Exito
        } catch (e: Exception) {
            ResultadoRegistro.Error("Error al registrar usuario: ${e.message}")
        }
    }

    override suspend fun loginUsuario(email: String, contrasena: String): ResultadoLogin {
        return try {
            val usuarioEntity = userDao.obtenerUsuarioPorEmail(email)
                ?: return ResultadoLogin.Error("Email o contraseña incorrectos")

            // Verificar contraseña
            if (!PasswordHasher.verificarContrasena(contrasena, usuarioEntity.passwordHash)) {
                return ResultadoLogin.Error("Email o contraseña incorrectos")
            }

            // Cerrar sesión de todos los demás usuarios
            userDao.cerrarSesionTodos()

            // Marcar este usuario como logueado
            userDao.actualizarEstadoLogin(usuarioEntity.id, true)

            // Retornar usuario
            val usuario = usuarioEntity.toUser()
            ResultadoLogin.Exito(usuario)
        } catch (e: Exception) {
            ResultadoLogin.Error("Error al iniciar sesión: ${e.message}")
        }
    }

    override suspend fun cerrarSesion() {
        try {
            userDao.cerrarSesionTodos()
        } catch (e: Exception) {
            // Log error
        }
    }

    // ===== USUARIO ACTUAL =====

    override fun obtenerUsuarioLogueado(): Flow<User?> {
        return userDao.obtenerUsuarioLogueado().map { it?.toUser() }
    }

    // ===== CRUD DE USUARIOS (ADMIN) =====

    override fun obtenerTodosLosUsuarios(): Flow<List<User>> {
        return userDao.obtenerTodosLosUsuarios().map { entities ->
            entities.map { it.toUser() }
        }
    }

    override suspend fun obtenerUsuarioPorId(userId: Int): User? {
        return try {
            userDao.obtenerUsuarioPorId(userId)?.toUser()
        } catch (e: Exception) {
            null
        }
    }

    override suspend fun actualizarUsuario(usuario: User): Boolean {
        return try {
            // Validar nombre
            if (usuario.nombre.length < 3 || usuario.nombre.length > 50) {
                return false
            }

            if (!usuario.nombre.matches(Regex("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$"))) {
                return false
            }

            // Verificar si el email ya existe en otro usuario
            val usuarioConEmail = userDao.obtenerUsuarioPorEmail(usuario.email)
            if (usuarioConEmail != null && usuarioConEmail.id != usuario.id) {
                return false
            }

            // Obtener usuario actual de la BD
            val usuarioActual = userDao.obtenerUsuarioPorId(usuario.id) ?: return false

            // Actualizar usuario manteniendo el hash de contraseña actual
            val usuarioActualizado = UserEntity(
                id = usuario.id,
                nombre = usuario.nombre,
                email = usuario.email,
                passwordHash = usuarioActual.passwordHash, // Mantener el hash actual
                esAdmin = usuario.esAdmin,
                temaActual = usuario.temaActual,
                notificacionesActivadas = usuario.notificacionesActivadas,
                estaLogueado = usuarioActual.estaLogueado
            )

            userDao.actualizarUsuario(usuarioActualizado)
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun eliminarUsuario(userId: Int): Boolean {
        return try {
            val usuario = userDao.obtenerUsuarioPorId(userId) ?: return false

            // No permitir eliminar usuario logueado
            if (usuario.estaLogueado) {
                return false
            }

            userDao.eliminarUsuario(usuario)
            true
        } catch (e: Exception) {
            false
        }
    }

    // ===== PREFERENCIAS =====

    override suspend fun actualizarTema(userId: Int, tema: String) {
        try {
            userDao.actualizarTema(userId, tema)
        } catch (e: Exception) {
            // Log error
        }
    }

    override suspend fun actualizarNotificaciones(userId: Int, activadas: Boolean) {
        try {
            userDao.actualizarNotificaciones(userId, activadas)
        } catch (e: Exception) {
            // Log error
        }
    }

    override suspend fun actualizarContrasena(
        userId: Int,
        contrasenaActual: String,
        contrasenaNueva: String
    ): Boolean {
        return try {
            val usuario = userDao.obtenerUsuarioPorId(userId) ?: return false

            // Verificar contraseña actual
            if (!PasswordHasher.verificarContrasena(contrasenaActual, usuario.passwordHash)) {
                return false
            }

            // Validar nueva contraseña
            if (contrasenaNueva.length < 6) {
                return false
            }

            // Hashear nueva contraseña
            val nuevoHash = PasswordHasher.hashearContrasena(contrasenaNueva)

            // Actualizar
            userDao.actualizarContrasena(userId, nuevoHash)
            true
        } catch (e: Exception) {
            false
        }
    }

    // ===== VALIDACIONES =====

    override suspend fun existeEmail(email: String): Boolean {
        return try {
            userDao.existeEmail(email) > 0
        } catch (e: Exception) {
            false
        }
    }

    // ===== MAPPERS =====

    private fun UserEntity.toUser(): User {
        return User(
            id = this.id,
            nombre = this.nombre,
            email = this.email,
            passwordHash = this.passwordHash,
            esAdmin = this.esAdmin,
            temaActual = this.temaActual,
            notificacionesActivadas = this.notificacionesActivadas
        )
    }
}
