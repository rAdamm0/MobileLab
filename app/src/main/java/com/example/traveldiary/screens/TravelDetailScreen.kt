package com.example.traveldiary.screens

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.traveldiary.composables.Bar

@Composable
fun TravelDetailScreen() {
    Scaffold(
        topBar = { Bar("Travel Details") },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {/*TODO*/ },
                containerColor = MaterialTheme.colorScheme.tertiary
            ) {
                Icon(Icons.Filled.Share, "Share Floating Button Icon")
            }
        },

        ) { innerPadding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize().padding(innerPadding)

            ) {
                Spacer(Modifier.padding(20.dp))
                Surface(
                    color = Color(92, 117, 176),
                    shape = CircleShape,
                    modifier = Modifier.size(100.dp)

                ) {
                    Icon(Icons.Outlined.Star, "Image Icon", modifier = Modifier.padding(25.dp), tint = MaterialTheme.colorScheme.background)
                }
                Spacer(Modifier.padding(10.dp))
                Text("Destination", fontSize = 20.sp)
                Spacer(Modifier.padding(4.dp))
                Text("01/01/2024", fontSize = 10.sp)
                Spacer(Modifier.padding(8.dp))
                Text("Description", fontSize = 12.sp)

            }
        }
    }

