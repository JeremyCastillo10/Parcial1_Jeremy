package com.ucne.parcial1_jeremy.data.dao

import androidx.room.*
import com.ucne.parcial1_jeremy.data.entity.Articulo
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticuloDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertararticulo(articulo: Articulo)

    @Update
    suspend fun updatearticulo(articulo: Articulo)

    @Delete
    suspend fun deletearticulo(articulo: Articulo)

    @Query("SELECT * FROM Articulos WHERE articuloId = :articuloId")
    suspend fun find(articuloId: Int):Articulo

    @Query("SELECT * FROM Articulos")
    fun getList(): Flow<List<Articulo>>
}