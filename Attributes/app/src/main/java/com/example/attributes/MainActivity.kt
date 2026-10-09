package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)

        findViewById<Button>(R.id.btn_black).setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        findViewById<Button>(R.id.btn_red).setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        findViewById<Button>(R.id.btn_size8).setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
        }

        findViewById<Button>(R.id.btn_size24).setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }

        findViewById<Button>(R.id.btn_white).setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        findViewById<Button>(R.id.btn_yellow).setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}