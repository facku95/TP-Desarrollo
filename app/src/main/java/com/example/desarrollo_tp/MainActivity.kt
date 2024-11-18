package com.example.desarrollo_tp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.desarrollo_tp.componentes.BottomBar
import com.example.desarrollo_tp.pantallas.Pantalla1
import com.example.desarrollo_tp.pantallas.Pantalla2
import com.example.desarrollo_tp.ui.theme.DesarrolloTPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val controller = rememberNavController()
            DesarrolloTPTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = { BottomBar(controller) }) { paddingValue ->

                    NavHost(navController = controller,
                        startDestination = NavigationRoutes.Pantalla1.route){

                        composable(NavigationRoutes.Pantalla1.route) {

                            Pantalla1(controller)

                        }
                        composable(NavigationRoutes.Pantalla2.route) {

                            Pantalla2(Modifier.fillMaxSize(), controller)

                        }


                    }

                }
            }
        }
    }
}
