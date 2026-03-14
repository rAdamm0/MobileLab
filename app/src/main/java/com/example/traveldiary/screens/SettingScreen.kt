package com.example.traveldiary.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField  
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.traveldiary.composables.Bar

@Composable
fun Settings(){
    Scaffold (
        topBar = { Bar("Settings") },
        modifier = Modifier
                .fillMaxSize()
    ) { innerPadding ->
        Surface(
            modifier = Modifier.padding(innerPadding)
            
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(12.dp, 8.dp)
            ) {
                var text by remember { mutableStateOf("") }
                OutlinedTextField(

                    onValueChange = {text = it},
                    placeholder = {
                        Text("username")
                    },
                    label = {
                        Text("Username")
                    },
                    value = text,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(Modifier.padding(10.dp))
                Text("username", fontSize = 15.sp)
            }

        }
        
    }
}