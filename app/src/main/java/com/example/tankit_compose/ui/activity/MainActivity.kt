package com.example.tankit_compose.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tankit_compose.ui.screens.main.AppScreen
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

