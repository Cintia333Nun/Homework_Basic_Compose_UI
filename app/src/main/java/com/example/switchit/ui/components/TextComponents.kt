package com.example.switchit.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.switchit.R

@Composable
fun TitleText() {
    Text(
        modifier = Modifier.padding(top = 30.dp, bottom = 20.dp),
        text = stringResource(R.string.switch_it),
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold
    )
}