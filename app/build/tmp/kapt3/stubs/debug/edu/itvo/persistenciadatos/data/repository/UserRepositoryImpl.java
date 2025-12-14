package edu.itvo.persistenciadatos.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160%0$H\u0016J\u0010\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160$H\u0016J\u0018\u0010\'\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u001bJ.\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010,J\f\u0010-\u001a\u00020\u0016*\u00020.H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Ledu/itvo/persistenciadatos/data/repository/UserRepositoryImpl;", "Ledu/itvo/persistenciadatos/domain/repository/UserRepository;", "userDao", "Ledu/itvo/persistenciadatos/data/local/database/UserDao;", "(Ledu/itvo/persistenciadatos/data/local/database/UserDao;)V", "actualizarContrasena", "", "userId", "", "contrasenaActual", "", "contrasenaNueva", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actualizarNotificaciones", "", "activadas", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actualizarTema", "tema", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actualizarUsuario", "usuario", "Ledu/itvo/persistenciadatos/domain/model/User;", "(Ledu/itvo/persistenciadatos/domain/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cerrarSesion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eliminarUsuario", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existeEmail", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUsuario", "Ledu/itvo/persistenciadatos/domain/repository/ResultadoLogin;", "contrasena", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtenerTodosLosUsuarios", "Lkotlinx/coroutines/flow/Flow;", "", "obtenerUsuarioLogueado", "obtenerUsuarioPorId", "registrarUsuario", "Ledu/itvo/persistenciadatos/domain/repository/ResultadoRegistro;", "nombre", "esAdmin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toUser", "Ledu/itvo/persistenciadatos/data/local/database/UserEntity;", "app_debug"})
public final class UserRepositoryImpl implements edu.itvo.persistenciadatos.domain.repository.UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.data.local.database.UserDao userDao = null;
    
    @javax.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.data.local.database.UserDao userDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object registrarUsuario(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena, boolean esAdmin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.repository.ResultadoRegistro> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object loginUsuario(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.repository.ResultadoLogin> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object cerrarSesion(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<edu.itvo.persistenciadatos.domain.model.User> obtenerUsuarioLogueado() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<edu.itvo.persistenciadatos.domain.model.User>> obtenerTodosLosUsuarios() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object obtenerUsuarioPorId(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object actualizarUsuario(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.model.User usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object eliminarUsuario(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object actualizarTema(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String tema, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object actualizarNotificaciones(int userId, boolean activadas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object actualizarContrasena(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasenaActual, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasenaNueva, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object existeEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final edu.itvo.persistenciadatos.domain.model.User toUser(edu.itvo.persistenciadatos.data.local.database.UserEntity $this$toUser) {
        return null;
    }
}