package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SchedulingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scheduling_page)

        val homeBtn = findViewById<ImageView>(R.id.HomeBtn2)
        homeBtn.setOnClickListener {
            val intent = Intent(this, Dosage_Information::class.java)
            startActivity(intent)
        }
    }
}