package com.example.desarrollo_tp.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desarrollo_tp.ui.theme.Menta
import java.time.LocalDate

@Preview
@Composable
fun Tarjeta(){

    Card( modifier = Modifier.fillMaxWidth().height(180.dp).padding(horizontal = 15.dp), colors = CardDefaults.cardColors(containerColor = Menta)) {
        val fechaActual = LocalDate.now().toString()
        Column() {

            Spacer(modifier = Modifier.size(10.dp))

            Row(Modifier.fillMaxWidth()) {

                Spacer(Modifier.size(10.dp))

                Text(text = "Titulo", textAlign = TextAlign.Left, fontSize = 18.sp)
                Spacer(Modifier.width(180.dp))
                Text(text = fechaActual, textAlign = TextAlign.Right, fontSize = 18.sp)

                Spacer(Modifier.size(10.dp))

            }

            Spacer(Modifier.size(20.dp))

            HorizontalDivider(modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(Color.Black),
                thickness = 1.dp)

            Spacer(Modifier.size(20.dp))

            Box(modifier = Modifier.fillMaxWidth().height(150.dp)){

                Text(text= "Descripción", textAlign = TextAlign.Left, fontSize = 15.sp, modifier = Modifier.padding(start = 10.dp))

            }

        }

    }

}