package com.dylan.anotafacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat
import com.dylan.anotafacil.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        HandlerCompat.postDelayed(Handler(), {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, null, 2000)
    }
}