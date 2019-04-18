package com.example.wit_project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreate.setOnClickListener {
            val createInted = Intent(this, CreateActivity::class.java)
            startActivity(createInted)
        }

        btnRead.setOnClickListener {
            val readInted = Intent(this, ReadActivity::class.java)
            startActivity(readInted)
        }

        btnUpdate.setOnClickListener {
            val updateInted = Intent(this, UpdateActivity::class.java)
            startActivity(updateInted)
        }

        btnDelete.setOnClickListener {
            val deleteInted = Intent(this, DeleteActivity::class.java)
            startActivity(deleteInted)
        }

    }
}
