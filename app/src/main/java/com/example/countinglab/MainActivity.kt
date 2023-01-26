package com.example.countinglab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val upgradeButton = findViewById<Button>(R.id.buttonSecond)
        button.setOnClickListener {
            counter++
            textView.text = counter.toString()
            if(counter >= 100) {
                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener {
                    //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()

                    button.setOnClickListener {
                        counter += 2
                        textView.text = counter.toString()
                    }
                    button.text = getString(R.string.Add_2)
                    upgradeButton.visibility = View.INVISIBLE
                }
                }
            }
    }
}