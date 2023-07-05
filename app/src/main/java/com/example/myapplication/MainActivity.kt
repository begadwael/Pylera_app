package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val englishButton = findViewById<Button>(R.id.englishLang)

        englishButton.setOnClickListener {
            // Define the action to be performed when the button is clicked
            // For example, you can start a new activity
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }



    }





}