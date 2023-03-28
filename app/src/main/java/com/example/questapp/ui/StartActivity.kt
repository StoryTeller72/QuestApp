package com.example.questapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.questapp.R
import com.example.questapp.dataForScreens.Keys
import com.example.questapp.dataForScreens.ScreenInfo
import com.example.questapp.databinding.ActivityStartBinding

class StartActivity() : AppCompatActivity(R.layout.activity_start) {

    private val binding by lazy {ActivityStartBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.startButtonActivityMain.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        }
    }

}