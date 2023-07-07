package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // onClickListener for language Button
        val languageButton = findViewById<ImageView>(R.id.Languages)
        languageButton.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        // onClickListener for Nav bar

        //1. what is H.Pylroi (info about the disease)

        val PyrloiInfo = findViewById<Button>(R.id.whatIsBtn)
        PyrloiInfo.setOnClickListener {
            val intent = Intent(this, whatIs::class.java)
            startActivity(intent)
        }
//
//        //2. what is Pylera (the medication) + ecuational info

        val PylerBtn = findViewById<Button>(R.id.PyleraBtn)
        PylerBtn.setOnClickListener{
            val intent = Intent(this, PyleraInfo::class.java)
            startActivity(intent)
        }

        //schedule button
        val scheduleButton = findViewById<Button>(R.id.scheduleBtn)
        PylerBtn.setOnClickListener{
            val intent = Intent(this, DrugWarning::class.java)
            startActivity(intent)
        }
    }}





