package edu.itvo.persistenciadatos.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001d0\u001cH\u0016J\f\u0010\u001e\u001a\u00020\b*\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Ledu/itvo/persistenciadatos/data/repository/ProductRepositoryImpl;", "Ledu/itvo/persistenciadatos/domain/repository/ProductRepository;", "productDao", "Ledu/itvo/persistenciadatos/data/local/database/ProductDao;", "(Ledu/itvo/persistenciadatos/data/local/database/ProductDao;)V", "actualizarProducto", "", "producto", "Ledu/itvo/persistenciadatos/domain/model/Product;", "(Ledu/itvo/persistenciadatos/domain/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crearProducto", "Ledu/itvo/persistenciadatos/domain/repository/ResultadoProducto;", "nombre", "", "descripcion", "precio", "", "ingredientes", "fechaCaducidad", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eliminarProducto", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existeNombreProducto", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtenerProductoPorId", "obtenerTodosLosProductos", "Lkotlinx/coroutines/flow/Flow;", "", "toProduct", "Ledu/itvo/persistenciadatos/data/local/database/ProductEntity;", "app_debug"})
public final class ProductRepositoryImpl implements edu.itvo.persistenciadatos.domain.repository.ProductRepository {
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.data.local.database.ProductDao productDao = null;
    
    @javax.inject.Inject()
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.data.local.database.ProductDao productDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<edu.itvo.persistenciadatos.domain.model.Product>> obtenerTodosLosProductos() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object obtenerProductoPorId(int productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.model.Product> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object crearProducto(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, double precio, @org.jetbrains.annotations.NotNull()
    java.lang.String ingredientes, @org.jetbrains.annotations.NotNull()
    java.lang.String fechaCaducidad, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.repository.ResultadoProducto> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object actualizarProducto(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.model.Product producto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object eliminarProducto(int productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object existeNombreProducto(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final edu.itvo.persistenciadatos.domain.model.Product toProduct(edu.itvo.persistenciadatos.data.local.database.ProductEntity $this$toProduct) {
        return null;
    }
}