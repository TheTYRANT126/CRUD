package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class UpdateThemeUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(theme: String) {
        val currentUser = userRepository.obtenerUsuarioLogueado().first()
        currentUser?.let {
            userRepository.actualizarTema(it.id, theme)
        }
    }
}
