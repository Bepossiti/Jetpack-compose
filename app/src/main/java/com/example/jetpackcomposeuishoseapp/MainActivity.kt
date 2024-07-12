package com.example.jetpackcomposeuishoseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposeuishoseapp.Navigation.AppNavHost
import com.example.jetpackcomposeuishoseapp.screens.ProductDetailsScreen
import com.example.jetpackcomposeuishoseapp.screens.ProductScreen
import com.example.jetpackcomposeuishoseapp.ui.theme.JetPackComposeUiShoseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeUiShoseAppTheme {
                 Surface(
                     modifier = Modifier.fillMaxSize(),
                     color = MaterialTheme.colorScheme.background
                 ) {
                         AppNavHost()
                     //ProductScreen(navController = NavController(this) )
                     //ProductDetailsScreen(navController = NavController(this) )
                 }
            }
        }
    }
}

