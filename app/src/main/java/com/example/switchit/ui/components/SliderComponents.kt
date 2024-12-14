package com.example.switchit.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.switchit.R
import com.example.switchit.ui.theme.blue

@Composable
fun SliderTopCount(
    topCount: Float,
    visibilityButtonRestart: Boolean,
    onValueChange: (Float) -> Unit
) {
    Text(
        modifier = Modifier.padding(top = 10.dp),
        text = stringResource(R.string.top_count_string, topCount.toInt()),
        fontWeight = FontWeight.Bold,
    )
    Slider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        value = topCount,
        valueRange = 1F .. 10F,
        steps = 8,
        colors = SliderColors(
            thumbColor = blue,
            activeTrackColor = Color.Gray,
            activeTickColor = Color.Gray,
            inactiveTrackColor = Color.Gray,
            inactiveTickColor = Color.Gray,
            disabledThumbColor = Color.DarkGray,
            disabledActiveTrackColor = Color.Gray,
            disabledActiveTickColor = Color.Gray,
            disabledInactiveTrackColor = Color.Gray,
            disabledInactiveTickColor = Color.Gray
        ),
        onValueChange = { onValueChange(it) },
        enabled = !visibilityButtonRestart
    )
}