package com.example.diceclicker

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Dice Clicker"

        var diceText:TextView = findViewById(R.id.txtNumber)
        var diceButton: Button = findViewById(R.id.txtButton)

        diceButton.setOnClickListener {
            var randNumber = (1..6).random()
            diceText.text = randNumber.toString()
        }
            }
}