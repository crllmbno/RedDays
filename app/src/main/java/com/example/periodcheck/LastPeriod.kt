package com.example.periodcheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.ImageButton
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale




class LastPeriod : AppCompatActivity() {

    private lateinit var calendarView: CalendarView
    private var selectedDate: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_period)

        calendarView = findViewById(R.id.calendarView)

        // date change listener to track the selected date
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val calendar = Calendar.getInstance()
            calendar.set(year, month, dayOfMonth)
            selectedDate = calendar.timeInMillis


            Toast.makeText(this, "Selected date: ${formatDate(selectedDate)}", Toast.LENGTH_SHORT).show()
        }
        val myImageButton = findViewById<ImageButton>(R.id.btnNext1)
        myImageButton.setOnClickListener {
            val intent = Intent(this, LastPeriod2::class.java)
            startActivity(intent)
        }
    }

    private fun formatDate(dateInMillis: Long): String {
        val dateFormat = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
        return dateFormat.format(dateInMillis)
    }
}
