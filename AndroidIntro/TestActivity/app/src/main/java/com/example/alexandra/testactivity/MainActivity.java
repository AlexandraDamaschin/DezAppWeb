package com.example.alexandra.testactivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //here onCreate() is used to set the user interface of the activity
        setContentView(R.layout.activity_main);
        showToast("Starea curenta: onCreate().");
    }

    public void onClickBtnBack(View view) {
        showToast("Starea curenta: onClickBtnNext().");
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnNext(View view) {
        showToast("Starea curenta: onClickBtnBack().");
        setContentView(R.layout.activity_main2);
    }

    public void onStart() {
        super.onStart();
        //After execution the activity becomes visible to the user
        //and moves to running stats
        showToast("Starea curenta: onStart().");
    }

    public void onRestart() {
        super.onRestart();
        //fetches the already created instance of the activity and make it visible
        showToast("Starea curenta: onRestart().");
    }

    @Override
    public void onResume() {
        super.onResume();
        //returns to the resumed state
        showToast("Starea curenta: onResume().");
    }

    public void onPause() {
        super.onPause();
        //store the user progress and prepare the system to release
        //the resources that are not needed
        showToast("Starea curenta: onPause().");
    }

    public void onStop() {
        super.onStop();
        //store the user progress and release the resources that are not needed
        showToast("Starea curenta: onStop().");
    }

    public void onDestroy() {
        super.onDestroy();
        //kill all the background process and release all the resources
        showToast("Starea curenta: onDistroy().");
    }

    private void showToast(String str) {
        Context context = getApplicationContext();
        int time = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, str, time);
        toast.show();
    }
}
