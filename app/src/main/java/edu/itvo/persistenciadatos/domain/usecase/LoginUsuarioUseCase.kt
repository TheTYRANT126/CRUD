package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.ResultadoLogin
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import javax.inject.Inject

class LoginUsuarioUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(email: String, contrasena: String): ResultadoLogin {
        return userRepository.loginUsuario(email, contrasena)
    }
}
