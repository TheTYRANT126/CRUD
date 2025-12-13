package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class IsUserLoggedInUseCase(
    private val userRepository: UserRepository
) {
    operator fun invoke(): Flow<Boolean> {
        return userRepository.isLoggedIn()
    }
}
