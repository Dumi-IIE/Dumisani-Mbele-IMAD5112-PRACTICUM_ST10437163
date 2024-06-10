package com.example.imad5112practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)


        val detailScreenButton = findViewById<Button>(R.id.detailScreen)
        val enterButton = findViewById<Button>(R.id.enter)
        val clearButton = findViewById<Button>(R.id.clear)
        val calculateButton = findViewById<Button>(R.id.calculate)
        val exitButton = findViewById<Button>(R.id.exit)


        var lowAveTextView = findViewById<TextView>(R.id.lowAVE)
        var highAveTextView = findViewById<TextView>(R.id.highAVE)

        var dayInTheWeek = findViewById<TextView>(R.id.daysOfTheWeek)

        var lowTemp = findViewById<EditText>(R.id.minTEMP)
        var maxTemp = findViewById<EditText>(R.id.maxTEMP)

        var flag: Int = 1
        var highAVERAGE: Int = 0
        var lowAVERAGE: Int = 0

        var mondayMIN: Int = 0
        var tuesdayMIN: Int = 0
        var wednesdayMIN: Int = 0
        var thursdayMIN: Int = 0
        var fridayMIN: Int = 0
        var saturdayMIN: Int = 0
        var sundayMIN: Int = 0

        var mondayHIGH: Int = 0
        var tuesdayHIGH: Int = 0
        var wednesdayHIGH: Int = 0
        var thursdayHIGH: Int = 0
        var fridayHIGH: Int = 0
        var saturdayHIGH: Int = 0
        var sundayHIGH: Int = 0

        var lowTempValue: Int = 0
        var highTempValue: Int = 0

        var counter = 0

        var lowAverageTemp: Int
        var highAverageTemp: Int

        enterButton.setOnClickListener {




            while (counter < 7) {
                if (flag == 1) {
                    mondayMIN = lowTemp.toString().toInt()
                    mondayHIGH = maxTemp.toString().toInt()
                    dayInTheWeek.text = "You have entered Monday's temperature"

                } else if (flag == 2) {
                    tuesdayMIN = lowTemp.toString().toInt()
                    tuesdayHIGH = maxTemp.toString().toInt()
                    dayInTheWeek.text = "You have entered Tuesday's temperature"
                } else if (flag == 3) {
                    wednesdayMIN = lowTemp.toString().toInt()
                    wednesdayHIGH = maxTemp.toString().toInt()
                    dayInTheWeek.text = "You have entered Wednesday's temperature"
                } else if (flag == 4) {
                    thursdayMIN = lowTemp.toString().toInt()
                    thursdayHIGH = maxTemp.toString().toInt()
                    dayInTheWeek.text = "You have entered Thursday's temperature"
                } else if (flag == 5) {
                    fridayMIN = lowTemp.toString().toInt()
                    fridayHIGH = maxTemp.toString().toInt()
                    dayInTheWeek.text = "You have entered Friday's temperature"
                } else if (flag == 6) {
                    saturdayMIN = lowTemp.toString().toInt()
                    saturdayHIGH = maxTemp.toString().toInt()
                    dayInTheWeek.text = "You have entered Saturday's temperature"
                } else if (flag == 7) {
                    sundayMIN = lowTemp.toString().toInt()
                    sundayHIGH = maxTemp.toString().toInt()
                    dayInTheWeek.text = "You have entered Sunday's temperature"
                } else if (counter == 7) {
                    lowAverageTemp = ( mondayMIN + tuesdayMIN + wednesdayMIN + thursdayMIN + fridayMIN + saturdayMIN + sundayMIN )/7
                    highAverageTemp = (mondayHIGH + tuesdayHIGH + wednesdayHIGH + thursdayHIGH + fridayHIGH + saturdayHIGH + sundayHIGH)/7

                }

                counter++
                flag++
            }

        }



        val weeklyWeather = arrayOf(
            "Monday",
            "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        )

        calculateButton.setOnClickListener {


        }

        exitButton.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            finish()
        }


        clearButton.setOnClickListener {
            dayInTheWeek.text = null
            maxTemp.text = null
            lowTemp.text = null
            lowAveTextView.text = null
            highAveTextView.text = null
            flag = 1
            counter = 0
        }








        detailScreenButton.setOnClickListener {

            val intent = Intent(this, DetailedScreen::class.java)

            startActivity(intent)

        }
    }
}
