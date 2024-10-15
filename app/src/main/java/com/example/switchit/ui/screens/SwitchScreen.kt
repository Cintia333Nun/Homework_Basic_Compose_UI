package com.example.switchit.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableFloatState
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.switchit.ui.components.ButtonRestart
import com.example.switchit.ui.components.PlayerBlueSwitch
import com.example.switchit.ui.components.PlayerRedSwitch
import com.example.switchit.ui.components.SliderTopCount
import com.example.switchit.ui.components.TitleText
import com.example.switchit.ui.theme.blueBackground

@Composable
fun SwitchScreen(
    onCheckedSwitch: (MutableIntState, MutableFloatState, MutableState<Boolean>) -> Unit,
    restartPlay: (MutableIntState, MutableFloatState, MutableState<Boolean>) -> Unit,
) {
    val countPlayerBlue = remember { mutableIntStateOf(0) }
    val countPlayerRed = remember { mutableIntStateOf(0) }
    val topCount = remember { mutableFloatStateOf(1F) }

    val visibilityButtonRestart = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(if (visibilityButtonRestart.value) blueBackground else Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleText()
        PlayerBlueSwitch(countPlayerBlue, topCount, visibilityButtonRestart, onCheckedSwitch)
        PlayerRedSwitch(countPlayerRed, topCount, visibilityButtonRestart, onCheckedSwitch)
        if (visibilityButtonRestart.value) ButtonRestart {
            restartPlay.invoke(countPlayerBlue, topCount, visibilityButtonRestart)
        } else SliderTopCount(topCount, visibilityButtonRestart)
    }
}