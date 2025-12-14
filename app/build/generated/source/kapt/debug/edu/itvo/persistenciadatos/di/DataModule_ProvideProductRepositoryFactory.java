package edu.itvo.persistenciadatos.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.data.local.database.ProductDao;
import edu.itvo.persistenciadatos.domain.repository.ProductRepository;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DataModule_ProvideProductRepositoryFactory implements Factory<ProductRepository> {
  private final Provider<ProductDao> productDaoProvider;

  private DataModule_ProvideProductRepositoryFactory(Provider<ProductDao> productDaoProvider) {
    this.productDaoProvider = productDaoProvider;
  }

  @Override
  public ProductRepository get() {
    return provideProductRepository(productDaoProvider.get());
  }

  public static DataModule_ProvideProductRepositoryFactory create(
      Provider<ProductDao> productDaoProvider) {
    return new DataModule_ProvideProductRepositoryFactory(productDaoProvider);
  }

  public static ProductRepository provideProductRepository(ProductDao productDao) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideProductRepository(productDao));
  }
}
