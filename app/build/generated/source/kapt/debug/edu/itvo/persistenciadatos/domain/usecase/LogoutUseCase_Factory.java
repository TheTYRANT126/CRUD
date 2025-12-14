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
public final class LogoutUseCase_Factory implements Factory<LogoutUseCase> {
  private final Provider<UserRepository> userRepositoryProvider;

  private LogoutUseCase_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public LogoutUseCase get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static LogoutUseCase_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new LogoutUseCase_Factory(userRepositoryProvider);
  }

  public static LogoutUseCase newInstance(UserRepository userRepository) {
    return new LogoutUseCase(userRepository);
  }
}
