package edu.itvo.persistenciadatos.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.itvo.persistenciadatos.domain.model.Product
import edu.itvo.persistenciadatos.domain.repository.ResultadoProducto
import edu.itvo.persistenciadatos.domain.usecase.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class ProductUiState {
    object Idle : ProductUiState()
    object Loading : ProductUiState()
    data class Success(val mensaje: String) : ProductUiState()
    data class Error(val mensaje: String) : ProductUiState()
}

@HiltViewModel
class ProductViewModel @Inject constructor(
    obtenerTodosLosProductosUseCase: ObtenerTodosLosProductosUseCase,
    private val obtenerProductoPorIdUseCase: ObtenerProductoPorIdUseCase,
    private val crearProductoUseCase: CrearProductoUseCase,
    private val actualizarProductoUseCase: ActualizarProductoUseCase,
    private val eliminarProductoUseCase: EliminarProductoUseCase
) : ViewModel() {

    private val _productUiState = MutableStateFlow<ProductUiState>(ProductUiState.Idle)
    val productUiState: StateFlow<ProductUiState> = _productUiState.asStateFlow()

    // Lista de todos los productos
    val todosLosProductos: StateFlow<List<Product>> = obtenerTodosLosProductosUseCase()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun obtenerProductoPorId(productId: Int, onResult: (Product?) -> Unit) {
        viewModelScope.launch {
            val producto = obtenerProductoPorIdUseCase(productId)
            onResult(producto)
        }
    }

    fun crearProducto(nombre: String, descripcion: String, precio: Double, ingredientes: String) {
        viewModelScope.launch {
            _productUiState.value = ProductUiState.Loading

            val resultado = crearProductoUseCase(nombre, descripcion, precio, ingredientes)
            _productUiState.value = when (resultado) {
                is ResultadoProducto.Exito -> ProductUiState.Success("Producto creado exitosamente")
                is ResultadoProducto.Error -> ProductUiState.Error(resultado.mensaje)
            }
        }
    }

    fun actualizarProducto(producto: Product) {
        viewModelScope.launch {
            _productUiState.value = ProductUiState.Loading

            val resultado = actualizarProductoUseCase(producto)
            if (resultado) {
                _productUiState.value = ProductUiState.Success("Producto actualizado exitosamente")
            } else {
                _productUiState.value = ProductUiState.Error("Error al actualizar producto")
            }
        }
    }

    fun eliminarProducto(productId: Int) {
        viewModelScope.launch {
            _productUiState.value = ProductUiState.Loading

            val resultado = eliminarProductoUseCase(productId)
            if (resultado) {
                _productUiState.value = ProductUiState.Success("Producto eliminado exitosamente")
            } else {
                _productUiState.value = ProductUiState.Error("Error al eliminar producto")
            }
        }
    }

    fun resetState() {
        _productUiState.value = ProductUiState.Idle
    }
}
