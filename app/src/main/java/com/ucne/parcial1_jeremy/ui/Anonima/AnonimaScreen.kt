package com.ucne.parcial1_jeremy.ui.Anonima

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel

@Composable
fun AnonimaScreen(
    onNavigateBack: () -> Unit,
    viewModel: ArticuloViewModel = hiltViewModel()

    ) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row{
                        Text(text = "Registro de Articulos")
                        Spacer(Modifier.width(16.dp))
                    }
                }
            )

        },

        floatingActionButton = {
            FloatingActionButton(onClick = {
                viewModel.Save()
                onNavigateBack()
            }) {
                Icon(imageVector = Icons.Filled.Done, contentDescription = "Add")
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(8.dp)
        ) {

            OutlinedTextField(
                label = { Text(text = "Descripcion")},
                value = viewModel.descripcion,
                onValueChange = {viewModel.descripcion = it})

            OutlinedTextField(
                label = { Text(text = "Marca")},
                value = viewModel.marca,
                onValueChange = {viewModel.marca = it})

            OutlinedTextField(
                label = { Text(text = "Existencia")},
                value = viewModel.existencia,
                onValueChange = {viewModel.existencia = it})


        }
    }

}