package com.example.traveldiary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.traveldiary.screens.AddTravel
import com.example.traveldiary.screens.HomeScreen
import com.example.traveldiary.screens.Settings
import com.example.traveldiary.screens.TravelDetailScreen
import com.example.traveldiary.ui.theme.TravelDiaryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TravelDiaryTheme {
                //HomeScreen();
                //TravelDetailScreen();
                AddTravel()
                //Settings();
            }
        }
    }
}
