package edu.itvo.persistenciadatos.data.local.preferences

import edu.itvo.persistenciadatos.data.local.datastore.DataStoreManager
import kotlinx.coroutines.flow.Flow

class UserPreferencesDataSource(
    private val dataStoreManager: DataStoreManager
) {
    suspend fun saveUserData(name: String, email: String, age: Int) {
        dataStoreManager.saveUserData(name, email, age)
    }

    fun getUserName(): Flow<String> = dataStoreManager.userNameFlow

    fun getUserEmail(): Flow<String> = dataStoreManager.userEmailFlow

    fun getUserAge(): Flow<Int> = dataStoreManager.userAgeFlow

    // --- Authentication ---
    suspend fun setLoginState(isLoggedIn: Boolean) {
        dataStoreManager.saveLoginState(isLoggedIn)
    }

    fun isLoggedIn(): Flow<Boolean> = dataStoreManager.isLoggedInFlow

    // --- Preferences ---
    suspend fun saveThemeMode(theme: String) {
        dataStoreManager.saveThemeMode(theme)
    }

    fun getThemeMode(): Flow<String> = dataStoreManager.themeModeFlow

    suspend fun setNotificationsEnabled(enabled: Boolean) {
        dataStoreManager.saveNotificationState(enabled)
    }

    fun areNotificationsEnabled(): Flow<Boolean> = dataStoreManager.notificationsEnabledFlow

    // --- Clear ---
    suspend fun clearAll() {
        dataStoreManager.clearAll()
    }
}
