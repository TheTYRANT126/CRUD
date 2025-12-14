package edu.itvo.persistenciadatos.data.local.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarProducto(producto: ProductEntity): Long

    @Update
    suspend fun actualizarProducto(producto: ProductEntity)

    @Delete
    suspend fun eliminarProducto(producto: ProductEntity)

    @Query("SELECT * FROM productos WHERE id = :productId")
    suspend fun obtenerProductoPorId(productId: Int): ProductEntity?

    @Query("SELECT * FROM productos ORDER BY nombre ASC")
    fun obtenerTodosLosProductos(): Flow<List<ProductEntity>>

    @Query("SELECT * FROM productos WHERE nombre = :nombre LIMIT 1")
    suspend fun obtenerProductoPorNombre(nombre: String): ProductEntity?

    @Query("DELETE FROM productos WHERE id = :productId")
    suspend fun eliminarProductoPorId(productId: Int)
}
