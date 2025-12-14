package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.repository.ProductRepository
import javax.inject.Inject

class EliminarProductoUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(productId: Int): Boolean {
        return productRepository.eliminarProducto(productId)
    }
}
