package edu.itvo.persistenciadatos.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.data.local.database.UserDao;
import edu.itvo.persistenciadatos.domain.repository.UserRepository;
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
public final class DataModule_ProvideUserRepositoryFactory implements Factory<UserRepository> {
  private final Provider<UserDao> userDaoProvider;

  private DataModule_ProvideUserRepositoryFactory(Provider<UserDao> userDaoProvider) {
    this.userDaoProvider = userDaoProvider;
  }

  @Override
  public UserRepository get() {
    return provideUserRepository(userDaoProvider.get());
  }

  public static DataModule_ProvideUserRepositoryFactory create(Provider<UserDao> userDaoProvider) {
    return new DataModule_ProvideUserRepositoryFactory(userDaoProvider);
  }

  public static UserRepository provideUserRepository(UserDao userDao) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideUserRepository(userDao));
  }
}
