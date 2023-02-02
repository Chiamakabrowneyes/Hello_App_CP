package com.example.hello_app_cp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        val image = findViewById<ImageView>(R.id.bomaImageView)
        button.setOnClickListener{
            Log.v("Hello World", "Button Clicked")
            Toast.makeText(this, "Hello to you!", Toast.LENGTH_LONG).show()
        }

    }
}