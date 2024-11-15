package com.example.desarrollo_tp.pantallas



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.desarrollo_tp.R
import com.example.desarrollo_tp.R.drawable.unlam1
import com.example.desarrollo_tp.componentes.header

import com.example.desarrollo_tp.ui.theme.Menta

@Composable
fun Pantalla1(){

    Column(){

        header()
        body()
        footer()


    }

}


@Composable
fun body(){
    carrusel()
}

@Composable
fun footer(){

}
@Composable
fun carrusel(){

   Image(
       painter = painterResource(id = R.drawable.unlam4),
       contentDescription = "imagen1"
   )

    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){

            Button(onClick = {  },
                modifier = Modifier.size(25.dp).padding(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Menta,
                    contentColor = Color.White)

            ) {
                Text("")

            }
        OutlinedButton(onClick = {  }, modifier = Modifier.size(25.dp).padding(5.dp)) {
            Text("")
        }
        OutlinedButton(onClick = {  }, modifier = Modifier.size(25.dp).padding(5.dp)) {
            Text("")
        }
        OutlinedButton(onClick = {  }, modifier = Modifier.size(25.dp).padding(5.dp)) {
            Text("")
        }


    }

}

@Preview(showSystemUi = true)
@Composable
fun previewpantalla(){
    Pantalla1()
}