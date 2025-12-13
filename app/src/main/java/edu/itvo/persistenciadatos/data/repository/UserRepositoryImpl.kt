package edu.itvo.persistenciadatos.data.repository

import edu.itvo.persistenciadatos.domain.model.User
import edu.itvo.persistenciadatos.domain.model.UserPreferences
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import edu.itvo.persistenciadatos.data.local.preferences.UserPreferencesDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

class UserRepositoryImpl(
    private val userPreferencesDataSource: UserPreferencesDataSource
) : UserRepository {

    override suspend fun saveUser(user: User) {
        userPreferencesDataSource.saveUserData(user.name, user.email, user.age)
    }

    override fun getUser(): Flow<User?> {
        return combine(
            userPreferencesDataSource.getUserName(),
            userPreferencesDataSource.getUserEmail(),
            userPreferencesDataSource.getUserAge()
        ) { name, email, age ->
            if (name.isNotEmpty() && email.isNotEmpty() && age > 0) {
                User(name, email, age)
            } else {
                null
            }
        }
    }

    // --- Authentication ---
    override suspend fun setLoginState(isLoggedIn: Boolean) {
        userPreferencesDataSource.setLoginState(isLoggedIn)
    }

    override fun isLoggedIn(): Flow<Boolean> {
        return userPreferencesDataSource.isLoggedIn()
    }

    // --- Preferences ---
    override suspend fun saveThemeMode(theme: String) {
        userPreferencesDataSource.saveThemeMode(theme)
    }

    override fun getThemeMode(): Flow<String> {
        return userPreferencesDataSource.getThemeMode()
    }

    override suspend fun setNotificationsEnabled(enabled: Boolean) {
        userPreferencesDataSource.setNotificationsEnabled(enabled)
    }

    override fun areNotificationsEnabled(): Flow<Boolean> {
        return userPreferencesDataSource.areNotificationsEnabled()
    }

    override fun getUserPreferences(): Flow<UserPreferences> {
        return combine(
            userPreferencesDataSource.getThemeMode(),
            userPreferencesDataSource.areNotificationsEnabled()
        ) { theme, notifications ->
            UserPreferences(theme, notifications)
        }
    }

    // --- Clear ---
    override suspend fun clearAll() {
        userPreferencesDataSource.clearAll()
    }
}
