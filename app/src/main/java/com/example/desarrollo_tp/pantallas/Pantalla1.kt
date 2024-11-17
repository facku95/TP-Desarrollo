package com.example.desarrollo_tp.pantallas



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desarrollo_tp.R
import com.example.desarrollo_tp.componentes.footer
import com.example.desarrollo_tp.componentes.header
import com.example.desarrollo_tp.ui.theme.Gris
import com.example.desarrollo_tp.ui.theme.Menta

@Composable
fun Pantalla1(){

    Column(modifier = Modifier.background(color = Gris)){

        header()
        body()
        footer()
    }

}


@Composable
fun body(){
    carrusel()
    homecards()
    carruseldepto()

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
        OutlinedButton(onClick = {  },
            modifier = Modifier.size(25.dp).padding(5.dp)) {
            Text("")
        }
        OutlinedButton(onClick = {  },
            modifier = Modifier.size(25.dp).padding(5.dp)) {
            Text("")
        }
        OutlinedButton(onClick = {  },
            modifier = Modifier.size(25.dp).padding(5.dp)) {
            Text("")
        }
        Spacer(modifier = Modifier.size(45.dp))


    }

}

@Composable
fun homecards(){
    Row (modifier = Modifier.fillMaxWidth().height(120.dp).background(color= Gris),
        horizontalArrangement = Arrangement.Absolute.SpaceAround
        ){

        Card(modifier = Modifier.weight(1f).padding(7.dp)){
            Text("Cursos",
                modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center),
                
                style = TextStyle(
                    fontSize = 25.sp
                ))

        }
        Card(modifier = Modifier.weight(1f).padding(7.dp)){
            Text("Carreras",
                modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center),
                style = TextStyle(
                    fontSize = 25.sp
                ))
        }

    }
    Row (modifier = Modifier.fillMaxWidth().height(120.dp).background(color= Gris),
        horizontalArrangement = Arrangement.Absolute.SpaceAround
    ){

        Card(modifier = Modifier.weight(1f).padding(7.dp)){
            Text("Postgrado",
                modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center),
                style = TextStyle(
                    fontSize = 25.sp
                ))
        }
        Card(modifier = Modifier.weight(1f).padding(7.dp)){
            Text("Tecnicaturas",
                modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center),
                style = TextStyle(
                    fontSize = 25.sp
                ))
        }
    }
}
@Composable
fun carruseldepto(){
    Row() {

Card (modifier = Modifier.padding(10.dp)) {
    Text(
        "Departamentos",
        modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally).padding(3.dp),
        style = TextStyle(
            fontSize = 25.sp
        )
    )
}


    }
    Spacer(modifier = Modifier.size(15.dp))
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center

    ){
        Image(
            painter = painterResource(id = R.drawable.ico_derecho),
            contentDescription = "imagen1",
            modifier = Modifier.weight(1f).padding(7.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ico_ingenieria),
            contentDescription = "imagen1",
            modifier = Modifier.weight(1f).padding(7.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ico_economicas),
            contentDescription = "imagen1",
            modifier = Modifier.weight(1f).padding(7.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ico_humanidades),
            contentDescription = "imagen1",
            modifier = Modifier.weight(1f).padding(7.dp)
        )
    }
}



@Preview(showSystemUi = true)
@Composable
fun previewpantalla(){
    Pantalla1()
}