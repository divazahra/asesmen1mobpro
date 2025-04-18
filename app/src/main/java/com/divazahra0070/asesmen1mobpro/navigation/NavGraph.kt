package com.divazahra0070.asesmen1mobpro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.divazahra0070.asesmen1mobpro.ui.screen.AboutMeScreen
import com.divazahra0070.asesmen1mobpro.ui.screen.AboutScreen
import com.divazahra0070.asesmen1mobpro.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route){
            MainScreen(navController)
        }
        composable(route = Screen.About.route){
            AboutScreen(navController)
        }
        composable(route = Screen.Aboutme.route){
            AboutMeScreen(navController)
        }
    }
}