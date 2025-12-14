package edu.itvo.persistenciadatos.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarContrasenaUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarNotificacionesUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarTemaUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarUsuarioUseCase;
import edu.itvo.persistenciadatos.domain.usecase.EliminarUsuarioUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerTodosLosUsuariosUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerUsuarioActualUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerUsuarioPorIdUseCase;
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
public final class AdminViewModel_Factory implements Factory<AdminViewModel> {
  private final Provider<ObtenerTodosLosUsuariosUseCase> obtenerTodosLosUsuariosUseCaseProvider;

  private final Provider<ObtenerUsuarioPorIdUseCase> obtenerUsuarioPorIdUseCaseProvider;

  private final Provider<ActualizarUsuarioUseCase> actualizarUsuarioUseCaseProvider;

  private final Provider<EliminarUsuarioUseCase> eliminarUsuarioUseCaseProvider;

  private final Provider<ActualizarContrasenaUseCase> actualizarContrasenaUseCaseProvider;

  private final Provider<ObtenerUsuarioActualUseCase> obtenerUsuarioActualUseCaseProvider;

  private final Provider<ActualizarTemaUseCase> actualizarTemaUseCaseProvider;

  private final Provider<ActualizarNotificacionesUseCase> actualizarNotificacionesUseCaseProvider;

  private AdminViewModel_Factory(
      Provider<ObtenerTodosLosUsuariosUseCase> obtenerTodosLosUsuariosUseCaseProvider,
      Provider<ObtenerUsuarioPorIdUseCase> obtenerUsuarioPorIdUseCaseProvider,
      Provider<ActualizarUsuarioUseCase> actualizarUsuarioUseCaseProvider,
      Provider<EliminarUsuarioUseCase> eliminarUsuarioUseCaseProvider,
      Provider<ActualizarContrasenaUseCase> actualizarContrasenaUseCaseProvider,
      Provider<ObtenerUsuarioActualUseCase> obtenerUsuarioActualUseCaseProvider,
      Provider<ActualizarTemaUseCase> actualizarTemaUseCaseProvider,
      Provider<ActualizarNotificacionesUseCase> actualizarNotificacionesUseCaseProvider) {
    this.obtenerTodosLosUsuariosUseCaseProvider = obtenerTodosLosUsuariosUseCaseProvider;
    this.obtenerUsuarioPorIdUseCaseProvider = obtenerUsuarioPorIdUseCaseProvider;
    this.actualizarUsuarioUseCaseProvider = actualizarUsuarioUseCaseProvider;
    this.eliminarUsuarioUseCaseProvider = eliminarUsuarioUseCaseProvider;
    this.actualizarContrasenaUseCaseProvider = actualizarContrasenaUseCaseProvider;
    this.obtenerUsuarioActualUseCaseProvider = obtenerUsuarioActualUseCaseProvider;
    this.actualizarTemaUseCaseProvider = actualizarTemaUseCaseProvider;
    this.actualizarNotificacionesUseCaseProvider = actualizarNotificacionesUseCaseProvider;
  }

  @Override
  public AdminViewModel get() {
    return newInstance(obtenerTodosLosUsuariosUseCaseProvider.get(), obtenerUsuarioPorIdUseCaseProvider.get(), actualizarUsuarioUseCaseProvider.get(), eliminarUsuarioUseCaseProvider.get(), actualizarContrasenaUseCaseProvider.get(), obtenerUsuarioActualUseCaseProvider.get(), actualizarTemaUseCaseProvider.get(), actualizarNotificacionesUseCaseProvider.get());
  }

  public static AdminViewModel_Factory create(
      Provider<ObtenerTodosLosUsuariosUseCase> obtenerTodosLosUsuariosUseCaseProvider,
      Provider<ObtenerUsuarioPorIdUseCase> obtenerUsuarioPorIdUseCaseProvider,
      Provider<ActualizarUsuarioUseCase> actualizarUsuarioUseCaseProvider,
      Provider<EliminarUsuarioUseCase> eliminarUsuarioUseCaseProvider,
      Provider<ActualizarContrasenaUseCase> actualizarContrasenaUseCaseProvider,
      Provider<ObtenerUsuarioActualUseCase> obtenerUsuarioActualUseCaseProvider,
      Provider<ActualizarTemaUseCase> actualizarTemaUseCaseProvider,
      Provider<ActualizarNotificacionesUseCase> actualizarNotificacionesUseCaseProvider) {
    return new AdminViewModel_Factory(obtenerTodosLosUsuariosUseCaseProvider, obtenerUsuarioPorIdUseCaseProvider, actualizarUsuarioUseCaseProvider, eliminarUsuarioUseCaseProvider, actualizarContrasenaUseCaseProvider, obtenerUsuarioActualUseCaseProvider, actualizarTemaUseCaseProvider, actualizarNotificacionesUseCaseProvider);
  }

  public static AdminViewModel newInstance(
      ObtenerTodosLosUsuariosUseCase obtenerTodosLosUsuariosUseCase,
      ObtenerUsuarioPorIdUseCase obtenerUsuarioPorIdUseCase,
      ActualizarUsuarioUseCase actualizarUsuarioUseCase,
      EliminarUsuarioUseCase eliminarUsuarioUseCase,
      ActualizarContrasenaUseCase actualizarContrasenaUseCase,
      ObtenerUsuarioActualUseCase obtenerUsuarioActualUseCase,
      ActualizarTemaUseCase actualizarTemaUseCase,
      ActualizarNotificacionesUseCase actualizarNotificacionesUseCase) {
    return new AdminViewModel(obtenerTodosLosUsuariosUseCase, obtenerUsuarioPorIdUseCase, actualizarUsuarioUseCase, eliminarUsuarioUseCase, actualizarContrasenaUseCase, obtenerUsuarioActualUseCase, actualizarTemaUseCase, actualizarNotificacionesUseCase);
  }
}
