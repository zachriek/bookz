package com.example.bookz2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bookz2.databinding.ActivityMainBinding
import com.example.bookz2.databinding.ActivitySplashBinding
import com.example.bookz2.utils.setTimer

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private val splashTimer = setTimer(
        timer = 3000,
        interval = 1000,
        onFinish = ::handleNavigateToCategory
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        splashTimer.start()
    }

    private fun handleNavigateToCategory() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}