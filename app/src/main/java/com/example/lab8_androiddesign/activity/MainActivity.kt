package com.example.lab8_androiddesign.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab8_androiddesign.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_bai1.setOnClickListener {
            startActivity(Intent(this, Bai1::class.java))
        }

        button_bai2.setOnClickListener {
            startActivity(Intent(this, Bai2::class.java))
        }


    }
}