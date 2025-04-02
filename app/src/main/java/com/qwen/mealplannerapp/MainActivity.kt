package com.qwen.mealplannerapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Setting up views -- Edittext & Buttons
        val displayMealButton: Button = findViewById<Button>(R.id.displayMealBtn);
        val enterTimeOfDayText: EditText = findViewById<EditText>(R.id.timeOfDay);
        val displayFinalAnswer: TextView = findViewById<TextView>(R.id.displayFinalAnswer)
        val resetButton : Button =  findViewById<Button>(R.id.resetBtn);


        //handle display button clicked
        //get user input  - check against 'time of day'
        displayMealButton.setOnClickListener {

        }
    }
}