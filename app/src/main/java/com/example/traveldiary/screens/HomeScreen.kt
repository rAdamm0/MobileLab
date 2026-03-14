package com.example.traveldiary.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.traveldiary.composables.Bar

@Composable
fun HomeScreen() {
    val itemsList = (1..100).toList()
    Scaffold(
        topBar = { Bar("Travel Diary") },
        modifier = Modifier
            .fillMaxSize(),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {/*TODO*/},
                containerColor = MaterialTheme.colorScheme.tertiary,

            ) {
                Icon(Icons.Filled.Add,"Add Item")
            }
        }

    ) { innerPadding ->

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(8.dp,8.dp, 8.dp, 80.dp),
            modifier = Modifier.padding(innerPadding)
        ) {
            items(itemsList) { GridItems(it.toString()) }
        }

    }
}


@Composable
fun GridItems(num: String, modifier : Modifier = Modifier) {
    Card(
        onClick = {/*TODO*/},
        modifier = modifier.fillMaxSize().size(130.dp),
        colors = CardDefaults.cardColors(
            contentColor = MaterialTheme.colorScheme.surfaceVariant
        )

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(5.dp)
        ) {
            Surface(
                color = Color(92,117,176),
                shape = _root_ide_package_.androidx.compose.foundation.shape.CircleShape,
                modifier = Modifier.size(60.dp)
            ) {
                Icon(Icons.Outlined.Star,"Image Icon", Modifier.padding(12.dp), tint = MaterialTheme.colorScheme.background)

            }
            Spacer(Modifier.padding(3.dp))

            Text("Item n* $num", fontSize = 15.sp, overflow = TextOverflow.StartEllipsis, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}