package edu.itvo.persistenciadatos.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\"0!H&J\u0010\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130!H&J\u0018\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0018J.\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010)\u00a8\u0006*"}, d2 = {"Ledu/itvo/persistenciadatos/domain/repository/UserRepository;", "", "actualizarContrasena", "", "userId", "", "contrasenaActual", "", "contrasenaNueva", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actualizarNotificaciones", "", "activadas", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actualizarTema", "tema", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actualizarUsuario", "usuario", "Ledu/itvo/persistenciadatos/domain/model/User;", "(Ledu/itvo/persistenciadatos/domain/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cerrarSesion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eliminarUsuario", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existeEmail", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUsuario", "Ledu/itvo/persistenciadatos/domain/repository/ResultadoLogin;", "contrasena", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtenerTodosLosUsuarios", "Lkotlinx/coroutines/flow/Flow;", "", "obtenerUsuarioLogueado", "obtenerUsuarioPorId", "registrarUsuario", "Ledu/itvo/persistenciadatos/domain/repository/ResultadoRegistro;", "nombre", "esAdmin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registrarUsuario(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena, boolean esAdmin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.repository.ResultadoRegistro> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loginUsuario(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.repository.ResultadoLogin> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cerrarSesion(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<edu.itvo.persistenciadatos.domain.model.User> obtenerUsuarioLogueado();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<edu.itvo.persistenciadatos.domain.model.User>> obtenerTodosLosUsuarios();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object obtenerUsuarioPorId(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.model.User> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarUsuario(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.model.User usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object eliminarUsuario(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarTema(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String tema, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarNotificaciones(int userId, boolean activadas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarContrasena(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasenaActual, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasenaNueva, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object existeEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}