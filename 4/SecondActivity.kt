package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        init()
    }

    private fun init(){
        val message = intent.getStringExtra("userName")

        val nameTextView = findViewById<TextView>(R.id.userName)
        nameTextView.text = message
    }
}