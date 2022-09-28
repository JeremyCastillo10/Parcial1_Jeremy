package com.ucne.parcial1_jeremy.repository

import com.ucne.parcial1_jeremy.data.AppDataBase
import com.ucne.parcial1_jeremy.data.entity.Articulo
import javax.inject.Inject

class ArticuloRepository @Inject constructor(
    val db: AppDataBase
) {
    suspend fun InsertarArticulo(articulo: Articulo){
        db.ArticuloDao.insertararticulo(articulo)
    }

    fun GetList() = db.ArticuloDao.getList()
}