package edu.itvo.persistenciadatos.data.local.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    // Insertar nuevo usuario
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertarUsuario(usuario: UserEntity): Long

    // Actualizar usuario existente
    @Update
    suspend fun actualizarUsuario(usuario: UserEntity)

    // Eliminar usuario
    @Delete
    suspend fun eliminarUsuario(usuario: UserEntity)

    // Obtener usuario por email
    @Query("SELECT * FROM usuarios WHERE email = :email LIMIT 1")
    suspend fun obtenerUsuarioPorEmail(email: String): UserEntity?

    // Obtener usuario actualmente logueado
    @Query("SELECT * FROM usuarios WHERE estaLogueado = 1 LIMIT 1")
    fun obtenerUsuarioLogueado(): Flow<UserEntity?>

    // Obtener todos los usuarios
    @Query("SELECT * FROM usuarios ORDER BY id ASC")
    fun obtenerTodosLosUsuarios(): Flow<List<UserEntity>>

    // Obtener usuario por ID
    @Query("SELECT * FROM usuarios WHERE id = :userId")
    suspend fun obtenerUsuarioPorId(userId: Int): UserEntity?

    // Actualizar estado de login
    @Query("UPDATE usuarios SET estaLogueado = :estaLogueado WHERE id = :userId")
    suspend fun actualizarEstadoLogin(userId: Int, estaLogueado: Boolean)

    // Cerrar sesión de todos los usuarios
    @Query("UPDATE usuarios SET estaLogueado = 0")
    suspend fun cerrarSesionTodos()

    // Actualizar tema del usuario
    @Query("UPDATE usuarios SET temaActual = :tema WHERE id = :userId")
    suspend fun actualizarTema(userId: Int, tema: String)

    // Actualizar notificaciones del usuario
    @Query("UPDATE usuarios SET notificacionesActivadas = :activadas WHERE id = :userId")
    suspend fun actualizarNotificaciones(userId: Int, activadas: Boolean)

    // Actualizar contraseña
    @Query("UPDATE usuarios SET passwordHash = :nuevoHash WHERE id = :userId")
    suspend fun actualizarContrasena(userId: Int, nuevoHash: String)

    // Verificar si existe email
    @Query("SELECT COUNT(*) FROM usuarios WHERE email = :email")
    suspend fun existeEmail(email: String): Int

    // Contar usuarios admin
    @Query("SELECT COUNT(*) FROM usuarios WHERE esAdmin = 1")
    suspend fun contarAdmins(): Int
}
