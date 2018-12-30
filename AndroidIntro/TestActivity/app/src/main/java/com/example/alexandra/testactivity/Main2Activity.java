package com.example.alexandra.testactivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickBtnBack(View view) {
        tToast("Starea curenta: onClickBtnNext().");
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnNext(View view) {
        tToast("Starea curenta: onClickBtnBack().");
        setContentView(R.layout.activity_main2);
    }

    private void tToast(String str) {
        Context context = getApplicationContext();
        int time = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, str, time);
        toast.show();
    }
}
