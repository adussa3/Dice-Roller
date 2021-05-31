package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the "Roll" button from the layout
        val rollButton: Button = findViewById(R.id.roll_button)

        // When the "Roll" button is clicked, update the text to a random number between 1 to 6
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    /**
     * Updated the text to a random number between 1 to 6
     */
    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random.nextInt(6) + 1

        resultText.text = randomInt.toString()
    }
}