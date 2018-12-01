package com.example.alexandra.testactivity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tToast("Starea curenta: onCreate().");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void onClickBtnBack(View view) {
        tToast("Starea curenta: onClickBtnNext().");
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnNext(View view) {
        tToast("Starea curenta: onClickBtnBack().");
        setContentView(R.layout.activity_main2);
    }

    public void onStart() {
        super.onStart();
        tToast("Starea curenta: onStart().");
    }

    public void onRestart() {
        super.onRestart();
        tToast("Starea curenta: onRestart().");
    }

    @Override
    public void onResume() {
        super.onResume();
        tToast("Starea curenta: onResume().");
    }

    public void onPause() {
        super.onPause();
        tToast("Starea curenta: onPause().");
    }

    public void onStop() {
        super.onStop();
        tToast("Starea curenta: onStop().");
    }

    public void onDestroy() {
        super.onDestroy();
        tToast("Starea curenta: onDistroy().");
    }

    private void tToast(String str) {
        Context context = getApplicationContext();
        int time = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, str, time);
        toast.show();
    }
}
