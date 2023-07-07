package com.example.periodcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.widget.ImageButton


class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val isFirstTime = sharedPreferences.getBoolean("isFirstTime", true)

        if (isFirstTime) {
            // Show the onboarding content
            setContentView(R.layout.activity_welcome)

            // Update the shared preferences to indicate that onboarding has been shown
            val editor = sharedPreferences.edit()
            editor.putBoolean("isFirstTime", false)
            editor.apply()
        } else {
            // Proceed to the next screen (e.g., MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val myImageButton = findViewById<ImageButton>(R.id.btnNext)

        myImageButton.setOnClickListener {
            val intent = Intent(this, Question1::class.java)
            startActivity(intent)
        }

    }
}





