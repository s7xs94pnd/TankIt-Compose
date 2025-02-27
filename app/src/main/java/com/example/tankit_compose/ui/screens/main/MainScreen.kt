package com.example.tankit_compose.ui.screens.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tankit_compose.ui.nav.Screen
import com.example.tankit_compose.ui.screens.signIn.SignIn

@Composable
fun MainScreen() {

    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            NavInnit()
        }
    }
}

@Composable
fun NavInnit() {
    val navController = rememberNavController()
    NavHost(
        navController = navController, startDestination = Screen.SignIn.rout
    ) {
        composable<Screen.SignIn> {
            SignIn(navigate = {
                navController.navigate(Screen.Home.rout)
            })
        }
        composable<Screen.Home> {
            SignIn(navigate = {

            })
        }
    }
}
