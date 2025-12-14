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
public final class ObtenerUsuarioPorIdUseCase_Factory implements Factory<ObtenerUsuarioPorIdUseCase> {
  private final Provider<UserRepository> userRepositoryProvider;

  private ObtenerUsuarioPorIdUseCase_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ObtenerUsuarioPorIdUseCase get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static ObtenerUsuarioPorIdUseCase_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new ObtenerUsuarioPorIdUseCase_Factory(userRepositoryProvider);
  }

  public static ObtenerUsuarioPorIdUseCase newInstance(UserRepository userRepository) {
    return new ObtenerUsuarioPorIdUseCase(userRepository);
  }
}
