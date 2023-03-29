package com.example.questapp.dataForScreens

import com.example.questapp.R

object ScreenInfo {
    val screens = mapOf<String?, ScreenState>(
        Keys.WELCOME_3 to ScreenState(
            amntButtons = 3,
            questionText = R.string.question_firstChoice_3,
            topButtonInfo = Pair(R.string.goToJogging_3, Keys.JOGGING_4),
            midButtonInfo = Pair(R.string.goToExpedition_3, Keys.EXPEDITION_5),
            bottomButtonInfo = Pair(R.string.goToWalkingOnField_3, Keys.WALKING_FIELD_6),
            backGround = R.drawable.start_end_background_1_2_3_14,
            lastScreen = false,
            hasCatImage = true,
            hasExtraStringName = true
            ),
        Keys.EXPEDITION_5 to ScreenState(
            amntButtons = 2,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.goHomeLookMovie_5, Keys.TALKING_MOVIE_7),
            bottomButtonInfo = Pair(R.string.celebrate_6, Keys.DECORATE_ROOM_8),
            backGround = R.drawable.expedition_background_5,
            questionText = R.string.question_expedition_5,
            lastScreen = false,
            hasCatImage = false,
            hasExtraStringName = false
        ),
        Keys.JOGGING_4 to ScreenState(
            amntButtons = 2,
            questionText = R.string.jogging_question_4,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.jogging_movie_4, Keys.TALKING_MOVIE_7),
            bottomButtonInfo = Pair(R.string.jogging_halloween_4, Keys.DECORATE_ROOM_8),
            backGround = R.drawable.jogging_background_4,
            lastScreen = false,
            hasCatImage = false,
            hasExtraStringName = false
        ),
        Keys.WALKING_FIELD_6 to ScreenState(
            amntButtons = 2,
            questionText = R.string.question_field_6,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.maybeLookMovie_6, Keys.TALKING_MOVIE_7),
            bottomButtonInfo = Pair(R.string.celebrate_6, Keys.DECORATE_ROOM_8),
            backGround = R.drawable.walking_background_6,
            lastScreen = false,
            hasCatImage = false,
            hasExtraStringName = false
        ),
        Keys.TALKING_MOVIE_7 to ScreenState(
            amntButtons = 2,
            questionText = R.string.watching_movie_question_7,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.watching_movie_positive_7, Keys.TALKING_MOVIE_9),
            bottomButtonInfo = Pair(R.string.watching_movie_negative_7, Keys.TALKING_MOVIE_10),
            backGround = R.drawable.movie_bacground_7_9_10,
            lastScreen = false,
            hasCatImage = false,
            hasExtraStringName = false
        ),
        Keys.TALKING_MOVIE_9 to ScreenState(
            amntButtons = 1,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.late, Keys.END_SCREEN),
            bottomButtonInfo = null,
            questionText = R.string.watching_movie_question_9,
            lastScreen = true,
            backGround = R.drawable.movie_bacground_7_9_10,
            hasCatImage = false,
            hasExtraStringName = false
        ),
        Keys.TALKING_MOVIE_10 to ScreenState(
            amntButtons = 1,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.late, Keys.END_SCREEN),
            bottomButtonInfo = null,
            questionText = R.string.watching_movie_question_10,
            backGround = R.drawable.movie_bacground_7_9_10,
            lastScreen = true,
            hasCatImage = false,
            hasExtraStringName = false
        ),
        Keys.DECORATE_ROOM_8 to ScreenState(
            amntButtons = 2,
            questionText = R.string.decorate_room_question_8,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.decorate_room_option_movie_8, Keys.TALKING_MOVIE_7),
            bottomButtonInfo = Pair(R.string.decorate_room_option_costume_8, Keys.TALKING_COSTUME_11),
            lastScreen = false,
            backGround = R.drawable.halloween_preparing_bacground_8,
            hasCatImage = false,
            hasExtraStringName = false
        ),
        Keys.TALKING_COSTUME_11 to ScreenState(
            amntButtons = 2,
            questionText = R.string.party_question_11,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.party_option_positive_11, Keys.TALKING_COSTUME_THANKS_12),
            bottomButtonInfo = Pair(R.string.party_option_negative_11, Keys.TALKING_COSTUME_13),
            backGround = R.drawable.costumes_bacground_11_12_13,
            lastScreen = false,
            hasCatImage = false,
            hasExtraStringName = false
        ),

        Keys.TALKING_COSTUME_THANKS_12 to ScreenState(
            amntButtons = 1,
            questionText = R.string.party_header_positive_12,
            topButtonInfo = null,
            midButtonInfo = Pair(R.string.late, Keys.END_SCREEN),
            bottomButtonInfo = null,
            backGround = R.drawable.costumes_bacground_11_12_13,
            lastScreen = true,
            hasCatImage = false,
            hasExtraStringName = false
        ),
        Keys.TALKING_COSTUME_13 to ScreenState(
            amntButtons = 1,
            questionText = R.string.party_header_13,
            topButtonInfo = null,
            bottomButtonInfo = null,
            midButtonInfo = Pair(R.string.late, Keys.END_SCREEN),
            lastScreen = true,
            backGround = R.drawable.costumes_bacground_11_12_13,
            hasCatImage = false,
            hasExtraStringName = false
        )
    )
}