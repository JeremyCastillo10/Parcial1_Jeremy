package com.ucne.parcial1_jeremy.ui.Anonima

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.parcial1_jeremy.data.entity.Articulo
import com.ucne.parcial1_jeremy.repository.ArticuloRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class ArticuloViewModel @Inject constructor(
    val repository: ArticuloRepository
):ViewModel() {
    var descripcion by mutableStateOf("")
    var marca by mutableStateOf("")
    var existencia by mutableStateOf("")

    fun Save()
    {
        viewModelScope.launch {
            repository.InsertarArticulo(
                Articulo(
                    descripcion = descripcion,
                    marca = marca,
                    existencia = existencia.toDouble()
                )
            )
        }
    }

}