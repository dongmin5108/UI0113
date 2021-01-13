package com.example.ui0113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPage1.setOnClickListener {
            btnPage1.visibility = View.INVISIBLE
            btnPage2.visibility = View.VISIBLE
            btnPage3.visibility = View.VISIBLE
        }
        btnPage2.setOnClickListener {
            btnPage1.visibility = View.INVISIBLE
            btnPage2.visibility = View.VISIBLE
            btnPage3.visibility = View.VISIBLE
        }
        btnPage3.setOnClickListener {
            btnPage1.visibility = View.INVISIBLE
            btnPage2.visibility = View.VISIBLE
            btnPage3.visibility = View.VISIBLE
        }
    }
}