package edu.itvo.persistenciadatos.di

import edu.itvo.persistenciadatos.domain.repository.UserRepository
import edu.itvo.persistenciadatos.domain.usecase.GetUserPreferencesUseCase
import edu.itvo.persistenciadatos.domain.usecase.GetUserUseCase
import edu.itvo.persistenciadatos.domain.usecase.IsUserLoggedInUseCase
import edu.itvo.persistenciadatos.domain.usecase.LoginUseCase
import edu.itvo.persistenciadatos.domain.usecase.LogoutUseCase
import edu.itvo.persistenciadatos.domain.usecase.UpdateThemeUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun provideGetUserUseCase(
        userRepository: UserRepository
    ): GetUserUseCase {
        return GetUserUseCase(userRepository)
    }

    @Provides
    fun provideLoginUseCase(
        userRepository: UserRepository
    ): LoginUseCase {
        return LoginUseCase(userRepository)
    }

    @Provides
    fun provideLogoutUseCase(
        userRepository: UserRepository
    ): LogoutUseCase {
        return LogoutUseCase(userRepository)
    }

    @Provides
    fun provideUpdateThemeUseCase(
        userRepository: UserRepository
    ): UpdateThemeUseCase {
        return UpdateThemeUseCase(userRepository)
    }

    @Provides
    fun provideGetUserPreferencesUseCase(
        userRepository: UserRepository
    ): GetUserPreferencesUseCase {
        return GetUserPreferencesUseCase(userRepository)
    }

    @Provides
    fun provideIsUserLoggedInUseCase(
        userRepository: UserRepository
    ): IsUserLoggedInUseCase {
        return IsUserLoggedInUseCase(userRepository)
    }
}
