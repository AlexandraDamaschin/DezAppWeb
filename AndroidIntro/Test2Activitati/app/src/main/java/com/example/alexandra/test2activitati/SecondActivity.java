package com.example.alexandra.test2activitati;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String getEditText = getIntent().getStringExtra("EditText1");
        Log.e("editText1", getEditText);

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setText(getEditText);
    }

    public void back(View v) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
