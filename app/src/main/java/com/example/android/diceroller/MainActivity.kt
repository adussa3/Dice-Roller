package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImageView: ImageView
    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImageView = findViewById(R.id.dice_image_view)
        rollButton = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        diceImageView.setImageResource(drawableResource)
    }
}