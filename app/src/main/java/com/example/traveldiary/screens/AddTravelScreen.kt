package com.example.traveldiary.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.PrimaryTabRow
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.traveldiary.composables.Bar

@Composable
fun AddTravel(){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = MaterialTheme.colorScheme.tertiary
            ) {
                Icon(Icons.Filled.Check, "Completed Action")
            }
        },
        topBar = { Bar("Add Travel") },
        modifier = Modifier.fillMaxSize()
    ) {innerPadding->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(8.dp)
            ) {
                DestinationField("Destination", {})
                CustomField("Date")
                CustomField("Description")
                PictureButton()
                Surface(
                    color = Color(92, 117, 176),
                    shape = CircleShape,
                    modifier = Modifier.size(100.dp)

                ) {
                    Icon(Icons.Outlined.Image, "Image Icon", modifier = Modifier.padding(25.dp), tint = MaterialTheme.colorScheme.background)
                }
            }
        }

    }
}

@Composable
fun DestinationField(placeholder : String, onclick : Function<Unit>){
    var text by remember { mutableStateOf("") }
    val context = LocalContext.current

    OutlinedTextField(
        value = text,
        onValueChange = {text = it},
        placeholder = { Text(placeholder) },
        trailingIcon = {
            IconButton(
                onClick = { onclick }
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Pick Location"
                )
            }
        },
        modifier = Modifier.fillMaxWidth().padding(0.dp, 4.dp),
        singleLine = true
    )
}

@Composable
fun CustomField(placeholder : String, ){
    var text by remember { mutableStateOf("") }
    val context = LocalContext.current

    OutlinedTextField(
        value = text,
        onValueChange = {text = it},
        placeholder = { Text(placeholder) },
        modifier = Modifier.fillMaxWidth().padding(0.dp, 8.dp),
        singleLine = true
    )
}

@Composable
fun PictureButton(){
    Surface(
        shape = RoundedCornerShape(30.dp),
        color = MaterialTheme.colorScheme.onPrimaryContainer,
        contentColor = MaterialTheme.colorScheme.background,
        modifier = Modifier.padding(0.dp, 30.dp),
        onClick = {}
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(20.dp,8.dp)
        ){
            Icon(Icons.Outlined.CameraAlt, "Camera Icon", tint = MaterialTheme.colorScheme.background, modifier = Modifier.size(24.dp).alignByBaseline())
            Spacer(Modifier.padding(8.dp))
            Text("Take a picture", fontSize = 16.sp, fontWeight = FontWeight.Medium, modifier= Modifier.alignByBaseline())
        }

    }
}
