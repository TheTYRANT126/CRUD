package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.ProductRepository
import edu.itvo.persistenciadatos.domain.repository.ResultadoProducto
import javax.inject.Inject

class CrearProductoUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(
        nombre: String,
        descripcion: String,
        precio: Double,
        ingredientes: String
    ): ResultadoProducto {
        return productRepository.crearProducto(nombre, descripcion, precio, ingredientes)
    }
}
