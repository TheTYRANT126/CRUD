package edu.itvo.persistenciadatos.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.data.local.database.ProductDao;
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
public final class ProductRepositoryImpl_Factory implements Factory<ProductRepositoryImpl> {
  private final Provider<ProductDao> productDaoProvider;

  private ProductRepositoryImpl_Factory(Provider<ProductDao> productDaoProvider) {
    this.productDaoProvider = productDaoProvider;
  }

  @Override
  public ProductRepositoryImpl get() {
    return newInstance(productDaoProvider.get());
  }

  public static ProductRepositoryImpl_Factory create(Provider<ProductDao> productDaoProvider) {
    return new ProductRepositoryImpl_Factory(productDaoProvider);
  }

  public static ProductRepositoryImpl newInstance(ProductDao productDao) {
    return new ProductRepositoryImpl(productDao);
  }
}
