package com.example.questapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.questapp.R
import com.example.questapp.dataForScreens.Keys
import com.example.questapp.databinding.ActivityNameBinding

class NameActivity : AppCompatActivity() {

    private val binding by lazy { ActivityNameBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.confirmButtonNameActivity.setOnClickListener {
            val  name = binding.inputNameEditTextNameActivity.text
            val intent = Intent(this, QuestActivity::class.java)
            intent.putExtra("name", name.toString())
            intent.putExtra("info",Keys.WELCOME_3 )
            startActivity(intent)
        }
    }
}