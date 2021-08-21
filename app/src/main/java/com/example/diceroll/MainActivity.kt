package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
Dice Class
 **/
class Dice(private val numberOfSides: Int) {
    fun roll(): Int {
        return ((1..numberOfSides).random())
    }
}

class MainActivity : AppCompatActivity() {
    /**
    Roll Dice function
     **/
    private fun rollDice() {
        // Toast message
//        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//        toast.show()
        // Create a Dice Obj
        var diceObj = Dice(6);
        var dataToShow = diceObj.roll();
        var diceImage: ImageView = findViewById(R.id.imageView);
        // Show the dice object values
        var result = when (dataToShow) {
            1 -> R.drawable.dice_1;
            2 -> R.drawable.dice_2;
            3 -> R.drawable.dice_3;
            4 -> R.drawable.dice_4;
            5 -> R.drawable.dice_5;
            else -> R.drawable.dice_6;
        }
//        Set Image based on roll
        diceImage.setImageResource(result);
//        Update the image description
        diceImage.contentDescription = result.toString();
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
        val rollButton2: Button = findViewById(R.id.button2)
        rollButton2.setOnClickListener {
            rollDice()
            rollDice()
        }
//        Initial Load
//        rollDice()
        var diceImage: ImageView = findViewById(R.id.imageView);
        diceImage.setImageResource(R.drawable.dice_1);
    }
}