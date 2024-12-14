package com.example.switchit.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.switchit.MainViewModel
import com.example.switchit.ui.components.ButtonRestart
import com.example.switchit.ui.components.PlayerBlueSwitch
import com.example.switchit.ui.components.PlayerRedSwitch
import com.example.switchit.ui.components.SliderTopCount
import com.example.switchit.ui.components.TitleText
import com.example.switchit.ui.theme.blueBackground

@Composable
fun SwitchScreen(viewModel: MainViewModel) {

    val countPlayerBlue = viewModel.countPlayerBlue.collectAsState()
    val countPlayerRed = viewModel.countPlayerRed.collectAsState()
    val topCount = viewModel.topCount.collectAsState()

    val visibilityButtonRestart = viewModel.visibilityButtonRestart.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(if (visibilityButtonRestart.value) blueBackground else Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleText()
        PlayerBlueSwitch(count = countPlayerBlue.value, visibilityButtonRestart = visibilityButtonRestart.value) {
            viewModel.onCheckedSwitchBlue()
        }
        PlayerRedSwitch(count = countPlayerRed.value, visibilityButtonRestart = visibilityButtonRestart.value) {
            viewModel.onCheckedSwitchRed()
        }
        if (visibilityButtonRestart.value)
            ButtonRestart { viewModel.restartPlay() }
        else
            SliderTopCount(topCount.value, visibilityButtonRestart.value) { value -> viewModel.setTopCount(value)}
    }
}