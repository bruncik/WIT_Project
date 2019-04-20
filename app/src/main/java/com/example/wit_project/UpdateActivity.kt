package com.example.wit_project

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create.*
import kotlinx.android.synthetic.main.activity_update.*

class UpdateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)

        btnUpdateActivity.setOnClickListener {
            val title = edtTitleUpdate.text.toString()
            val data = edtDataUpdate.text.toString()

            val sharedPref: SharedPreferences = getSharedPreferences(com.example.wit_project.Pref_Name, com.example.wit_project.PRIVATE_MODE)
            val editor = sharedPref.edit()
            editor.putString(title,data)
            editor.apply()

            // Toaster
            edtTitleUpdate.setText("Insert New Title For Updating")
            edtDataUpdate.setText("Insert New Data For Updating")
        }
    }
}
