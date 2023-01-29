package com.achilleasoft.android_lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.NonCancellable.message

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent: Intent = getIntent()
        val key: String= "KEY"
        val message: String? = intent.getStringExtra(key)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText(message)
        }
}