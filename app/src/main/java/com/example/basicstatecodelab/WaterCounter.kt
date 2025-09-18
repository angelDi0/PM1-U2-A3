package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Row

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    Column (modifier = modifier.padding(16.dp)) {
//        val count: MutableState<Int> = remember {mutableStateOf(0)}
        var count by remember { mutableStateOf(0)}

        if(count > 0){
            var showTask by remember { mutableStateOf(true)}
            if(showTask){
                WellnessTaskItem(
                    onClose = { showTask = false},
                    taskName = "Has caminado los 15 minutos diarios"
                )
            }
            Text("Te has tomado $count vasos de agua")
        }
        Row(Modifier.padding(top = 8.dp)){
            Button(onClick = { count++ }, Modifier.padding(top = 8.dp), enabled = count < 10){
                Text("Agregar uno")
            }
            Button(
                onClick = { count = 0},
                Modifier.padding(start = 8.dp)
            ){
                Text("Reiniciar contador de vasos de agua?")
            }
        }
    }
}