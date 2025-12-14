package edu.itvo.persistenciadatos.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016J&\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$J$\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00190\'J\u0006\u0010(\u001a\u00020\u0019R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006)"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "obtenerTodosLosProductosUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/ObtenerTodosLosProductosUseCase;", "obtenerProductoPorIdUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/ObtenerProductoPorIdUseCase;", "crearProductoUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/CrearProductoUseCase;", "actualizarProductoUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/ActualizarProductoUseCase;", "eliminarProductoUseCase", "Ledu/itvo/persistenciadatos/domain/usecase/EliminarProductoUseCase;", "(Ledu/itvo/persistenciadatos/domain/usecase/ObtenerTodosLosProductosUseCase;Ledu/itvo/persistenciadatos/domain/usecase/ObtenerProductoPorIdUseCase;Ledu/itvo/persistenciadatos/domain/usecase/CrearProductoUseCase;Ledu/itvo/persistenciadatos/domain/usecase/ActualizarProductoUseCase;Ledu/itvo/persistenciadatos/domain/usecase/EliminarProductoUseCase;)V", "_productUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/ProductUiState;", "productUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getProductUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "todosLosProductos", "", "Ledu/itvo/persistenciadatos/domain/model/Product;", "getTodosLosProductos", "actualizarProducto", "", "producto", "crearProducto", "nombre", "", "descripcion", "precio", "", "ingredientes", "eliminarProducto", "productId", "", "obtenerProductoPorId", "onResult", "Lkotlin/Function1;", "resetState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.ObtenerProductoPorIdUseCase obtenerProductoPorIdUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.CrearProductoUseCase crearProductoUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.ActualizarProductoUseCase actualizarProductoUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.usecase.EliminarProductoUseCase eliminarProductoUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<edu.itvo.persistenciadatos.presentation.viewmodel.ProductUiState> _productUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<edu.itvo.persistenciadatos.presentation.viewmodel.ProductUiState> productUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<edu.itvo.persistenciadatos.domain.model.Product>> todosLosProductos = null;
    
    @javax.inject.Inject()
    public ProductViewModel(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.ObtenerTodosLosProductosUseCase obtenerTodosLosProductosUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.ObtenerProductoPorIdUseCase obtenerProductoPorIdUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.CrearProductoUseCase crearProductoUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.ActualizarProductoUseCase actualizarProductoUseCase, @org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.usecase.EliminarProductoUseCase eliminarProductoUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<edu.itvo.persistenciadatos.presentation.viewmodel.ProductUiState> getProductUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<edu.itvo.persistenciadatos.domain.model.Product>> getTodosLosProductos() {
        return null;
    }
    
    public final void obtenerProductoPorId(int productId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super edu.itvo.persistenciadatos.domain.model.Product, kotlin.Unit> onResult) {
    }
    
    public final void crearProducto(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, double precio, @org.jetbrains.annotations.NotNull()
    java.lang.String ingredientes) {
    }
    
    public final void actualizarProducto(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.model.Product producto) {
    }
    
    public final void eliminarProducto(int productId) {
    }
    
    public final void resetState() {
    }
}