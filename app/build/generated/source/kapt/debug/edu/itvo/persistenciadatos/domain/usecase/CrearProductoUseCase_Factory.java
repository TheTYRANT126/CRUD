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
public final class CrearProductoUseCase_Factory implements Factory<CrearProductoUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  private CrearProductoUseCase_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public CrearProductoUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static CrearProductoUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new CrearProductoUseCase_Factory(productRepositoryProvider);
  }

  public static CrearProductoUseCase newInstance(ProductRepository productRepository) {
    return new CrearProductoUseCase(productRepository);
  }
}
