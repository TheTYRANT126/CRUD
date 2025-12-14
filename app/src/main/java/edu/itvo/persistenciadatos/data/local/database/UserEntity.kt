package edu.itvo.persistenciadatos.data.local.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Index

@Entity(
    tableName = "usuarios",
    indices = [Index(value = ["email"], unique = true)]
)
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val email: String,
    val passwordHash: String,
    val esAdmin: Boolean = false,
    val temaActual: String = "system",
    val notificacionesActivadas: Boolean = true,
    val estaLogueado: Boolean = false
)
