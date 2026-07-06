package com.infinitycamai

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCamera = findViewById<Button>(R.id.btnCamera)

        btnCamera.setOnClickListener {
            Toast.makeText(this, "Kamera AI akan segera dibuka", Toast.LENGTH_SHORT).show()
        }
    }
}
