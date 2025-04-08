package com.divazahra0070.asesmen1mobpro.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object About: Screen("aboutScreen")
    data object Aboutme: Screen("aboutMeScreen")
}