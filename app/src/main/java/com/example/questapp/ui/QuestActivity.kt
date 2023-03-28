package com.example.questapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.questapp.R
import com.example.questapp.dataForScreens.ScreenInfo
import com.example.questapp.dataForScreens.ScreenState
import com.example.questapp.databinding.ActivityQuestBinding

class QuestActivity : AppCompatActivity() {

    private val binding by lazy{ActivityQuestBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        drawScreen()
    }

    private fun drawScreen() {
        val name = intent.getStringExtra("name")
        val key = intent.getStringExtra("info")
        if (name != null) {
            binding.questionTextViewQuestActivity.text =
                resources.getString(R.string.question_android3_firstChoice, name)
            binding.catImageViewQuestActivity.visibility = ImageView.VISIBLE
        }
        val state = ScreenInfo.screens[key]
        state?.backGround?.let { binding.backGroundImageViewQuestActivity.setImageResource(it) }

        val listOfButtons = listOf(binding.topButtonQuestActivity, binding.midButtonQuestActivity, binding.bottomButtonQuestActivity)
        val listOfButtonInfo = listOfButtons
        when(state?.amntButtons){
            1 ->{
                binding.midButtonQuestActivity.text = resources.getString(state.middleButtonText)
            }
            2->{
                binding.midButtonQuestActivity.text = resources.getString(state.middleButtonText)
                binding.bottomButtonQuestActivity.text =
                    state.bottomButtonText?.let { resources.getString(it) }
            }
            else -> {
                binding.topButtonQuestActivity.text =
                    state?.topButtonsText?.let { resources.getString(it) }
                binding.topButtonQuestActivity.setOnClickListener {
                    val intent = Intent(this, QuestActivity::class.java)
                    intent.putExtra("info",state?.keyTopButton)
                    startActivity(intent)
                }

                binding.midButtonQuestActivity.text =
                    state?.middleButtonText?.let {  resources.getString(it)}
                binding.midButtonQuestActivity.setOnClickListener {
                    val intent = Intent(this, QuestActivity::class.java)
                    intent.putExtra("info",state?.keyMidleButton)
                    startActivity(intent)
                }
                binding.bottomButtonQuestActivity.text =
                    state?.bottomButtonText?.let { resources.getString(it) }
                binding.bottomButtonQuestActivity.setOnClickListener {
                    val intent = Intent(this, QuestActivity::class.java)
                    intent.putExtra("info",state?.keyBottomButton)
                    startActivity(intent)
                }
            }
        }
    }
}