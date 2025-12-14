package edu.itvo.persistenciadatos.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.persistenciadatos.domain.usecase.GetUserPreferencesUseCase;
import edu.itvo.persistenciadatos.domain.usecase.GetUserUseCase;
import edu.itvo.persistenciadatos.domain.usecase.IsUserLoggedInUseCase;
import edu.itvo.persistenciadatos.domain.usecase.LoginUseCase;
import edu.itvo.persistenciadatos.domain.usecase.LogoutUseCase;
import edu.itvo.persistenciadatos.domain.usecase.UpdateThemeUseCase;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<GetUserUseCase> getUserUseCaseProvider;

  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<LogoutUseCase> logoutUseCaseProvider;

  private final Provider<UpdateThemeUseCase> updateThemeUseCaseProvider;

  private final Provider<GetUserPreferencesUseCase> getUserPreferencesUseCaseProvider;

  private final Provider<IsUserLoggedInUseCase> isUserLoggedInUseCaseProvider;

  private MainViewModel_Factory(Provider<GetUserUseCase> getUserUseCaseProvider,
      Provider<LoginUseCase> loginUseCaseProvider, Provider<LogoutUseCase> logoutUseCaseProvider,
      Provider<UpdateThemeUseCase> updateThemeUseCaseProvider,
      Provider<GetUserPreferencesUseCase> getUserPreferencesUseCaseProvider,
      Provider<IsUserLoggedInUseCase> isUserLoggedInUseCaseProvider) {
    this.getUserUseCaseProvider = getUserUseCaseProvider;
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.logoutUseCaseProvider = logoutUseCaseProvider;
    this.updateThemeUseCaseProvider = updateThemeUseCaseProvider;
    this.getUserPreferencesUseCaseProvider = getUserPreferencesUseCaseProvider;
    this.isUserLoggedInUseCaseProvider = isUserLoggedInUseCaseProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(getUserUseCaseProvider.get(), loginUseCaseProvider.get(), logoutUseCaseProvider.get(), updateThemeUseCaseProvider.get(), getUserPreferencesUseCaseProvider.get(), isUserLoggedInUseCaseProvider.get());
  }

  public static MainViewModel_Factory create(Provider<GetUserUseCase> getUserUseCaseProvider,
      Provider<LoginUseCase> loginUseCaseProvider, Provider<LogoutUseCase> logoutUseCaseProvider,
      Provider<UpdateThemeUseCase> updateThemeUseCaseProvider,
      Provider<GetUserPreferencesUseCase> getUserPreferencesUseCaseProvider,
      Provider<IsUserLoggedInUseCase> isUserLoggedInUseCaseProvider) {
    return new MainViewModel_Factory(getUserUseCaseProvider, loginUseCaseProvider, logoutUseCaseProvider, updateThemeUseCaseProvider, getUserPreferencesUseCaseProvider, isUserLoggedInUseCaseProvider);
  }

  public static MainViewModel newInstance(GetUserUseCase getUserUseCase, LoginUseCase loginUseCase,
      LogoutUseCase logoutUseCase, UpdateThemeUseCase updateThemeUseCase,
      GetUserPreferencesUseCase getUserPreferencesUseCase,
      IsUserLoggedInUseCase isUserLoggedInUseCase) {
    return new MainViewModel(getUserUseCase, loginUseCase, logoutUseCase, updateThemeUseCase, getUserPreferencesUseCase, isUserLoggedInUseCase);
  }
}
