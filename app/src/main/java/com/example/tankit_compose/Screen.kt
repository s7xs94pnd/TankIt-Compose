package com.example.tankit_compose

sealed class Screen {
    object Splash : Screen()
    object Main : Screen()
}