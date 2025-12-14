package edu.itvo.persistenciadatos.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.domain.repository.ProductRepository;
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
public final class ObtenerProductoPorIdUseCase_Factory implements Factory<ObtenerProductoPorIdUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  private ObtenerProductoPorIdUseCase_Factory(
      Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public ObtenerProductoPorIdUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static ObtenerProductoPorIdUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new ObtenerProductoPorIdUseCase_Factory(productRepositoryProvider);
  }

  public static ObtenerProductoPorIdUseCase newInstance(ProductRepository productRepository) {
    return new ObtenerProductoPorIdUseCase(productRepository);
  }
}
