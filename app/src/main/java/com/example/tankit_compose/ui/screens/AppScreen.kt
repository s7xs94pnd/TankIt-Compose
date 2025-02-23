package com.example.tankit_compose.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.tankit_compose.Screen

@Composable
fun AppScreen() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Splash) }

    when (currentScreen) {
        is Screen.Splash -> SplashScreen {
            currentScreen = Screen.Main
        }
        is Screen.Main -> MainScreen()
    }
}