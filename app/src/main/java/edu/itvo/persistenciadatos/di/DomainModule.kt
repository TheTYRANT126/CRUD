package edu.itvo.persistenciadatos.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Módulo de inyección de dependencias para la capa de dominio.
 *
 * Los use cases ahora tienen @Inject en sus constructores,
 * por lo que Hilt puede inyectarlos automáticamente sin necesidad
 * de métodos @Provides.
 */
@Module
@InstallIn(SingletonComponent::class)
object DomainModule {
    // Los use cases se inyectan automáticamente mediante constructor injection
}
