package edu.itvo.persistenciadatos.presentation.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import edu.itvo.persistenciadatos.presentation.viewmodel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    if (uiState.isLoggedIn) {
        HomeScreen(
            uiState = uiState,
            onLogout = { viewModel.logout() },
            onThemeChange = { viewModel.updateTheme(it) },
            onNotificationToggle = { viewModel.toggleNotifications(it) }
        )
    } else {
        LoginScreen(
            onLogin = { name, email, age ->
                viewModel.login(name, email, age)
            }
        )
    }
}
