package com.example.switchit

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    private val _countPlayerBlue = MutableStateFlow(0)
    val countPlayerBlue = _countPlayerBlue.asStateFlow()

    private val _countPlayerRed = MutableStateFlow(0)
    val countPlayerRed = _countPlayerRed.asStateFlow()


    private val _topCount = MutableStateFlow(1F)
    val topCount = _topCount.asStateFlow()

    private val _visibilityButtonRestart = MutableStateFlow(false)
    val visibilityButtonRestart = _visibilityButtonRestart.asStateFlow()

    fun restartPlay()  {
        _countPlayerBlue.value = 0
        _countPlayerRed.value = 0
        _topCount.value = 1F
        _visibilityButtonRestart.value = false
    }

    fun onCheckedSwitchBlue() {
        _countPlayerBlue.value += 1
        _visibilityButtonRestart.value = checkToRestart()
    }

    fun onCheckedSwitchRed() {
        _countPlayerRed.value += 1
        _visibilityButtonRestart.value = checkToRestart()
    }

    private fun checkToRestart() = (countPlayerBlue.value == topCount.value.toInt() || countPlayerRed.value == topCount.value.toInt())

    fun setTopCount(value: Float) {
        _topCount.value = value
    }
}