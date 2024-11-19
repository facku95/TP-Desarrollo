package com.example.desarrollo_tp.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.desarrollo_tp.NavigationRoutes
import com.example.desarrollo_tp.ui.theme.Menta

@Composable
fun BottomBar(controller: NavHostController) {
    val navBackStackEntry by controller.currentBackStackEntryAsState()
    NavigationBar(modifier = Modifier.fillMaxWidth().height(115.dp)) {
        NavigationBarItem(
            selected = navBackStackEntry?.destination?.hierarchy?.any { it.route == "pantalla1" } == true,
            onClick = { controller.navigate("pantalla1") },
            icon = {
                Icon(Icons.Outlined.Home,
                    contentDescription = "",
                    tint = Menta,
                    modifier = Modifier.size(35.dp).padding(3.dp))
            }
        )
        NavigationBarItem(
            selected = navBackStackEntry?.destination?.hierarchy?.any { it.route == "pantalla2" } == true,
            onClick = { controller.navigate("pantalla2") },
            icon = {
                Icon(Icons.Outlined.DateRange,
                    contentDescription = "",
                    tint = Menta,
                    modifier = Modifier.size(35.dp).padding(3.dp))
            }

        )
        //Ajustar a pantalla3
        NavigationBarItem(
            selected = navBackStackEntry?.destination?.hierarchy?.any { it.route == "pantalla2" } == true,
            onClick = {controller.navigate("pantalla2")},
            icon = {
                Icon(Icons.Outlined.Person,
                    contentDescription = "",
                    tint = Menta,
                    modifier = Modifier.size(35.dp).padding(3.dp))
            }
        )
    }
}