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
public final class ActualizarContrasenaUseCase_Factory implements Factory<ActualizarContrasenaUseCase> {
  private final Provider<UserRepository> userRepositoryProvider;

  private ActualizarContrasenaUseCase_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ActualizarContrasenaUseCase get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static ActualizarContrasenaUseCase_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new ActualizarContrasenaUseCase_Factory(userRepositoryProvider);
  }

  public static ActualizarContrasenaUseCase newInstance(UserRepository userRepository) {
    return new ActualizarContrasenaUseCase(userRepository);
  }
}
