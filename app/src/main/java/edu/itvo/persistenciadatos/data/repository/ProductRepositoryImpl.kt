package edu.itvo.persistenciadatos.data.repository

import edu.itvo.persistenciadatos.data.local.database.ProductDao
import edu.itvo.persistenciadatos.data.local.database.ProductEntity
import edu.itvo.persistenciadatos.domain.model.Product
import edu.itvo.persistenciadatos.domain.repository.ProductRepository
import edu.itvo.persistenciadatos.domain.repository.ResultadoProducto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productDao: ProductDao
) : ProductRepository {

    // ===== CRUD DE PRODUCTOS =====

    override fun obtenerTodosLosProductos(): Flow<List<Product>> {
        return productDao.obtenerTodosLosProductos().map { entities ->
            entities.map { it.toProduct() }
        }
    }

    override suspend fun obtenerProductoPorId(productId: Int): Product? {
        return try {
            productDao.obtenerProductoPorId(productId)?.toProduct()
        } catch (e: Exception) {
            null
        }
    }

    override suspend fun crearProducto(
        nombre: String,
        descripcion: String,
        precio: Double,
        ingredientes: String
    ): ResultadoProducto {
        return try {
            // Verificar si el nombre ya existe
            if (productDao.obtenerProductoPorNombre(nombre) != null) {
                return ResultadoProducto.Error("Ya existe un producto con este nombre")
            }

            // Validar nombre
            if (nombre.isBlank()) {
                return ResultadoProducto.Error("El nombre no puede estar vacío")
            }

            // Validar descripción
            if (descripcion.isBlank()) {
                return ResultadoProducto.Error("La descripción no puede estar vacía")
            }

            // Validar precio
            if (precio <= 0) {
                return ResultadoProducto.Error("El precio debe ser mayor a 0")
            }

            // Validar ingredientes
            if (ingredientes.isBlank()) {
                return ResultadoProducto.Error("Debe especificar los ingredientes")
            }

            // Crear producto
            val nuevoProducto = ProductEntity(
                nombre = nombre,
                descripcion = descripcion,
                precio = precio,
                ingredientes = ingredientes
            )

            productDao.insertarProducto(nuevoProducto)
            ResultadoProducto.Exito
        } catch (e: Exception) {
            ResultadoProducto.Error("Error al crear producto: ${e.message}")
        }
    }

    override suspend fun actualizarProducto(producto: Product): Boolean {
        return try {
            // Validar nombre
            if (producto.nombre.isBlank()) {
                return false
            }

            // Validar descripción
            if (producto.descripcion.isBlank()) {
                return false
            }

            // Validar precio
            if (producto.precio <= 0) {
                return false
            }

            // Validar ingredientes
            if (producto.ingredientes.isBlank()) {
                return false
            }

            // Verificar si el nombre ya existe en otro producto
            val productoConNombre = productDao.obtenerProductoPorNombre(producto.nombre)
            if (productoConNombre != null && productoConNombre.id != producto.id) {
                return false
            }

            // Actualizar producto
            val productoActualizado = ProductEntity(
                id = producto.id,
                nombre = producto.nombre,
                descripcion = producto.descripcion,
                precio = producto.precio,
                ingredientes = producto.ingredientes
            )

            productDao.actualizarProducto(productoActualizado)
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun eliminarProducto(productId: Int): Boolean {
        return try {
            productDao.eliminarProductoPorId(productId)
            true
        } catch (e: Exception) {
            false
        }
    }

    // ===== VALIDACIONES =====

    override suspend fun existeNombreProducto(nombre: String): Boolean {
        return try {
            productDao.obtenerProductoPorNombre(nombre) != null
        } catch (e: Exception) {
            false
        }
    }

    // ===== MAPPERS =====

    private fun ProductEntity.toProduct(): Product {
        return Product(
            id = this.id,
            nombre = this.nombre,
            descripcion = this.descripcion,
            precio = this.precio,
            ingredientes = this.ingredientes
        )
    }
}
