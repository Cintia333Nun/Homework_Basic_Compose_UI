package com.example.switchit.ui.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.switchit.R
import com.example.switchit.ui.theme.blue
import com.example.switchit.ui.theme.brown
import com.example.switchit.ui.theme.gray
import com.example.switchit.ui.theme.red

@Composable
fun PlayerBlueSwitch(
    count: Int,
    visibilityButtonRestart: Boolean,
    onCheckedSwitch: () -> Unit
) {
    Switch(
        modifier = Modifier
            .padding(top = 20.dp),
        checked = false,
        colors = SwitchColors(
            checkedThumbColor = Color.White,
            checkedTrackColor = blue,
            checkedBorderColor = blue,
            checkedIconColor = Color.White,
            uncheckedThumbColor = blue,
            uncheckedTrackColor = Color.White,
            uncheckedBorderColor = blue,
            uncheckedIconColor = Color.White,
            disabledCheckedThumbColor = gray,
            disabledCheckedTrackColor = Color.White,
            disabledCheckedBorderColor = gray,
            disabledCheckedIconColor = Color.White,
            disabledUncheckedThumbColor = gray,
            disabledUncheckedTrackColor = Color.White,
            disabledUncheckedBorderColor = gray,
            disabledUncheckedIconColor = Color.White,
        ),
        onCheckedChange = {
            onCheckedSwitch.invoke()
        },
        thumbContent = null,
        enabled = !visibilityButtonRestart,
        interactionSource = remember { MutableInteractionSource() }
    )
    Text(
        modifier = Modifier.padding(bottom = 26.dp),
        text = stringResource(R.string.count_string, count),
        fontWeight = FontWeight.Bold,
    )
}

@Composable
fun PlayerRedSwitch(
    count: Int,
    visibilityButtonRestart: Boolean,
    onCheckedSwitch: () -> Unit
) {
    Switch(
        modifier = Modifier
            .padding(top = 20.dp),
        checked = false,
        colors = SwitchColors(
            checkedThumbColor = Color.White,
            checkedTrackColor = red,
            checkedBorderColor = red,
            checkedIconColor = Color.White,
            uncheckedThumbColor = red,
            uncheckedTrackColor = Color.White,
            uncheckedBorderColor = red,
            uncheckedIconColor = Color.White,
            disabledCheckedThumbColor = brown,
            disabledCheckedTrackColor = Color.White,
            disabledCheckedBorderColor = brown,
            disabledCheckedIconColor = Color.White,
            disabledUncheckedThumbColor = brown,
            disabledUncheckedTrackColor = Color.White,
            disabledUncheckedBorderColor = brown,
            disabledUncheckedIconColor = Color.White,
        ),
        onCheckedChange = {
            onCheckedSwitch.invoke()
        },
        thumbContent = null,
        enabled = !visibilityButtonRestart,
        interactionSource = remember { MutableInteractionSource() }
    )
    Text(
        modifier = Modifier.padding(bottom = 26.dp),
        text = stringResource(R.string.count_string, count),
        fontWeight = FontWeight.Bold
    )
}