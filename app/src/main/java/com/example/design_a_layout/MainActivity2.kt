package com.example.design_a_layout

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private  lateinit var image1 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        image1 = findViewById(R.id.image1)
        image1.setImageResource(R.drawable.gig)
    }
}

