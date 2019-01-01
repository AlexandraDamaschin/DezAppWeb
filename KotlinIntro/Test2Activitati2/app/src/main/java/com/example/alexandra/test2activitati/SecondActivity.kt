package com.example.alexandra.test2activitati

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    private var editText = ""
    private lateinit var editText2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        editText2 = findViewById<View>(R.id.editText2) as EditText

        val getEditText = intent.getStringExtra("EditText1")

        if (getEditText != null) {
            editText2.setText(getEditText)
        }
    }

    fun back(v: View) {
        editText = editText2.text.toString()
        val intent = Intent(this@SecondActivity, MainActivity::class.java)
        intent.putExtra("EditText2", editText)
        startActivity(intent)
    }
}
