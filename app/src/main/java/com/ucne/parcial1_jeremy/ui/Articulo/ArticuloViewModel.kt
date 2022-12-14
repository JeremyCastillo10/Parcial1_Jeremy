package com.ucne.parcial1_jeremy.ui.Articulo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ucne.parcial1_jeremy.data.dao.ArticuloDao
import com.ucne.parcial1_jeremy.data.entity.Articulo
import com.ucne.parcial1_jeremy.repository.ArticuloRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ArticuloViewModel @Inject constructor(
    val repository: ArticuloRepository
):ViewModel() {
    /*var articuloId by mutableStateOf("")*/
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

    /*fun Update()
    {
        viewModelScope.launch {
            var encontrado : Boolean = false
            if(repository.Buscar(articuloId) == encontrado)
        }
    }*/

}