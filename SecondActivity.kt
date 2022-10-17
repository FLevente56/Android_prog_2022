package com.example.lab3;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        init()
    }

    private fun init()
    {
        val message=intent.getStringExtra("user_name")
        val nameTextView = findViewById<TextView>(R.id.txt_box2)
        nameTextView.text=message
    }
}
