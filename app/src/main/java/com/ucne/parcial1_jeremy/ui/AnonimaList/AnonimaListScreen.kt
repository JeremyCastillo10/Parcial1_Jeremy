package com.ucne.parcial1_jeremy.ui.AnonimaList

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.parcial1_jeremy.data.entity.Anonima


@Composable
fun AnonimaListScreen(
    onClick: () -> Unit,
    viewModel: AnonimaListViewModel = hiltViewModel()
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row{
                        Text(text = "Lista")
                        Spacer(Modifier.width(16.dp))
                    }
                }
            )

        },

        floatingActionButton = {
            FloatingActionButton(onClick = onClick) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) {

        val uiState by viewModel.uiState.collectAsState()

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(it)) {

            AnonimaLista(
                anonima = uiState.anonima,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )
        }

    }

}



@Composable
fun AnonimaLista(
    anonima: List<Anonima>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(anonima) { anonima ->
            AnonimaRow(anonima)
        }
    }
}

@Composable
fun AnonimaRow(anonima: Anonima) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Text(text = "campoId${anonima.campoId}",
            style = TextStyle(fontFamily = FontFamily.Default),
            color = Color.White
        )
        Text(text = "campo1${anonima.campo1}",
            style = TextStyle(fontFamily = FontFamily.Default),
            color = Color.White
        )
        Text(text = "campo2${anonima.campo2}",
            style = TextStyle(fontFamily = FontFamily.Default),
            color = Color.White
        )
        Text(text = "campo3${anonima.campo3}",
            style = TextStyle(fontFamily = FontFamily.Default),
            color = Color.White
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            color = Color.LightGray
        )
    }
}


