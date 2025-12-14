package edu.itvo.persistenciadatos.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.domain.usecase.CerrarSesionUseCase;
import edu.itvo.persistenciadatos.domain.usecase.LoginUsuarioUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerUsuarioActualUseCase;
import edu.itvo.persistenciadatos.domain.usecase.RegistrarUsuarioUseCase;
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
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<LoginUsuarioUseCase> loginUsuarioUseCaseProvider;

  private final Provider<RegistrarUsuarioUseCase> registrarUsuarioUseCaseProvider;

  private final Provider<CerrarSesionUseCase> cerrarSesionUseCaseProvider;

  private final Provider<ObtenerUsuarioActualUseCase> obtenerUsuarioActualUseCaseProvider;

  private AuthViewModel_Factory(Provider<LoginUsuarioUseCase> loginUsuarioUseCaseProvider,
      Provider<RegistrarUsuarioUseCase> registrarUsuarioUseCaseProvider,
      Provider<CerrarSesionUseCase> cerrarSesionUseCaseProvider,
      Provider<ObtenerUsuarioActualUseCase> obtenerUsuarioActualUseCaseProvider) {
    this.loginUsuarioUseCaseProvider = loginUsuarioUseCaseProvider;
    this.registrarUsuarioUseCaseProvider = registrarUsuarioUseCaseProvider;
    this.cerrarSesionUseCaseProvider = cerrarSesionUseCaseProvider;
    this.obtenerUsuarioActualUseCaseProvider = obtenerUsuarioActualUseCaseProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(loginUsuarioUseCaseProvider.get(), registrarUsuarioUseCaseProvider.get(), cerrarSesionUseCaseProvider.get(), obtenerUsuarioActualUseCaseProvider.get());
  }

  public static AuthViewModel_Factory create(
      Provider<LoginUsuarioUseCase> loginUsuarioUseCaseProvider,
      Provider<RegistrarUsuarioUseCase> registrarUsuarioUseCaseProvider,
      Provider<CerrarSesionUseCase> cerrarSesionUseCaseProvider,
      Provider<ObtenerUsuarioActualUseCase> obtenerUsuarioActualUseCaseProvider) {
    return new AuthViewModel_Factory(loginUsuarioUseCaseProvider, registrarUsuarioUseCaseProvider, cerrarSesionUseCaseProvider, obtenerUsuarioActualUseCaseProvider);
  }

  public static AuthViewModel newInstance(LoginUsuarioUseCase loginUsuarioUseCase,
      RegistrarUsuarioUseCase registrarUsuarioUseCase, CerrarSesionUseCase cerrarSesionUseCase,
      ObtenerUsuarioActualUseCase obtenerUsuarioActualUseCase) {
    return new AuthViewModel(loginUsuarioUseCase, registrarUsuarioUseCase, cerrarSesionUseCase, obtenerUsuarioActualUseCase);
  }
}
