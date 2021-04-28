package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

/*
Main activity located in java folder
Resources and static content located in Res folder
Manifest located in manfests which tell OS info to run your app
Gradle scripts contain compiled code to run the application APK.
*/

/*
*Activity class takes care of creating a window for you in which you can place your UI with setContentView(View)
 */
class MainActivity : AppCompatActivity()

{
     lateinit var image:ImageView // this will not be a null, avoid null checks

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RollButton: Button = findViewById<Button>(R.id.roll_button)
        image = findViewById<ImageView>(R.id.dice_image)
        RollButton.setOnClickListener {
            rollDice()


        }
    }



        private fun rollDice() {


            val imagePath = when (Random.nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }


            image.setImageResource(imagePath)
        }
    }