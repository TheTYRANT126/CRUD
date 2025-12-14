package edu.itvo.persistenciadatos.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.itvo.persistenciadatos.domain.model.User
import edu.itvo.persistenciadatos.domain.usecase.GetUserPreferencesUseCase
import edu.itvo.persistenciadatos.domain.usecase.GetUserUseCase
import edu.itvo.persistenciadatos.domain.usecase.IsUserLoggedInUseCase
import edu.itvo.persistenciadatos.domain.usecase.LoginUseCase
import edu.itvo.persistenciadatos.domain.usecase.LogoutUseCase
import edu.itvo.persistenciadatos.domain.usecase.UpdateThemeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

data class UserUiState(
    val user: User? = null,
    val isLoggedIn: Boolean = false,
    val themeMode: String = "system",
    val notificationsEnabled: Boolean = true
)

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getUserUseCase: GetUserUseCase,
    private val loginUseCase: LoginUseCase,
    private val logoutUseCase: LogoutUseCase,
    private val updateThemeUseCase: UpdateThemeUseCase,
    getUserPreferencesUseCase: GetUserPreferencesUseCase,
    isUserLoggedInUseCase: IsUserLoggedInUseCase
) : ViewModel() {

    val uiState: StateFlow<UserUiState> = combine(
        getUserUseCase(),
        isUserLoggedInUseCase(),
        getUserPreferencesUseCase()
    ) { user, isLoggedIn, preferences ->
        UserUiState(
            user = user,
            isLoggedIn = isLoggedIn,
            themeMode = preferences.themeMode,
            notificationsEnabled = preferences.notificationsEnabled
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = UserUiState()
    )

    fun login(email: String, contrasena: String) {
        viewModelScope.launch {
            loginUseCase(email, contrasena)
        }
    }

    fun logout() {
        viewModelScope.launch {
            logoutUseCase()
        }
    }

    fun updateTheme(theme: String) {
        viewModelScope.launch {
            updateThemeUseCase(theme)
        }
    }

    fun toggleNotifications(enabled: Boolean) {
        viewModelScope.launch {
        }
    }
}
