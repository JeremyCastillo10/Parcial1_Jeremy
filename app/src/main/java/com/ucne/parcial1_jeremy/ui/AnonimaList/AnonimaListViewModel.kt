package com.ucne.parcial1_jeremy.ui.AnonimaList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.parcial1_jeremy.data.entity.Anonima
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class AnonimaListUiState(
    val anonima: List<Anonima> = emptyList(),
    val texto: String = "Meeting"
)

@HiltViewModel
class AnonimaListViewModel @Inject constructor(

) : ViewModel() {

    private val _uiState = MutableStateFlow(AnonimaListUiState())
    val uiState: StateFlow<AnonimaListUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {

        }
    }
}
