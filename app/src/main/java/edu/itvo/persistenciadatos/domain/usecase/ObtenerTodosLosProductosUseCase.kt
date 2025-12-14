package edu.itvo.persistenciadatos.domain.usecase

import edu.itvo.persistenciadatos.domain.model.Product
import edu.itvo.persistenciadatos.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ObtenerTodosLosProductosUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    operator fun invoke(): Flow<List<Product>> {
        return productRepository.obtenerTodosLosProductos()
    }
}
