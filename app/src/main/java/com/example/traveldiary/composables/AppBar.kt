package com.example.traveldiary.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Bar(label : String) {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        title = {
            Text(label, fontWeight = FontWeight.Bold)
        },
        actions = {
            if(label == "Travel Diary"){
                IconButton(onClick = {/*TODO*/ }) { Icon(Icons.Filled.Search, "Search Button") }
            }
            if(label != "Settings"){
                IconButton(onClick = {/*TODO*/ }) { Icon(Icons.Filled.Settings, "Settings Button") }

            }
        }
    )
}