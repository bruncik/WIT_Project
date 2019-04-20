package com.example.wit_project

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_read.*

class ReadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)

        btnReadActivity.setOnClickListener {
            val title = edtReadActivity.text.toString()

            val sharedPref: SharedPreferences = getSharedPreferences(com.example.wit_project.Pref_Name, com.example.wit_project.PRIVATE_MODE)
            val data = sharedPref.getString(title,"no data for this title")

            tvData.text = data
            edtReadActivity.setText("Read another data")
        }
    }
}
