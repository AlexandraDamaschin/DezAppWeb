package com.example.alexandra.hashsetab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), HashSetService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), HashSetService.class));
    }

    // Union A and B
    public void unionService(View view) {
        startService(new Intent(getBaseContext(), HashSetService.class));
    }

    // Intersect A and B
    public void intersectionService(View view) {
        startService(new Intent(getBaseContext(), HashSetService.class));
    }

    // Difference between A and B
    public void differenceService(View view) {
        startService(new Intent(getBaseContext(), HashSetService.class));
    }

    // Symmetric Difference between A and B
    public void symmetricDifference(View view) {
        startService(new Intent(getBaseContext(), HashSetService.class));
    }
}
