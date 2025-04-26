package com.example.gsonapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRun = findViewById<Button>(R.id.btnRun)
        btnRun.setOnClickListener {
            //Toast.makeText(this@MainActivity, "Клик на кнопке", Toast.LENGTH_SHORT).show()
        }
    }
}