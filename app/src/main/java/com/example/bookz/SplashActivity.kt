package com.example.bookz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bookz.utils.setTimer

class SplashActivity : AppCompatActivity() {
    private val splashTimer = setTimer(
        timer = 3000,
        interval = 1000,
        onFinish = ::handleNavigateToMain
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashTimer.start()
    }

    private fun handleNavigateToMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}