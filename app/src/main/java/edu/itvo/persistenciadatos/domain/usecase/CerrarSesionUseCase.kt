package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import javax.inject.Inject

class CerrarSesionUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke() {
        userRepository.cerrarSesion()
    }
}
