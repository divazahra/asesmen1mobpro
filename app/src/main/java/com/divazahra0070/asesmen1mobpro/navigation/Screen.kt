package com.divazahra0070.asesmen1mobpro.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
}