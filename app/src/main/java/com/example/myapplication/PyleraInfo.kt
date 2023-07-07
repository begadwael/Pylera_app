package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PyleraInfo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pylera_info)

        val homeBtn = findViewById<ImageView>(R.id.btnHome2)
        homeBtn.setOnClickListener {
            // Define the action to be performed when the button is clicked
            // For example, you can start a new activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}