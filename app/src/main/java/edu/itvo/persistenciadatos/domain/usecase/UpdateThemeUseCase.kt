package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository

class UpdateThemeUseCase(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(theme: String) {
        userRepository.saveThemeMode(theme)
    }
}
