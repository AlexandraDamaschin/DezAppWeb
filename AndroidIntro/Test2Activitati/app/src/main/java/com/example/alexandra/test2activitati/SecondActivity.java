package com.example.alexandra.test2activitati;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {

    String editText = "";
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText2 = (EditText) findViewById(R.id.editText2);

        String getEditText = getIntent().getStringExtra("EditText1");

        if (getEditText != null) {
            editText2.setText(getEditText);
        }
    }

    public void back(View v) {
        editText = editText2.getText().toString();
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        intent.putExtra("EditText2", editText);
        startActivity(intent);
    }
}
