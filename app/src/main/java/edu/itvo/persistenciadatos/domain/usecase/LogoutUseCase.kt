package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import javax.inject.Inject

/**
 * Caso de uso para gestionar el cierre de sesión del usuario.
 * Restablece el estado de inicio de sesión y limpia los datos de preferencias.
 */
class LogoutUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke() {
        userRepository.cerrarSesion()
    }
}
