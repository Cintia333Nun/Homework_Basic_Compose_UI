package com.example.switchit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.MutableFloatState
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.MutableState
import com.example.switchit.ui.screens.SwitchScreen
import com.example.switchit.ui.theme.SwitchItTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwitchItTheme {
               SwitchScreen(::onCheckedSwitch, ::restartPlay)
            }
        }
    }

    private fun restartPlay(
        countBlue: MutableIntState,
        countRed: MutableIntState,
        topCount: MutableFloatState,
        visibilityButtonRestart: MutableState<Boolean>
    ) {
        countBlue.intValue = 0
        countRed.intValue = 0
        topCount.floatValue = 1F
        visibilityButtonRestart.value = false
    }

    private fun onCheckedSwitch(
        count: MutableIntState,
        topCount: MutableFloatState,
        visibilityButtonRestart: MutableState<Boolean>
    ) {
        count.value += 1
        visibilityButtonRestart.value = count.intValue == topCount.floatValue.toInt()
    }

}