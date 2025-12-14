package edu.itvo.persistenciadatos.data.local.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\u0014H\'\u00a8\u0006\u0016"}, d2 = {"Ledu/itvo/persistenciadatos/data/local/database/ProductDao;", "", "actualizarProducto", "", "producto", "Ledu/itvo/persistenciadatos/data/local/database/ProductEntity;", "(Ledu/itvo/persistenciadatos/data/local/database/ProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eliminarProducto", "eliminarProductoPorId", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertarProducto", "", "obtenerProductoPorId", "obtenerProductoPorNombre", "nombre", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtenerTodosLosProductos", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
@androidx.room.Dao()
public abstract interface ProductDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertarProducto(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.data.local.database.ProductEntity producto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarProducto(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.data.local.database.ProductEntity producto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object eliminarProducto(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.data.local.database.ProductEntity producto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM productos WHERE id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object obtenerProductoPorId(int productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.data.local.database.ProductEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM productos ORDER BY nombre ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<edu.itvo.persistenciadatos.data.local.database.ProductEntity>> obtenerTodosLosProductos();
    
    @androidx.room.Query(value = "SELECT * FROM productos WHERE nombre = :nombre LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object obtenerProductoPorNombre(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.data.local.database.ProductEntity> $completion);
    
    @androidx.room.Query(value = "DELETE FROM productos WHERE id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object eliminarProductoPorId(int productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}