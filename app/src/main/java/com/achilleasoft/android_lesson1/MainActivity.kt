package com.achilleasoft.android_lesson1

import android.content.Intent
import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        val intent: Intent = Intent(
            this@MainActivity,
            SecondActivity::class.java
        )
        val editText: EditText = findViewById(R.id.editTextTextPersonName) as EditText
        val message: String? = editText.text.toString()
        val key:String ="KEY"
        intent.putExtra(key, message)
        startActivity(intent)
    }
}