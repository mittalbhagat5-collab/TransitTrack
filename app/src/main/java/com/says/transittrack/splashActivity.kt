package com.says.transittrack

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Wait for 2 seconds, then open the MapsActivity
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MapsActivity2::class.java))
            finish()
        }, 2000)
    }
}
