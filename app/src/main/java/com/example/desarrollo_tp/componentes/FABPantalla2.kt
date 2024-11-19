package com.example.desarrollo_tp.componentes

import android.content.Context
import android.widget.Toast
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.desarrollo_tp.ui.theme.Menta
import com.example.desarrollo_tp.ui.theme.VerdeOscuro

@Composable
fun Fab(){
    var context = LocalContext.current
    FloatingActionButton(onClick = {Toast.makeText(context, "Crear Evento/Anotacion", Toast.LENGTH_LONG).show()},
        containerColor = VerdeOscuro,
        contentColor = Color.White) {

        Text(text = "+", fontSize = 30.sp, textAlign = TextAlign.Center)

    }


}