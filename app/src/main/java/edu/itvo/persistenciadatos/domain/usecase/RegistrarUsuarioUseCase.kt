package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.ResultadoRegistro
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import javax.inject.Inject

class RegistrarUsuarioUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(
        nombre: String,
        email: String,
        contrasena: String,
        esAdmin: Boolean
    ): ResultadoRegistro {
        return userRepository.registrarUsuario(nombre, email, contrasena, esAdmin)
    }
}
