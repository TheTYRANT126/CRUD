package edu.itvo.persistenciadatos.domain.model

data class User(
    val id: Int = 0,
    val nombre: String,
    val email: String,
    val passwordHash: String,
    val esAdmin: Boolean = false,
    val temaActual: String = "system",
    val notificacionesActivadas: Boolean = true
)
