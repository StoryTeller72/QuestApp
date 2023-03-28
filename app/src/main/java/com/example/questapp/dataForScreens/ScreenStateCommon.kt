package com.example.questapp.dataForScreens



data class ScreenStateCommon(
    val amntButtons: Int,
    val questionText: Int,
    val topButtonInfo: Pair<Int, String>?,
    val midButtonInfo: Pair<Int, String>?,
    val bottomButtonInfo: Pair<Int, String>?,
    val backGround: Int,
    val lastScreen: Boolean,
    val hasCatImage:Boolean,
    val hasExtraStringName: Boolean
)



