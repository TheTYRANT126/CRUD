package edu.itvo.persistenciadatos.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.domain.repository.UserRepository;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class ActualizarTemaUseCase_Factory implements Factory<ActualizarTemaUseCase> {
  private final Provider<UserRepository> userRepositoryProvider;

  private ActualizarTemaUseCase_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ActualizarTemaUseCase get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static ActualizarTemaUseCase_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new ActualizarTemaUseCase_Factory(userRepositoryProvider);
  }

  public static ActualizarTemaUseCase newInstance(UserRepository userRepository) {
    return new ActualizarTemaUseCase(userRepository);
  }
}
