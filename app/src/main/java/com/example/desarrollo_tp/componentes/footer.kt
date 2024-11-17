package com.example.desarrollo_tp.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.desarrollo_tp.ui.theme.Menta

@Composable
fun footer(){

    Box(modifier = Modifier.fillMaxSize()

    )

    {
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()

                .background(color = Color.White)
                .padding(WindowInsets.navigationBars.asPaddingValues()),
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            Icon(Icons.Outlined.Home, contentDescription = "", tint = Menta,modifier = Modifier.size(35.dp).padding(3.dp))
            Icon(Icons.Outlined.DateRange, contentDescription = "",modifier = Modifier.size(35.dp).padding(3.dp))
            Icon(Icons.Outlined.Person, contentDescription = "",modifier = Modifier.size(35.dp).padding(3.dp))
        }
    }


}