package com.example.giorgi_sv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_move=findViewById<Button>(R.id.button_move)
        button_move.setOnClickListener {
            val intent = intent (this, second_page:class.java)
            startActivity(intent)
        }

    }
}