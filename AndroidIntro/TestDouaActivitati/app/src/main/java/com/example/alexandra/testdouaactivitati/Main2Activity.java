package com.example.alexandra.testdouaactivitati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = this.getIntent().getExtras();
        String user_id = bundle.getString("user_id");

        TextView tv = (TextView) findViewById(R.id.text_received);
        tv.setText(user_id);

        Button next = (Button) findViewById(R.id.button_second_activity);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Bundle b = new Bundle();
                Intent i = new Intent();

                b.putString("abc", "From second activity to first activity");
                i.putExtras(b);
                setResult(1, i);
                finish();
            }
        });
    }
}
