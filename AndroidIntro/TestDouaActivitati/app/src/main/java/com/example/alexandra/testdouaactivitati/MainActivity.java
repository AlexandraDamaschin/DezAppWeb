package com.example.alexandra.testdouaactivitati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = (Button) findViewById(R.id.next_activity);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String user_id = "FirstActivity: How are you SecondActivity ?";
                Intent intent_msg = new Intent(v.getContext(),
                        Main2Activity.class);
                Bundle bundle_msg = new Bundle();
                bundle_msg.putString("user_id", user_id);
                intent_msg.putExtras(bundle_msg);
                startActivityForResult(intent_msg, 1);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle b = data.getExtras();
        String s = b.getString("abc");
        Toast.makeText(this, s.toString(), Toast.LENGTH_SHORT).show();
    }
}
