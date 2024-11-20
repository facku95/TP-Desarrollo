package com.example.desarrollo_tp.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.desarrollo_tp.ui.theme.Menta
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Pantalla3(controller : NavHostController) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212)) // Fondo oscuro
            .padding(16.dp).padding(bottom = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(1) {

            Spacer(Modifier.size(30.dp))

            // Avatar y Nombre
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Menta),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Avatar",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Guest",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                text = "Ingeniería en Sistemas",
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Progreso Académico
            Text(
                text = "Promedio de notas anualmente",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))

            // Gráfico de Barras
            AcademicProgressGraphDark()

            Spacer(modifier = Modifier.height(16.dp))

            // Estadísticas
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E1E)) // Fondo oscuro para la tarjeta
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Materias aprobadas:", color = Color.Gray)
                        Text(text = "24", fontWeight = FontWeight.Bold, color = Color.White)
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Materias restantes:", color = Color.Gray)
                        Text(text = "8", fontWeight = FontWeight.Bold, color = Color.White)
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Promedio:", color = Color.Gray)
                        Text(text = "8.5", fontWeight = FontWeight.Bold, color = Color.White)
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Gráfico de Coordinadas
            Text(
                text = "Desempeño por Materias",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            MateriasDropdown()
            ExamWorkGraph()
            Spacer(modifier = Modifier.height(16.dp))



            // Tarjetas adicionales
            OptionCardDark(text = "Historial academico")
            OptionCardDark(text = "Oferta de materias")
            OptionCardDark(text = "Ver plan de estudio")
            OptionCardDark(text = "MIeL")
            OptionCardDark(text = "Intraconsulta")
        }
    }
}

@Composable
fun AcademicProgressGraphDark() {

        Spacer(modifier = Modifier.width(8.dp))

        // Gráfico de barras
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom
        ) {
            BarDark(value = 70, label = "1º Año")
            BarDark(value = 80, label = "2º Año")
            BarDark(value = 60, label = "3º Año")
            BarDark(value = 90, label = "4º Año")
            BarDark(value = 50, label = "5º Año")
        }
    }

@Composable
fun BarDark(value: Int, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .width(30.dp)
                .height((value * 2).dp) // Altura proporcional al valor
                .background(Menta)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = label, fontSize = 12.sp, color = Color.Gray)
    }
}

@Composable
fun OptionCardDark(text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E1E)), // Fondo oscuro
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            fontSize = 16.sp,
            color = Color.White, // Texto blanco para contraste
            fontWeight = FontWeight.Medium
        )
    }
}
@Composable
fun ExamWorkGraph() {
    val examsData = listOf(6, 8, 7, 9) // Datos de exámenes por entrega
    val worksData = listOf(5, 6, 8, 10) // Datos de trabajos prácticos por entrega
    val maxData = 10 // Máximo valor posible en el gráfico (10)

    // Calcular la suma de los exámenes y trabajos prácticos
    val totalExams = examsData.sum()
    val totalWorks = worksData.sum()

    // Calcular el promedio de todas las notas
    val totalNotes = examsData + worksData
    val average = totalNotes.average()

    Column(modifier = Modifier.padding(16.dp)) {
        // Gráfico de coordenadas
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(16.dp)
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val width = size.width
                val height = size.height

                val padding = 50f
                val stepX = (width - 2 * padding) / (examsData.size - 1)
                val stepY = (height - 2 * padding) / maxData

                // Ejes X e Y
                drawLine(
                    color = Color.Gray,
                    start = androidx.compose.ui.geometry.Offset(padding, height - padding),
                    end = androidx.compose.ui.geometry.Offset(width - padding, height - padding),
                    strokeWidth = 4f
                )
                drawLine(
                    color = Color.Gray,
                    start = androidx.compose.ui.geometry.Offset(padding, height - padding),
                    end = androidx.compose.ui.geometry.Offset(padding, padding),
                    strokeWidth = 4f
                )

                // Etiquetas en el eje X (Entregas)
                examsData.forEachIndexed { index, _ ->
                    drawContext.canvas.nativeCanvas.drawText(
                        "Entrega ${index + 1}",
                        padding + stepX * index,
                        height - 20f,
                        android.graphics.Paint().apply {
                            color = android.graphics.Color.WHITE
                            textSize = 36f
                            textAlign = android.graphics.Paint.Align.CENTER
                        }
                    )
                }

                // Etiquetas en el eje Y (Valores)
                for (i in 0..maxData) {
                    drawContext.canvas.nativeCanvas.drawText(
                        "$i",
                        padding - 20f,
                        height - padding - stepY * i,
                        android.graphics.Paint().apply {
                            color = android.graphics.Color.WHITE
                            textSize = 36f
                            textAlign = android.graphics.Paint.Align.RIGHT
                        }
                    )
                }

                // Dibujar las líneas de los datos
                val examPoints = examsData.mapIndexed { index, value ->
                    androidx.compose.ui.geometry.Offset(
                        padding + stepX * index,
                        height - padding - stepY * value
                    )
                }
                val workPoints = worksData.mapIndexed { index, value ->
                    androidx.compose.ui.geometry.Offset(
                        padding + stepX * index,
                        height - padding - stepY * value
                    )
                }

                // Línea de exámenes
                examPoints.zipWithNext().forEach { (start, end) ->
                    drawLine(
                        color = Menta,
                        start = start,
                        end = end,
                        strokeWidth = 8f,
                        cap = StrokeCap.Round
                    )
                }

                // Línea de trabajos prácticos
                workPoints.zipWithNext().forEach { (start, end) ->
                    drawLine(
                        color = Color.Cyan,
                        start = start,
                        end = end,
                        strokeWidth = 8f,
                        cap = StrokeCap.Round
                    )
                }

                // Puntos en los datos
                examPoints.forEach { point ->
                    drawCircle(
                        color = Menta,
                        center = point,
                        radius = 10f
                    )
                }
                workPoints.forEach { point ->
                    drawCircle(
                        color = Color.Cyan,
                        center = point,
                        radius = 10f
                    )
                }
            }
        }

        // Card para los datos debajo del gráfico
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E1E)),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    // Cuadro de color para Exámenes
                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .background(Menta)
                            .align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Total exámenes:",
                        color = Color.Gray,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "$totalExams",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    // Cuadro de color para Trabajos Prácticos
                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .background(Color.Cyan)
                            .align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Total trabajos prácticos:",
                        color = Color.Gray,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "$totalWorks",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Promedio de notas:",
                        color = Color.Gray,
                        fontSize = 16.sp
                    )
                    Text(
                        text = "%.2f".format(average),
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MateriasDropdown(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFF1E1E1E), shape = RoundedCornerShape(8.dp))
            .padding(vertical = 12.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Texto
        Text(
            text = "Materias",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        // Flecha
        Icon(
            imageVector = Icons.Default.ArrowDropDown,
            contentDescription = "Flecha desplegable",
            tint = Color.White
        )
    }
}