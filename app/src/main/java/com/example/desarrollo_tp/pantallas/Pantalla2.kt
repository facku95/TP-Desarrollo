package com.example.desarrollo_tp.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desarrollo_tp.componentes.Calendario
import com.example.desarrollo_tp.ui.theme.Gris
import com.example.desarrollo_tp.ui.theme.Menta

@Composable
fun Pantalla2(modifier: Modifier = Modifier.fillMaxSize()){

    Column(modifier = Modifier.fillMaxSize().background(color = Gris)) {

    Spacer(modifier = Modifier.size(50.dp))

        Row (modifier = Modifier.fillMaxWidth()) {

    Spacer(modifier = Modifier.size(30.dp))

            Button(modifier = Modifier.size(150.dp, 80.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Menta),
                onClick = {}) {
                Text(text =  "Calendario",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                    )
            }

            Spacer(modifier = Modifier.size(30.dp))

            Button(modifier = Modifier.size(150.dp, 80.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Menta),
                onClick = {}) {
                Text(text = "Agenda",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                    )
            }

            Spacer(modifier = Modifier.size(30.dp))

        }

        Spacer(modifier = Modifier.size(40.dp))

        Calendario(modifier = Modifier.fillMaxHeight())


    }

}

@Preview
@Composable
fun previewPantalla(){
    Pantalla2()
}