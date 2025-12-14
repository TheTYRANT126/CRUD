package edu.itvo.persistenciadatos.di

import edu.itvo.persistenciadatos.data.local.database.UserDao
import edu.itvo.persistenciadatos.data.repository.UserRepositoryImpl
import edu.itvo.persistenciadatos.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideUserRepository(
        userDao: UserDao
    ): UserRepository {
        return UserRepositoryImpl(userDao)
    }

    // DEPRECATED - DataStore ya no se usa, se migró a Room
    // @Provides
    // @Singleton
    // fun provideDataStoreManager(
    //     @ApplicationContext context: Context
    // ): DataStoreManager {
    //     return DataStoreManager(context)
    // }
    //
    // @Provides
    // @Singleton
    // fun provideUserPreferencesDataSource(
    //     dataStoreManager: DataStoreManager
    // ): UserPreferencesDataSource {
    //     return UserPreferencesDataSource(dataStoreManager)
    // }
}
