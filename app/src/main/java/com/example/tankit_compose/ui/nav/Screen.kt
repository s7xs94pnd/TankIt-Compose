package com.example.tankit_compose.ui.nav

sealed class Screen(val rout:String) {
    object Splash : Screen("splashRoute")
    object Main : Screen("mainRoute")
    object SignIn : Screen("signInRoute")
    object Home : Screen("homeRoute")
    object Settings : Screen("SettingsRoute")
    object FuelCoupon : Screen("fuelCouponRoute")
}