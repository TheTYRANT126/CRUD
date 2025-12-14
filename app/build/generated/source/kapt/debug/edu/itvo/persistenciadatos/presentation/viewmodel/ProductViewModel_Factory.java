package edu.itvo.persistenciadatos.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarProductoUseCase;
import edu.itvo.persistenciadatos.domain.usecase.CrearProductoUseCase;
import edu.itvo.persistenciadatos.domain.usecase.EliminarProductoUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerProductoPorIdUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerTodosLosProductosUseCase;
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
public final class ProductViewModel_Factory implements Factory<ProductViewModel> {
  private final Provider<ObtenerTodosLosProductosUseCase> obtenerTodosLosProductosUseCaseProvider;

  private final Provider<ObtenerProductoPorIdUseCase> obtenerProductoPorIdUseCaseProvider;

  private final Provider<CrearProductoUseCase> crearProductoUseCaseProvider;

  private final Provider<ActualizarProductoUseCase> actualizarProductoUseCaseProvider;

  private final Provider<EliminarProductoUseCase> eliminarProductoUseCaseProvider;

  private ProductViewModel_Factory(
      Provider<ObtenerTodosLosProductosUseCase> obtenerTodosLosProductosUseCaseProvider,
      Provider<ObtenerProductoPorIdUseCase> obtenerProductoPorIdUseCaseProvider,
      Provider<CrearProductoUseCase> crearProductoUseCaseProvider,
      Provider<ActualizarProductoUseCase> actualizarProductoUseCaseProvider,
      Provider<EliminarProductoUseCase> eliminarProductoUseCaseProvider) {
    this.obtenerTodosLosProductosUseCaseProvider = obtenerTodosLosProductosUseCaseProvider;
    this.obtenerProductoPorIdUseCaseProvider = obtenerProductoPorIdUseCaseProvider;
    this.crearProductoUseCaseProvider = crearProductoUseCaseProvider;
    this.actualizarProductoUseCaseProvider = actualizarProductoUseCaseProvider;
    this.eliminarProductoUseCaseProvider = eliminarProductoUseCaseProvider;
  }

  @Override
  public ProductViewModel get() {
    return newInstance(obtenerTodosLosProductosUseCaseProvider.get(), obtenerProductoPorIdUseCaseProvider.get(), crearProductoUseCaseProvider.get(), actualizarProductoUseCaseProvider.get(), eliminarProductoUseCaseProvider.get());
  }

  public static ProductViewModel_Factory create(
      Provider<ObtenerTodosLosProductosUseCase> obtenerTodosLosProductosUseCaseProvider,
      Provider<ObtenerProductoPorIdUseCase> obtenerProductoPorIdUseCaseProvider,
      Provider<CrearProductoUseCase> crearProductoUseCaseProvider,
      Provider<ActualizarProductoUseCase> actualizarProductoUseCaseProvider,
      Provider<EliminarProductoUseCase> eliminarProductoUseCaseProvider) {
    return new ProductViewModel_Factory(obtenerTodosLosProductosUseCaseProvider, obtenerProductoPorIdUseCaseProvider, crearProductoUseCaseProvider, actualizarProductoUseCaseProvider, eliminarProductoUseCaseProvider);
  }

  public static ProductViewModel newInstance(
      ObtenerTodosLosProductosUseCase obtenerTodosLosProductosUseCase,
      ObtenerProductoPorIdUseCase obtenerProductoPorIdUseCase,
      CrearProductoUseCase crearProductoUseCase,
      ActualizarProductoUseCase actualizarProductoUseCase,
      EliminarProductoUseCase eliminarProductoUseCase) {
    return new ProductViewModel(obtenerTodosLosProductosUseCase, obtenerProductoPorIdUseCase, crearProductoUseCase, actualizarProductoUseCase, eliminarProductoUseCase);
  }
}
