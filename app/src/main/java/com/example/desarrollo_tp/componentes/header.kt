package com.example.desarrollo_tp.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.desarrollo_tp.R
import com.example.desarrollo_tp.ui.theme.Menta


@Composable
fun header(){
    Row(modifier= Modifier
        .fillMaxWidth()
        .background(color = Menta)
        .height(50.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(Icons.Outlined.Menu, contentDescription = "menu", modifier = Modifier.size(35.dp))
        Image(
            painter = painterResource(id= R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier.size(90.dp)
        )

        Spacer(modifier = Modifier.weight(1f))
        Icon(Icons.Outlined.AccountCircle, contentDescription = "perfil",modifier = Modifier.size(35.dp))
        Icon(Icons.Outlined.ExitToApp, contentDescription = "salir")

    }

}