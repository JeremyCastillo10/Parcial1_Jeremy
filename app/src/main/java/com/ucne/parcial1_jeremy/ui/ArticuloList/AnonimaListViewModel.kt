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

data class AnonimaListUiState(
    val articulo: List<Articulo> = emptyList(),
    val texto: String = "Meeting"
)

@HiltViewModel
class AnonimaListViewModel @Inject constructor(
    val repository: ArticuloRepository

) : ViewModel() {

    private val _uiState = MutableStateFlow(AnonimaListUiState())
    val uiState: StateFlow<AnonimaListUiState> = _uiState.asStateFlow()

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
