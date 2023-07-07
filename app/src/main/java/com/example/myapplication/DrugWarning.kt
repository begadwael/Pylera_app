package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DrugWarning : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drug_warning)

        val accept_1 = findViewById<ImageView>(R.id.accept_1)
        accept_1.setOnClickListener {
            val intent = Intent(this, Dosage_Information::class.java)
            startActivity(intent)
        }
    }
}