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
            val title = edtTitleCreate.text.toString()
            val data = edtDataCreate.text.toString()
            //Log.i("c",title)
            //Log.i("TextView1",data)
            // SharedPreferences area
            val sharedPref: SharedPreferences = getSharedPreferences(Pref_Name, PRIVATE_MODE)
            val editor = sharedPref.edit()
            editor.putString(title,data)
            editor.apply()

            // Toaster
            edtTitleCreate.setText("Insert New Title")
            edtDataCreate.setText("Insert New Data")

        }

    }
}
