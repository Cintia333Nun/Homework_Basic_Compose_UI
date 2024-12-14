package com.example.switchit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.switchit.ui.screens.SwitchScreen
import com.example.switchit.ui.theme.SwitchItTheme

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwitchItTheme {
               SwitchScreen(viewModel = viewModel)
            }
        }
    }
}