package edu.itvo.persistenciadatos.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001a0\u0019H&\u00a8\u0006\u001b"}, d2 = {"Ledu/itvo/persistenciadatos/domain/repository/ProductRepository;", "", "actualizarProducto", "", "producto", "Ledu/itvo/persistenciadatos/domain/model/Product;", "(Ledu/itvo/persistenciadatos/domain/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crearProducto", "Ledu/itvo/persistenciadatos/domain/repository/ResultadoProducto;", "nombre", "", "descripcion", "precio", "", "ingredientes", "fechaCaducidad", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eliminarProducto", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existeNombreProducto", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtenerProductoPorId", "obtenerTodosLosProductos", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public abstract interface ProductRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<edu.itvo.persistenciadatos.domain.model.Product>> obtenerTodosLosProductos();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object obtenerProductoPorId(int productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.model.Product> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object crearProducto(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, double precio, @org.jetbrains.annotations.NotNull()
    java.lang.String ingredientes, @org.jetbrains.annotations.NotNull()
    java.lang.String fechaCaducidad, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.repository.ResultadoProducto> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarProducto(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.model.Product producto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object eliminarProducto(int productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object existeNombreProducto(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}