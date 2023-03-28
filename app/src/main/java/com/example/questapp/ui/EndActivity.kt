package com.example.questapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.questapp.databinding.EndActivityMainBinding

class EndActivity : AppCompatActivity() {
    private  val binding by lazy { EndActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.starNewGameButtonEndActivity.setOnClickListener {
            onRestartButtonPressed()
        }
    }

    private fun onRestartButtonPressed(){
        val intent = Intent(this, StartActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
}