package com.example.desarrollo_tp

sealed class NavigationRoutes(val route: String) {

    //Login
    data object Login : NavigationRoutes(route = "login")
    //Home
    data object Pantalla1 : NavigationRoutes(route = "pantalla1")
    //Calendario/Agenda
    data object Pantalla2 : NavigationRoutes(route = "pantalla2")
    //Perfil
    data object Pantalla3 : NavigationRoutes(route = "pantalla3")

}