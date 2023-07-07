package com.example.periodcheck


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class SplashScreen : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        val SPLASH_DELAY: Long = 3000 // Delay time in milliseconds (3 seconds)

        Handler(Looper.getMainLooper()).postDelayed({
            // Proceed to the onboarding screen (OnboardingActivity)
            val intent = Intent(this, Welcome::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }
}














