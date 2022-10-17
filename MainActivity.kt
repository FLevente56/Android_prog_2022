package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private val TAB:String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAB, "onCreate() called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton :Button =findViewById(R.id.start_butt)
        val editText: EditText= findViewById(R.id.txt_box1)
        startButton.setOnClickListener{
            Toast.makeText(applicationContext, "Clicked on Button!", Toast.LENGTH_LONG).show()
            Log.d(TAB,"clicked on button!")

            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("user_name",editText.text.toString())
            startActivity(intent)
        }

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAB, " onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAB, " onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("test123", " onDestroy() called")
    }


}