package com.example.questapp.ui


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import com.example.questapp.R
import com.example.questapp.dataForScreens.ScreenInfo
import com.example.questapp.databinding.ActivityQuestBinding

class QuestActivity : AppCompatActivity() {

    private val binding by lazy { ActivityQuestBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        drawScreen()
    }

    private fun drawScreen() {
        val name = intent.getStringExtra("name")
        val keyFromIntent = intent.getStringExtra("info")
        val state = ScreenInfo.screens[keyFromIntent]
        state?.backGround?.let { binding.backGroundImageViewQuestActivity.setImageResource(it) }


        if (state?.hasExtraStringName == true) {
            binding.questionTextViewQuestActivity.text =
                resources.getString(R.string.question_firstChoice_3, name)
        }else{
            binding.questionTextViewQuestActivity.text = state?.questionText?.let {
                resources.getString(
                    it
                )
            }
        }
        if(state?.hasCatImage == true){
            binding.catImageViewQuestActivity.visibility = AppCompatImageView.VISIBLE
        }

        val mapOfButtons = mapOf(
            binding.topButtonQuestActivity to state?.topButtonInfo,
            binding.midButtonQuestActivity to state?.midButtonInfo,
            binding.bottomButtonQuestActivity to state?.bottomButtonInfo
        )

        mapOfButtons.forEach { (key, value) ->
            if (value == null) key.visibility = AppCompatButton.GONE
            else{
                key.text = resources.getString(value.first)
                key.setOnClickListener {
                    val intent =
                    if(state?.lastScreen == true){
                        Intent(this, EndActivity::class.java)
                    }
                    else {
                        Intent(this, QuestActivity::class.java)
                        intent.putExtra("info", value.second)
                    }
                    startActivity(intent)
                }
            }
        }
    }
}