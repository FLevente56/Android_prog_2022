package com.example.quizapp

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Instrumentation.ActivityResult
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private val TAB: String = javaClass.simpleName
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAB, "onCreate called")

        val startButton: Button = findViewById(R.id.buttonStart)
        val name: EditText = findViewById(R.id.userName)
        startButton.setOnClickListener{
            Toast.makeText(applicationContext, "Clicked on button", Toast.LENGTH_LONG).show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("userName", name.text.toString())
            startActivity(intent)
        }
    }

  

    override fun onPause() {
        super.onPause()
        Log.d(TAB, "onPause called\n")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAB, "onStop called\n")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAB, "onDestroy called\n")
    }
}