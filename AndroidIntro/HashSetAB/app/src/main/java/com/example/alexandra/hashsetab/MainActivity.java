package com.example.alexandra.hashsetab;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    private Button btnStart, btnStop;
    private Button btnUnion, btnIntersection, btnDifference, btnSymDiff;

    private EditText editA, editB;
    private TextView txtResult;

    private HashSetService hashSetService;
    private boolean isBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.buttonStart);
        btnStop = (Button) findViewById(R.id.buttonStop);

        btnUnion = (Button) findViewById(R.id.buttonUnion);
        btnIntersection = (Button) findViewById(R.id.buttonIntersection);
        btnDifference = (Button) findViewById(R.id.buttonDifference);
        btnSymDiff = (Button) findViewById(R.id.buttonDiffSim);

        editA = (EditText) findViewById(R.id.editTextA);
        editB = (EditText) findViewById(R.id.editTextB);

        txtResult = (TextView) findViewById(R.id.textViewRes);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start Service
                Intent intent = new Intent(MainActivity.this, HashSetService.class);
                startService(intent);
                bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);

                //enable buttons
                btnUnion.setEnabled(true);
                btnIntersection.setEnabled(true);
                btnDifference.setEnabled(true);
                btnSymDiff.setEnabled(true);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Stop Service
                Intent intent = new Intent(MainActivity.this, HashSetService.class);
                unbindService(serviceConnection);

                //disable buttons
                btnUnion.setEnabled(false);
                btnIntersection.setEnabled(false);
                btnDifference.setEnabled(false);
                btnSymDiff.setEnabled(false);
            }
        });


        //Union button
        btnUnion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashSet<Integer> A = new HashSet<>(getSet(editA.getText().toString()));
                HashSet<Integer> B = new HashSet<>(getSet(editB.getText().toString()));
                HashSet<Integer> C = hashSetService.setUnion(A, B);

                txtResult.setText("Union = " + displayResult(C));
            }
        });

        //Intersection button
        btnIntersection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashSet<Integer> A = new HashSet<>(getSet(editA.getText().toString()));
                HashSet<Integer> B = new HashSet<>(getSet(editB.getText().toString()));
                HashSet<Integer> C = hashSetService.setIntersection(A, B);

                txtResult.setText("Intersection = " + displayResult(C));
            }
        });

        //Difference button
        btnDifference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashSet<Integer> A = new HashSet<>(getSet(editA.getText().toString()));
                HashSet<Integer> B = new HashSet<>(getSet(editB.getText().toString()));
                HashSet<Integer> C = hashSetService.setDifference(A, B);

                txtResult.setText("Difference = " + displayResult(C));
            }
        });

        //Symetric difference
        btnSymDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashSet<Integer> A = new HashSet<>(getSet(editA.getText().toString()));
                HashSet<Integer> B = new HashSet<>(getSet(editB.getText().toString()));
                HashSet<Integer> C = hashSetService.setSymetricDifference(A, B);

                txtResult.setText("SymDif = " + displayResult(C));
            }
        });

    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            HashSetService.LocalBinder binder = (HashSetService.LocalBinder) service;
            hashSetService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };

    private HashSet<Integer> getSet(String text) {
        HashSet<Integer> A = new HashSet<Integer>();
        String[] array = text.split(",");

        for (String item : array) {
            A.add(Integer.parseInt(item.trim()));
        }
        return A;
    }

    private String displayResult(HashSet<Integer> A) {
        TreeSet<Integer> A_copy = new TreeSet();
        A_copy.addAll(A);

        String result = "";
        for (Integer item : A_copy) {
            result += item.toString() + " ";
        }
        return result;
    }
}
