package edu.itvo.persistenciadatos.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J&\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011\u00a8\u0006 "}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "loginUsuarioUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/LoginUsuarioUseCase;", "registrarUsuarioUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/RegistrarUsuarioUseCase;", "cerrarSesionUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/CerrarSesionUseCase;", "obtenerUsuarioActualUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/ObtenerUsuarioActualUseCase;", "(Ledu/itvo/persistenciadatos/domain/usecase/LoginUsuarioUseCase;Ledu/itvo/persistenciadatos/domain/usecase/RegistrarUsuarioUseCase;Ledu/itvo/persistenciadatos/domain/usecase/CerrarSesionUseCase;Ledu/itvo/persistenciadatos/domain/usecase/ObtenerUsuarioActualUseCase;)V", "_authUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState;", "authUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getAuthUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "usuarioActual", "Ledu/itvo/persistenciadatos/domain/model/User;", "getUsuarioActual", "cerrarSesion", "", "login", "email", "", "contrasena", "registrar", "nombre", "esAdmin", "", "resetState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.LoginUsuarioUseCase loginUsuarioUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.RegistrarUsuarioUseCase registrarUsuarioUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.CerrarSesionUseCase cerrarSesionUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState> _authUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState> authUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<edu.itvo.persistenciadatos.domain.model.User> usuarioActual = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.LoginUsuarioUseCase loginUsuarioUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.RegistrarUsuarioUseCase registrarUsuarioUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.CerrarSesionUseCase cerrarSesionUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.ObtenerUsuarioActualUseCase obtenerUsuarioActualUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState> getAuthUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<edu.itvo.persistenciadatos.domain.model.User> getUsuarioActual() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena) {
    }
    
    public final void registrar(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena, boolean esAdmin) {
    }
    
    public final void cerrarSesion() {
    }
    
    public final void resetState() {
    }
}