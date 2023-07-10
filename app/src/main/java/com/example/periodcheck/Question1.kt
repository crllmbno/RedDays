package com.example.periodcheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Button
import android.widget.Spinner

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        val itemList = listOf(
            "1 day",
            "2 days",
            "3 days",
            "4 days",
            "5 days",
            "6 days",
            "7 days",
            "More than 7 days"
        )
        val spinner = findViewById<Spinner>(R.id.spinner)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itemList)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter

        val editText: EditText = findViewById(R.id.editName)

        val myButton = findViewById<Button>(R.id.btnNext1)

        myButton.setOnClickListener {
            val intent = Intent(this, LastPeriod::class.java)
            startActivity(intent)
        }

    }
}




