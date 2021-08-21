package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
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
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        toast.show()
        // Create a Dice Obj
        var diceObj = Dice(6);
        var dataToShow = diceObj.roll();

        // Show the dice object values
        var textViewShow: TextView = findViewById(R.id.textView);
        textViewShow.text = dataToShow.toString();
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }
}