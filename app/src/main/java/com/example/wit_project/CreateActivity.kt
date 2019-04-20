package com.example.wit_project

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create.*

val PRIVATE_MODE = 0
val Pref_Name : String = "witApp"

class CreateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        btnCreateActivity.setOnClickListener {
            // Taking the data from textView
            val title = edtTitle.text.toString()
            val data = edtData.text.toString()

            // SharedPreferences area
            val sharedPref: SharedPreferences = getSharedPreferences(Pref_Name, PRIVATE_MODE)
            val editor = sharedPref.edit()
            editor.putString(title,data)
            editor.apply()

        }

    }
}
