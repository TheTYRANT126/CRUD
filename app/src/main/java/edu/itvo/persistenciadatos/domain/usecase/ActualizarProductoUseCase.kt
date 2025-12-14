package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.model.Product
import edu.itvo.persistenciadatos.domain.repository.ProductRepository
import javax.inject.Inject

class ActualizarProductoUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(producto: Product): Boolean {
        return productRepository.actualizarProducto(producto)
    }
}
