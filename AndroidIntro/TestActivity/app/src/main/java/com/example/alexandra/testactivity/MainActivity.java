package com.example.alexandra.testactivity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //here onCreate() is used to set the user interface of the activity
        setContentView(R.layout.activity_main);
        showToast("Starea curenta: onCreate().");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void onClickBtnBack(View view) {
        showToast("Starea curenta: onClickBtnNext().");
        setContentView(R.layout.activity_main);
        Log.i("", "Starea curenta: onClickBtnNext().");
    }

    public void onClickBtnNext(View view) {
        showToast("Starea curenta: onClickBtnBack().");
        setContentView(R.layout.activity_main2);
        Log.i("", "Starea curenta: onClickBtnBack().");
    }

    public void onStart() {
        super.onStart();
        //After execution the activity becomes visible to the user
        //and moves to running stats
        showToast("Starea curenta: onStart().");
        Log.i("", "Starea curenta: onStart().");
    }

    public void onRestart() {
        super.onRestart();
        //fetches the already created instance of the activity and make it visible
        showToast("Starea curenta: onRestart().");
        Log.i("", "Starea curenta: onRestart().");
    }

    @Override
    public void onResume() {
        super.onResume();
        //returns to the resumed state
        showToast("Starea curenta: onResume().");
        Log.i("", "Starea curenta: onResume().");
    }

    public void onPause() {
        super.onPause();
        //store the user progress and prepare the system to release
        //the resources that are not needed
        showToast("Starea curenta: onPause().");
        Log.i("", "Starea curenta: onPause().");
    }

    public void onStop() {
        super.onStop();
        //store the user progress and release the resources that are not needed
        showToast("Starea curenta: onStop().");
        Log.i("", "Starea curenta: onStop().");
    }

    public void onDestroy() {
        super.onDestroy();
        //kill all the background process and release all the resources
        showToast("Starea curenta: onDistroy().");
        Log.i("", "Starea curenta: onDistroy().");
    }

    private void showToast(String str) {
        Context context = getApplicationContext();
        int time = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, str, time);
        toast.show();
    }
}
