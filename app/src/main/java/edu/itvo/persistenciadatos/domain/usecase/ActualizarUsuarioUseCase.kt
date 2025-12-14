package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.model.User
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import javax.inject.Inject

class ActualizarUsuarioUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(usuario: User): Boolean {
        return userRepository.actualizarUsuario(usuario)
    }
}
