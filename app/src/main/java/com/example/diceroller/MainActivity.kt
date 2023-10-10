package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class Dice(private val nSides: Int) {
	fun roll(): Int {
		return (1..nSides).random()
	}
}
class MainActivity : ComponentActivity() {
	private fun rollDice() {
		val result = Dice(6).roll()
		val resultTextView: TextView = findViewById(R.id.textView)
		resultTextView.text = result.toString()
	}
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val rollButton: Button = findViewById(R.id.button)
		rollButton.setOnClickListener {
			Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
			rollDice()
		}
	}
}