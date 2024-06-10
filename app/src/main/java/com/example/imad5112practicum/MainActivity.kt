package com.example.imad5112practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mainScreen = findViewById<Button>(R.id.mainButton)
        mainScreen.setOnClickListener {

            val intent = Intent(this, MainScreen::class.java)

            startActivity(intent)
        }

    }
}
