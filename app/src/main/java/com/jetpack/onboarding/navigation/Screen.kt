package com.jetpack.onboarding.navigation

sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome")
    object Home : Screen(route = "home")
}
