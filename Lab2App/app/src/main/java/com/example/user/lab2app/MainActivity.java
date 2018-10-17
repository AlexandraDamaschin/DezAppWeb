package com.example.user.lab2app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        functie f = new fc();
        functie g = new gc();
        AutomatMealy myAutomat = new AutomatMealy(f, g);
        System.out.println(myAutomat.evolutie("1", "a"));
    }
}
