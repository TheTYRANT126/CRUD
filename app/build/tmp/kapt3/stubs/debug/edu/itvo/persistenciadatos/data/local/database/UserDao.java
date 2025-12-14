package edu.itvo.persistenciadatos.data.local.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130 0\u001fH\'J\u0010\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001fH\'J\u0018\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010$\u00a8\u0006%"}, d2 = {"Ledu/itvo/persistenciadatos/data/local/database/UserDao;", "", "actualizarContrasena", "", "userId", "", "nuevoHash", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actualizarEstadoLogin", "estaLogueado", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actualizarNotificaciones", "activadas", "actualizarTema", "tema", "actualizarUsuario", "usuario", "Ledu/itvo/persistenciadatos/data/local/database/UserEntity;", "(Ledu/itvo/persistenciadatos/data/local/database/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cerrarSesionTodos", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contarAdmins", "eliminarUsuario", "existeEmail", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertarUsuario", "", "obtenerTodosLosUsuarios", "Lkotlinx/coroutines/flow/Flow;", "", "obtenerUsuarioLogueado", "obtenerUsuarioPorEmail", "obtenerUsuarioPorId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = 3)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertarUsuario(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.data.local.database.UserEntity usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarUsuario(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.data.local.database.UserEntity usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object eliminarUsuario(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.data.local.database.UserEntity usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM usuarios WHERE email = :email LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object obtenerUsuarioPorEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.data.local.database.UserEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM usuarios WHERE estaLogueado = 1 LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<edu.itvo.persistenciadatos.data.local.database.UserEntity> obtenerUsuarioLogueado();
    
    @androidx.room.Query(value = "SELECT * FROM usuarios ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<edu.itvo.persistenciadatos.data.local.database.UserEntity>> obtenerTodosLosUsuarios();
    
    @androidx.room.Query(value = "SELECT * FROM usuarios WHERE id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object obtenerUsuarioPorId(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.data.local.database.UserEntity> $completion);
    
    @androidx.room.Query(value = "UPDATE usuarios SET estaLogueado = :estaLogueado WHERE id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarEstadoLogin(int userId, boolean estaLogueado, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE usuarios SET estaLogueado = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cerrarSesionTodos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE usuarios SET temaActual = :tema WHERE id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarTema(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String tema, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE usuarios SET notificacionesActivadas = :activadas WHERE id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarNotificaciones(int userId, boolean activadas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE usuarios SET passwordHash = :nuevoHash WHERE id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarContrasena(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String nuevoHash, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM usuarios WHERE email = :email")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object existeEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM usuarios WHERE esAdmin = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object contarAdmins(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}