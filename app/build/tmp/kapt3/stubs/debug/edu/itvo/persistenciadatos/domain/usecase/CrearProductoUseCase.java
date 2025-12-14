package edu.itvo.persistenciadatos.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0086B\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ledu/itvo/persistenciadatos/domain/usecase/CrearProductoUseCase;", "", "productRepository", "Ledu/itvo/persistenciadatos/domain/repository/ProductRepository;", "(Ledu/itvo/persistenciadatos/domain/repository/ProductRepository;)V", "invoke", "Ledu/itvo/persistenciadatos/domain/repository/ResultadoProducto;", "nombre", "", "descripcion", "precio", "", "ingredientes", "fechaCaducidad", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CrearProductoUseCase {
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.repository.ProductRepository productRepository = null;
    
    @javax.inject.Inject()
    public CrearProductoUseCase(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, double precio, @org.jetbrains.annotations.NotNull()
    java.lang.String ingredientes, @org.jetbrains.annotations.NotNull()
    java.lang.String fechaCaducidad, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super edu.itvo.persistenciadatos.domain.repository.ResultadoProducto> $completion) {
        return null;
    }
}