package edu.itvo.persistenciadatos.di

import android.content.Context
import edu.itvo.persistenciadatos.data.local.datastore.DataStoreManager
import edu.itvo.persistenciadatos.data.local.preferences.UserPreferencesDataSource
import edu.itvo.persistenciadatos.data.repository.UserRepositoryImpl
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideDataStoreManager(
        @ApplicationContext context: Context
    ): DataStoreManager {
        return DataStoreManager(context)
    }

    @Provides
    @Singleton
    fun provideUserPreferencesDataSource(
        dataStoreManager: DataStoreManager
    ): UserPreferencesDataSource {
        return UserPreferencesDataSource(dataStoreManager)
    }

    @Provides
    @Singleton
    fun provideUserRepository(
        userPreferencesDataSource: UserPreferencesDataSource
    ): UserRepository {
        return UserRepositoryImpl(userPreferencesDataSource)
    }
}
