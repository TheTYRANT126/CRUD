package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository

class UpdateNotificationsUseCase(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(enabled: Boolean) {
        userRepository.setNotificationsEnabled(enabled)
    }
}
