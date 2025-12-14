package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import javax.inject.Inject

class ActualizarNotificacionesUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(userId: Int, activadas: Boolean) {
        userRepository.actualizarNotificaciones(userId, activadas)
    }
}
