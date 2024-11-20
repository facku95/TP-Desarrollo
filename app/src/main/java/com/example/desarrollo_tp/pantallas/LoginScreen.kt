package com.example.desarrollo_tp.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.desarrollo_tp.NavigationRoutes
import com.example.desarrollo_tp.R
import com.example.desarrollo_tp.ui.theme.Gris
import com.example.desarrollo_tp.ui.theme.Menta

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController, modifier: Modifier = Modifier.fillMaxSize()) {
    var dni by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var errorMessage by remember { mutableStateOf("") }

    val validEmail = "39552983"
    val validPassword = "123456"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Gris),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Box(modifier = Modifier.width(300.dp).height(180.dp)
            .background(color = Menta, shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 30.dp, vertical = 30.dp),
            contentAlignment = Alignment.Center,
        ){

            Image(painter = painterResource(R.drawable.unlam5), contentDescription = "Logo Unlam", modifier = Modifier.fillMaxSize())

        }

        Spacer(Modifier.size(32.dp))

        Text(
            text = "Universidad Nacional de La Matanza",
            color = Color.White,
            style = MaterialTheme.typography.headlineMedium,
            maxLines = 1,
            modifier = Modifier
                .padding(bottom = 32.dp, start = 16.dp, end = 16.dp)
                .align(Alignment.CenterHorizontally),
            fontSize = 20.sp
        )


        OutlinedTextField(
            value = dni,
            maxLines = 1,
            onValueChange = { dni = it },
            label = { Text("DNI") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp, start = 16.dp, end = 16.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Menta,
                unfocusedBorderColor = Color.Gray
            ),
        )


        OutlinedTextField(
            value = password,
            maxLines = 1,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp, start = 16.dp, end = 16.dp),
            visualTransformation = PasswordVisualTransformation(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Menta,
                unfocusedBorderColor = Color.Gray
            )
        )

        if (errorMessage.isNotEmpty()) {
            Text(text = errorMessage, color = Color.Red, modifier = Modifier.padding(bottom = 16.dp))
        }


        Button(
            onClick = {

                navController.navigate(NavigationRoutes.Pantalla1.route)

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Menta),
            shape = MaterialTheme.shapes.medium,
            elevation = ButtonDefaults.buttonElevation(8.dp)
        ) {
            Text("Iniciar sesión", color = Color.White)
        }

        // Botón para registrar si no tiene cuenta
        TextButton(
            onClick = { /* Navegar a la pantalla de registro */ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("¿No tienes cuenta? Regístrate", color = Color.White)
        }
    }
}