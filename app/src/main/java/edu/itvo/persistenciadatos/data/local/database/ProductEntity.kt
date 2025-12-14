package edu.itvo.persistenciadatos.data.local.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Index

@Entity(
    tableName = "productos",
    indices = [Index(value = ["nombre"], unique = true)]
)
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val ingredientes: String,
    val fechaCaducidad: String
)
