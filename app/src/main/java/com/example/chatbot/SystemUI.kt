package com.example.chatbot


import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun SetupSystemUI() {
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = true // True for dark icons on light background

    SideEffect {
        systemUiController.setStatusBarColor(
            color = Color.White, // Keep the status bar white
            darkIcons = useDarkIcons
        )
    }
}
