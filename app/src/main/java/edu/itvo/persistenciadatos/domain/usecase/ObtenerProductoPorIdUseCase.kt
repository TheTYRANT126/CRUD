package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.model.Product
import edu.itvo.persistenciadatos.domain.repository.ProductRepository
import javax.inject.Inject

class ObtenerProductoPorIdUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(productId: Int): Product? {
        return productRepository.obtenerProductoPorId(productId)
    }
}
