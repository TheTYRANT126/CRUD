package edu.itvo.persistenciadatos.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.data.local.database.AppDatabase;
import edu.itvo.persistenciadatos.data.local.database.ProductDao;
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
public final class DatabaseModule_ProvideProductDaoFactory implements Factory<ProductDao> {
  private final Provider<AppDatabase> databaseProvider;

  private DatabaseModule_ProvideProductDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ProductDao get() {
    return provideProductDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideProductDaoFactory create(
      Provider<AppDatabase> databaseProvider) {
    return new DatabaseModule_ProvideProductDaoFactory(databaseProvider);
  }

  public static ProductDao provideProductDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideProductDao(database));
  }
}
