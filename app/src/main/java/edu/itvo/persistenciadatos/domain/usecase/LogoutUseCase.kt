package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository

/**
 * Caso de uso para gestionar el cierre de sesión del usuario.
 * Restablece el estado de inicio de sesión y limpia los datos de preferencias.
 */
class LogoutUseCase(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke() {
        // Establecer el estado de inicio de sesión a 'false'
        userRepository.setLoginState(false)
        //userRepository.clearAll()
    }
}
