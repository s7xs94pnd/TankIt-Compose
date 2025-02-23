package com.example.tankit_compose.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.tankit_compose.ui.screens.AppScreen
import com.example.tankit_compose.ui.screens.MainScreen
import com.example.tankit_compose.ui.screens.SplashScreen
import com.example.tankit_compose.ui.theme.TankItComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TankItComposeTheme {
                AppScreen()
            }
        }
    }
}

