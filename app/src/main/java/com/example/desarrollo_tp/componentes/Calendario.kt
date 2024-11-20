package com.example.desarrollo_tp.componentes


import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerColors
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.desarrollo_tp.ui.theme.Menta

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calendario(modifier: Modifier){
    var state = rememberDatePickerState()
    DatePicker(state,
        modifier = Modifier.fillMaxSize(),
    colors = DatePickerDefaults.colors(
        selectedDayContainerColor =  Menta,
        selectedDayContentColor = Color.White
    )
    )
}

