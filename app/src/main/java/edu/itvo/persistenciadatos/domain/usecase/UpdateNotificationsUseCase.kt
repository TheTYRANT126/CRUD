package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class UpdateNotificationsUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(enabled: Boolean) {
        val currentUser = userRepository.obtenerUsuarioLogueado().first()
        currentUser?.let {
            userRepository.actualizarNotificaciones(it.id, enabled)
        }
    }
}
