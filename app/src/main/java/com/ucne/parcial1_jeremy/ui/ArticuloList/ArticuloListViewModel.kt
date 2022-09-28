package com.ucne.parcial1_jeremy.ui.ArticuloList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.parcial1_jeremy.data.entity.Articulo
import com.ucne.parcial1_jeremy.repository.ArticuloRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ArticuloListUiState(
    val articulo: List<Articulo> = emptyList(),
    val texto: String = "Meeting"
)

@HiltViewModel
class ArticuloListViewModel @Inject constructor(
    val repository: ArticuloRepository

) : ViewModel() {

    private val _uiState = MutableStateFlow(ArticuloListUiState())
    val uiState: StateFlow<ArticuloListUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            repository.GetList().collect{list->
                _uiState.update {
                    it.copy(articulo = list)
                }
            }

        }
    }
}
