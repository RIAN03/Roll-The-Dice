package com.example.rollthedice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll_button = findViewById<Button>(R.id.roll_button).setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
        var randomNo= Diceroll(6).dice()
        var imageDice:Int
        when (randomNo) {
            1 -> {
                imageDice = R.drawable.dice_1
            }
            2 -> {
                imageDice = R.drawable.dice_2
            }
            3 -> {
                imageDice = R.drawable.dice_3
            }
            4 -> {
                imageDice = R.drawable.dice_4
            }
            5 -> {
                imageDice = R.drawable.dice_5
            }
            else -> {
                imageDice = R.drawable.dice_6
            }
        }
        val diceimage = findViewById<ImageView>(R.id.dice_image).setImageResource(imageDice)
        Toast.makeText(this,"Dice is Rolled ",Toast.LENGTH_SHORT).show()
    }
}
class Diceroll(private val numsides: Int) {
    public
    fun dice(): Int{
        return (1..numsides).random()
    }
}