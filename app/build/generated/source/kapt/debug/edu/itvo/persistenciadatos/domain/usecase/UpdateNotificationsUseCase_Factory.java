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
public final class UpdateNotificationsUseCase_Factory implements Factory<UpdateNotificationsUseCase> {
  private final Provider<UserRepository> userRepositoryProvider;

  private UpdateNotificationsUseCase_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UpdateNotificationsUseCase get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static UpdateNotificationsUseCase_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new UpdateNotificationsUseCase_Factory(userRepositoryProvider);
  }

  public static UpdateNotificationsUseCase newInstance(UserRepository userRepository) {
    return new UpdateNotificationsUseCase(userRepository);
  }
}
