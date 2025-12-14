package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import javax.inject.Inject

class ActualizarContrasenaUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(
        userId: Int,
        contrasenaActual: String,
        contrasenaNueva: String
    ): Boolean {
        return userRepository.actualizarContrasena(userId, contrasenaActual, contrasenaNueva)
    }
}
