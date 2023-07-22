package com.example.periodcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.CalendarView
import android.widget.Button
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale




class LastPeriod2 : AppCompatActivity() {

    private lateinit var calendarView: CalendarView
    private var selectedDate: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_period2)

        calendarView = findViewById(R.id.calendarView)

        // date change listener to track the selected date
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val calendar = Calendar.getInstance()
            calendar.set(year, month, dayOfMonth)
            selectedDate = calendar.timeInMillis


            Toast.makeText(this, "Selected date: ${formatDate(selectedDate)}", Toast.LENGTH_SHORT).show()
        }
        val myButton = findViewById<Button>(R.id.btnNext1)
        myButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun formatDate(dateInMillis: Long): String {
        val dateFormat = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
        return dateFormat.format(dateInMillis)
    }
}