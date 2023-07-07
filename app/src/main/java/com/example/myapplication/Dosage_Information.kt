package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Dosage_Information : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosage_information)

        val accept_2 = findViewById<ImageView>(R.id.accept_2)
        accept_2.setOnClickListener {
            val intent = Intent(this, SchedulingPage::class.java)
            startActivity(intent)
        }
    }
}