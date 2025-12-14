package edu.itvo.persistenciadatos.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086B\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ledu/itvo/persistenciadatos/domain/usecase/RegistrarUsuarioUseCase;", "", "userRepository", "Ledu/itvo/persistenciadatos/domain/repository/UserRepository;", "(Ledu/itvo/persistenciadatos/domain/repository/UserRepository;)V", "invoke", "Ledu/itvo/persistenciadatos/domain/repository/ResultadoRegistro;", "nombre", "", "email", "contrasena", "esAdmin", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RegistrarUsuarioUseCase {
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.repository.UserRepository userRepository = null;
    
    @javax.inject.Inject()
    public RegistrarUsuarioUseCase(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena, boolean esAdmin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.repository.ResultadoRegistro> $completion) {
        return null;
    }
}