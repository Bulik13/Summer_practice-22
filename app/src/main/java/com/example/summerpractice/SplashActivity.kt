package com.example.summerpractice

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var name: EditText = findViewById(R.id.et_name)
        var height: EditText = findViewById(R.id.et_height)
        var weight: EditText = findViewById(R.id.et_weight)
        var age: EditText = findViewById(R.id.et_age)
        var button: Button = findViewById(R.id.b_answer)
        var answer: TextView = findViewById(R.id.tv_answer)

        button.setOnClickListener {
            if(name.text.length > 0 && age.text.length > 0 && height.text.length > 0 && weight.text.length > 0){
                if (name.text.length > 50 || age.text.length > 150 || weight.text.length > 250|| height.text.length > 250) {
                    answer.setText("Данные введены некорректно.")
                }

                else {
                    var value = name.text.length*100 + age.text.toString().toInt() * age.text.toString().toInt() *
                            weight.text.toString().toFloat() + name.text.length*5 - height.text.toString().toInt()*2
                    answer.setText("Ответ: $value")
                }
            }
            else
                answer.setText("Данные введены некорректно.")
        }
    }
}