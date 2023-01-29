package com.achilleasoft.android_lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent: Intent = getIntent()
        val message: String? = intent.getStringExtra(MainActivity().text)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText(message)
        }
}