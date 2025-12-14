package edu.itvo.persistenciadatos.domain.model

data class Product(
    val id: Int = 0,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val ingredientes: String,
    val fechaCaducidad: String
)
