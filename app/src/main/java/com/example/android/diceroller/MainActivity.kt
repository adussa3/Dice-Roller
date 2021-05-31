package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // Field variables
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the "Roll" button from the layout
        val rollButton: Button = findViewById(R.id.roll_button)

        // When the "Roll" button is clicked, update the text to a random number between 1 to 6
        rollButton.setOnClickListener{
            rollDice()
        }

        // Set the diceImage field variable to the dice_image
        diceImage = findViewById(R.id.dice_image)
    }

    /**
     * Updated the image to a dice roll image between 1 to 6
     */
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
        diceImage.setImageResource(drawableResource)
    }
}