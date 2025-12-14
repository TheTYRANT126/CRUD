package edu.itvo.persistenciadatos.util

import org.mindrot.jbcrypt.BCrypt

object PasswordHasher {

    // Hashear contraseña
    fun hashearContrasena(contrasena: String): String {
        return BCrypt.hashpw(contrasena, BCrypt.gensalt())
    }

    // Verificar si la contraseña coincide con el hash
    fun verificarContrasena(contrasena: String, hash: String): Boolean {
        return try {
            BCrypt.checkpw(contrasena, hash)
        } catch (e: Exception) {
            false
        }
    }
}
