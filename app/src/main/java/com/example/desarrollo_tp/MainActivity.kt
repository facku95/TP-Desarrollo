package com.example.desarrollo_tp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.WindowInsets
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FabPosition.Companion.End
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.desarrollo_tp.componentes.BottomBar
import com.example.desarrollo_tp.componentes.Fab
import com.example.desarrollo_tp.pantallas.LoginScreen
import com.example.desarrollo_tp.pantallas.Pantalla1
import com.example.desarrollo_tp.pantallas.Pantalla2
import com.example.desarrollo_tp.pantallas.Pantalla3
import com.example.desarrollo_tp.ui.theme.DesarrolloTPTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        hideSystemBars()
        setContent {
            val controller = rememberNavController()
            DesarrolloTPTheme {
                val navBackStackEntry = controller.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry.value?.destination?.route
                Scaffold(modifier = Modifier.fillMaxSize(), bottomBar =
                {
                    if (currentRoute != "login") {
                    BottomBar(controller)
                }

                    }, floatingActionButton = {
                        if (currentRoute == "pantalla2"){
                            Fab()
                        }

                      }, floatingActionButtonPosition = End
                    )
                { paddingValue ->
                    NavHost(navController = controller,
                        startDestination = NavigationRoutes.Login.route){

                        composable(NavigationRoutes.Login.route) {

                            LoginScreen(controller)

                        }

                        composable(NavigationRoutes.Pantalla1.route) {

                            Pantalla1(controller)

                        }
                        composable(NavigationRoutes.Pantalla2.route) {

                            Pantalla2(Modifier.fillMaxSize(), controller)

                        }
                        composable(NavigationRoutes.Pantalla3.route){

                            Pantalla3(controller)

                        }

                    }

                }
            }
        }

    }

    //Oculta barras del sistema.
    @SuppressLint("WrongConstant")
    fun hideSystemBars() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val controller = WindowInsetsControllerCompat(window, window.decorView)
        controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_BARS_BY_SWIPE
        controller.hide(WindowInsets.Type.systemBars())
    }
}



