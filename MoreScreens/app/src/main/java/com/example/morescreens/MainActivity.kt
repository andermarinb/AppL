package com.example.morescreens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.morescreens.jetpackcomposecatalog.*
import com.example.morescreens.ui.theme.MoreScreensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoreScreensTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    //con el navigationController se puede navegar entre escenas
                    val navigationController = rememberNavController()
                    NavHost(navController = navigationController, startDestination = "loginScreen") {
                        composable("registerScreen"){ RegisterScreen(navigationController)}
                        composable("loginScreen") { LoginScreen(navigationController) }
                        composable("oneScreen") { OneScreen(navigationController) }
                        composable("twoScreen") { TwoScreen(navigationController) }
                        composable("threeScreen") { ThreeScreen(navigationController) }
                        composable("fourScreen") { FourScreen(navigationController) }
                        composable("errorScreen") { ErrorScreen(navigationController) }
                        composable("contenido1") { Contenido1(navigationController) }
                    }
                }
            }
        }
    }
}
