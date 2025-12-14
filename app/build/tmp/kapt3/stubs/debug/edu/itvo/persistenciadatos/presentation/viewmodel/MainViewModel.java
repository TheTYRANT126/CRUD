package edu.itvo.persistenciadatos.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getUserUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/GetUserUseCase;", "loginUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/LoginUseCase;", "logoutUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/LogoutUseCase;", "updateThemeUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/UpdateThemeUseCase;", "getUserPreferencesUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/GetUserPreferencesUseCase;", "isUserLoggedInUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/IsUserLoggedInUseCase;", "(Ledu/itvo/persistenciadatos/domain/usecase/GetUserUseCase;Ledu/itvo/persistenciadatos/domain/usecase/LoginUseCase;Ledu/itvo/persistenciadatos/domain/usecase/LogoutUseCase;Ledu/itvo/persistenciadatos/domain/usecase/UpdateThemeUseCase;Ledu/itvo/persistenciadatos/domain/usecase/GetUserPreferencesUseCase;Ledu/itvo/persistenciadatos/domain/usecase/IsUserLoggedInUseCase;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/UserUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "login", "", "email", "", "contrasena", "logout", "toggleNotifications", "enabled", "", "updateTheme", "theme", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.GetUserUseCase getUserUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.LogoutUseCase logoutUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.UpdateThemeUseCase updateThemeUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<edu.itvo.persistenciadatos.presentation.viewmodel.UserUiState> uiState = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.GetUserUseCase getUserUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.LogoutUseCase logoutUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.UpdateThemeUseCase updateThemeUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.GetUserPreferencesUseCase getUserPreferencesUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.IsUserLoggedInUseCase isUserLoggedInUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<edu.itvo.persistenciadatos.presentation.viewmodel.UserUiState> getUiState() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena) {
    }
    
    public final void logout() {
    }
    
    public final void updateTheme(@org.jetbrains.annotations.NotNull()
    java.lang.String theme) {
    }
    
    public final void toggleNotifications(boolean enabled) {
    }
}