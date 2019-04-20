package com.example.wit_project

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_delete.*

class DeleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)

        btnDeleteActivity.setOnClickListener {
            val title = edtTitleDelete.text.toString()

            val sharedPref: SharedPreferences = getSharedPreferences(Pref_Name, PRIVATE_MODE)
            val editor = sharedPref.edit()
            editor.remove(title)
            editor.apply()

            edtTitleDelete.setText("Data Successfully Deleted")
        }
    }
}
