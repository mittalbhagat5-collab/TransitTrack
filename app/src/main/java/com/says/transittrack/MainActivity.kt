package com.says.transittrack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Start the map screen directly
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
        finish()
    }
}
