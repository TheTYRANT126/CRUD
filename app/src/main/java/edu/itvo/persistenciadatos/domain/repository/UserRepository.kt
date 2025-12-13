package edu.itvo.persistenciadatos.domain.repository

import edu.itvo.persistenciadatos.domain.model.User
import edu.itvo.persistenciadatos.domain.model.UserPreferences
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    // User data
    suspend fun saveUser(user: User)
    fun getUser(): Flow<User?>

    // Authentication
    suspend fun setLoginState(isLoggedIn: Boolean)
    fun isLoggedIn(): Flow<Boolean>

    // Preferences
    suspend fun saveThemeMode(theme: String)
    fun getThemeMode(): Flow<String>
    suspend fun setNotificationsEnabled(enabled: Boolean)
    fun areNotificationsEnabled(): Flow<Boolean>
    fun getUserPreferences(): Flow<UserPreferences>

    // Clear
    suspend fun clearAll()
}
