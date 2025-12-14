package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.model.UserPreferences
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetUserPreferencesUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(): Flow<UserPreferences> {
        return userRepository.obtenerUsuarioLogueado().map { user ->
            UserPreferences(
                themeMode = user?.temaActual ?: "system",
                notificationsEnabled = user?.notificacionesActivadas ?: true
            )
        }
    }
}
