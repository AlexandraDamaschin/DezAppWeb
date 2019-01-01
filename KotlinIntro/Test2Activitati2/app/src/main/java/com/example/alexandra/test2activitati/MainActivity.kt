package com.example.alexandra.test2activitati

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var editText = ""
    private lateinit var editText1: EditText
    private var getEditText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById<View>(R.id.editText1) as EditText

        getEditText = intent.getStringExtra("EditText2")

        editText1.setText(getEditText)
    }

    fun next(v: View) {
        editText = editText1.text.toString()
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("EditText1", editText)
        startActivity(intent)
    }
}
