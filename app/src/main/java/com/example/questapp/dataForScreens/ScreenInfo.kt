package com.example.questapp.dataForScreens

import com.example.questapp.R

object ScreenInfo {
    val screens = mapOf<String?, ScreenState>(
        Keys.WELCOME_3 to ScreenState(
            amntButtons = 3,
            questionText = R.string.question_android3_firstChoice,
            topButtonsText = R.string.goToJogging,
            keyTopButton = Keys.JOGGING_4,
            middleButtonText = R.string.goToExpedition,
            keyMidleButton = Keys.EXPEDITION_5,
            bottomButtonText = R.string.goToWalkingOnField,
            keyBottomButton = Keys.WALKING_FIELD_6,
            backGround = R.drawable.start_end_background_1_2_3_14
            ),
        Keys.EXPEDITION_5 to ScreenState(
            amntButtons = 2,
            questionText = R.string.question_android4_expedition,
            topButtonsText = null,
            keyTopButton = null,
            middleButtonText = R.string.goHomeLookMovie,
            keyMidleButton = Keys.TALKING_MOVIE_7,
            bottomButtonText = R.string.goCelebrateHalloween,
            keyBottomButton = Keys.DECORATE_ROOM_8,
            backGround = R.drawable.expedition_background_5
        ),
        Keys.WALKING_FIELD_6 to ScreenState(
            amntButtons = 2,
            questionText = R.string.question_field,
            topButtonsText = null,
            keyBottomButton = null,
            middleButtonText = R.string.maybeLookMovie,
            keyMidleButton = Keys.TALKING_MOVIE_7,
            bottomButtonText = R.string.celebrate,
            keyTopButton = Keys.DECORATE_ROOM_8,
            backGround = R.drawable.walking_background_6
        )

    )
}