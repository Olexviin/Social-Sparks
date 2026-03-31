package com.example.myfirstcode


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.graphics.Color
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

                val inputTime = findViewById<EditText>(R.id.editTextTime)
                val resultText = findViewById<TextView>(R.id.textViewResult)
                val suggestButton = findViewById<Button>(R.id.buttonSuggest)
                val resetButton = findViewById<Button>(R.id.buttonReset)

                // Suggest button logic
                suggestButton.setOnClickListener {

                    val userInput = inputTime.text.toString().trim().lowercase()

                    val suggestion = when (userInput) {

                        "morning" ->
                            "Send a 'Good morning' message to a family member "

                        "mid-morning" ->
                            "Message a colleague with a quick 'Thank you' "

                        "afternoon" ->
                            "Share a funny meme or interesting link "

                        "afternoon snack time" ->
                            "Send a 'Thinking of you' message "

                        "dinner" ->
                            "Make a quick 5-minute call to a loved one "

                        "night", "after dinner" ->
                            "Leave a meaningful comment on a friend’s post "

                        else ->
                            "Oops! That time isn’t valid \nTry: Morning, Afternoon, Dinner, or Night."
                    }

                    // Change text color based on result
                    if (suggestion.startsWith("Oops")) {
                        resultText.setTextColor(Color.RED)
                    } else {
                        resultText.setTextColor(Color.parseColor("#2E7D32")) // green
                    }

                    resultText.text = suggestion
                }

                // Reset button logic
                resetButton.setOnClickListener {
                    inputTime.text.clear()
                    resultText.text = "Your social spark will appear here"
                    resultText.setTextColor(Color.parseColor("#333333"))
                }
            }
        }

