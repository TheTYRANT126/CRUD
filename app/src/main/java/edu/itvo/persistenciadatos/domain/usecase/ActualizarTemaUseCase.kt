package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import javax.inject.Inject

class ActualizarTemaUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(userId: Int, tema: String) {
        userRepository.actualizarTema(userId, tema)
    }
}
