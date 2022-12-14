package com.ucne.parcial1_jeremy.ui.ArticuloList

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
import com.ucne.parcial1_jeremy.data.entity.Articulo


@Composable
fun ArticuloListScreen(
    onClick: () -> Unit,
    viewModel: ArticuloListViewModel = hiltViewModel()
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

            ArticuloLista(
                articulo = uiState.articulo,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )
        }

    }

}



@Composable
fun ArticuloLista(
    articulo: List<Articulo>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(articulo) { anonima ->
            ArticuloRow(anonima)
        }
    }
}

@Composable
fun ArticuloRow(articulo: Articulo) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Text(text = "ArticuloId: ${articulo.articuloId}",
            style = TextStyle(fontFamily = FontFamily.Default),
            color = Color.Black
        )
        Text(text = "Descripcion: ${articulo.descripcion}",
            style = TextStyle(fontFamily = FontFamily.Default),
            color = Color.Black
        )
        Text(text = "Marca: ${articulo.marca}",
            style = TextStyle(fontFamily = FontFamily.Default),
            color = Color.Black
        )
        Text(text = "Existencia: ${articulo.existencia}",
            style = TextStyle(fontFamily = FontFamily.Default),
            color = Color.Black
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            color = Color.LightGray
        )
    }
}



