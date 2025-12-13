package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.model.UserPreferences
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class GetUserPreferencesUseCase(
    private val userRepository: UserRepository
) {
    operator fun invoke(): Flow<UserPreferences> {
        return userRepository.getUserPreferences()
    }
}
