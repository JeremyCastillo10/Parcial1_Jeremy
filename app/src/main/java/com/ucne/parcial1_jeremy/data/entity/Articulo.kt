package com.ucne.parcial1_jeremy.data.entity

import androidx.room.Entity
import  androidx.room.PrimaryKey

@Entity(tableName = "Anonimas")
data class Articulo (
    @PrimaryKey(autoGenerate = true)
    val ArticuloId: Int = 0,
    val descripcion: String = "",
    val marca: String = "",
    val existencia: Double = 0.0,

    )