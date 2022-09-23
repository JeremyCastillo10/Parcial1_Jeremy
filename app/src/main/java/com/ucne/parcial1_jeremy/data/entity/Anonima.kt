package com.ucne.parcial1_jeremy.data.entity

import androidx.room.Entity
import  androidx.room.PrimaryKey

@Entity(tableName = "Anonimas")
data class Anonima (
    @PrimaryKey(autoGenerate = true)
    val campoId: Int = 0,
    val campo1: String = "",
    val campo2: String = "",
    val campo3: Double = 0.0,

    )