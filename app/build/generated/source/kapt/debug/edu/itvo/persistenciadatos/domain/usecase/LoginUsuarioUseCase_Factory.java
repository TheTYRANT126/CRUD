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
public final class LoginUsuarioUseCase_Factory implements Factory<LoginUsuarioUseCase> {
  private final Provider<UserRepository> userRepositoryProvider;

  private LoginUsuarioUseCase_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public LoginUsuarioUseCase get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static LoginUsuarioUseCase_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new LoginUsuarioUseCase_Factory(userRepositoryProvider);
  }

  public static LoginUsuarioUseCase newInstance(UserRepository userRepository) {
    return new LoginUsuarioUseCase(userRepository);
  }
}
