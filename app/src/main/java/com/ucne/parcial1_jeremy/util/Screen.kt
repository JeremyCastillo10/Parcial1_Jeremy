package com.ucne.parcial1_jeremy.util

sealed class Screen(val route: String){
    object AnonimaListScreen: Screen("AnonimaLista")
    object AnonimaScreen: Screen("Anonima")
}