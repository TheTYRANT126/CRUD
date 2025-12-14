package edu.itvo.persistenciadatos.domain.repository

import edu.itvo.persistenciadatos.domain.model.Product
import kotlinx.coroutines.flow.Flow

sealed class ResultadoProducto {
    object Exito : ResultadoProducto()
    data class Error(val mensaje: String) : ResultadoProducto()
}

interface ProductRepository {
    // CRUD de productos
    fun obtenerTodosLosProductos(): Flow<List<Product>>
    suspend fun obtenerProductoPorId(productId: Int): Product?
    suspend fun crearProducto(
        nombre: String,
        descripcion: String,
        precio: Double,
        ingredientes: String,
        fechaCaducidad: String
    ): ResultadoProducto
    suspend fun actualizarProducto(producto: Product): Boolean
    suspend fun eliminarProducto(productId: Int): Boolean

    // Validaciones
    suspend fun existeNombreProducto(nombre: String): Boolean
}
