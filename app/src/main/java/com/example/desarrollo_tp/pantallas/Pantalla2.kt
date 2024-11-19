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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.desarrollo_tp.componentes.BottomBar
import com.example.desarrollo_tp.componentes.Calendario
import com.example.desarrollo_tp.componentes.Tarjeta
import com.example.desarrollo_tp.ui.theme.Gris
import com.example.desarrollo_tp.ui.theme.Menta


@Composable
fun Pantalla2(modifier: Modifier = Modifier.fillMaxSize(),
              controller: NavHostController
) {

    Column(modifier = Modifier.fillMaxSize().background(color = Gris)) {
        var pantallaCalendario = remember { mutableStateOf(true) }
        var pantallaAgenda = remember { mutableStateOf(false) }
        Spacer(modifier = Modifier.size(80.dp))

        Row(modifier = Modifier.fillMaxWidth()) {

            Spacer(modifier = Modifier.size(30.dp))

            Button(modifier = Modifier.size(150.dp, 60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Menta, contentColor = Color.White),
                onClick = {

                    pantallaAgenda.value = false
                    pantallaCalendario.value = true

                }) {
                Text(
                    text = "Calendario",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                )
            }

            Spacer(modifier = Modifier.size(30.dp))

            Button(modifier = Modifier.size(150.dp, 60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Menta, contentColor = Color.White),
                onClick = {

                    pantallaCalendario.value = false
                    pantallaAgenda.value = true

                }) {
                Text(
                    text = "Agenda",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                )
            }

            Spacer(modifier = Modifier.size(30.dp))

        }

        Spacer(modifier = Modifier.size(40.dp))

        if (pantallaAgenda.value) {
            PantallaAgenda()
        }
        if (pantallaCalendario.value) {
            PantallaCalendario()
        }

    }

}

@Composable
fun PantallaCalendario(){
    Calendario(Modifier.fillMaxHeight())
}

@Composable
fun PantallaAgenda() {

    Spacer(Modifier.size(20.dp))
    LazyColumn(modifier = Modifier.fillMaxHeight().padding(bottom = 100.dp)) { items(10) {

        Tarjeta()
        Spacer(Modifier.size(30.dp))
        }

    }
    Spacer(Modifier.size(20.dp))
}
