package com.example.questapp.ui

import androidx.lifecycle.ViewModel
import com.example.questapp.dataForScreens.ScreenInfo
import com.example.questapp.dataForScreens.ScreenState

class QuestViewModel:ViewModel() {
    var currentState: ScreenState? = null

    fun getStateScreen(key: String){
        currentState = ScreenInfo.screens[key]
    }
}