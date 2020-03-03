package com.example.kotlin_bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1 = findViewById<EditText>(R.id.editText1)
        val et2 = findViewById<EditText>(R.id.editText2)
        val btn_event = findViewById<Button>(R.id.button)
        val resultView = findViewById<TextView>(R.id.textView2)

        btn_event.setOnClickListener{
            val kg = Integer.parseInt(et2.text.toString())
            val cm = Integer.parseInt(et1.text.toString())

            val bmi = kg / Math.pow(cm / 100.0, 2.0)

            when {
                bmi >= 35 -> resultView.text = "초고도비만"
                bmi >= 30 -> resultView.text = "고도비만"
                bmi >= 25 -> resultView.text = "비만"
                bmi >= 13 -> resultView.text = "과체중"
                bmi >= 18.5 -> resultView.text = "정상"
                else -> resultView.text = "저체중"
            }

        }
    }
}
