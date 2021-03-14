package com.begumyolcu.dierollerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundImage1 : ImageView = findViewById(R.id.backgroundImage1)
        backgroundImage1.setImageResource(R.drawable.background)

        RollDice()






    }

    fun RollDice(){

        val diceText1 : TextView = findViewById(R.id.diceText1)
        val diceImage1 : ImageView = findViewById(R.id.diceImage1)
        val diceImage2 : ImageView = findViewById(R.id.diceImage2)
        val rollButton : Button = findViewById(R.id.rollButton)
        val cleanButton : Button = findViewById(R.id.cleanButton)

        val dice1 = Dice(6)
        val dice2 = Dice(6)

        rollButton.setOnClickListener{
            val randomNumber = dice1.roll()
            val randomNumber2 = dice2.roll()

            diceText1.text = "Sayılarınız  $randomNumber ve $randomNumber2'dir"

            when (randomNumber){
                1 -> diceImage1.setImageResource(R.drawable.dice_1)
                2 -> diceImage1.setImageResource(R.drawable.dice_2)
                3 -> diceImage1.setImageResource(R.drawable.dice_3)
                4 -> diceImage1.setImageResource(R.drawable.dice_4)
                5 -> diceImage1.setImageResource(R.drawable.dice_5)
                6 -> diceImage1.setImageResource(R.drawable.dice_6)
            }

            when (randomNumber2){
                1 -> diceImage2.setImageResource(R.drawable.dice_1)
                2 -> diceImage2.setImageResource(R.drawable.dice_2)
                3 -> diceImage2.setImageResource(R.drawable.dice_3)
                4 -> diceImage2.setImageResource(R.drawable.dice_4)
                5 -> diceImage2.setImageResource(R.drawable.dice_5)
                6 -> diceImage2.setImageResource(R.drawable.dice_6)
            }

        }

        cleanButton.setOnClickListener{
            diceText1.text = " "
            diceImage1.setImageResource(R.drawable.empty_dice)
            diceImage2.setImageResource(R.drawable.empty_dice)
        }

    }

class Dice(val Sides: Int) {

    fun roll() : Int {

        return (1..Sides).random()
     }


}

}

