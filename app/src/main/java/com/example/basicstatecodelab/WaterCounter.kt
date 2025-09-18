package com.example.basicstatecodelab

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    val count = 0
    Text(
        text = "Te has tomado $count vasos de agua",
        modifier = modifier.padding(16.dp)
    )
}