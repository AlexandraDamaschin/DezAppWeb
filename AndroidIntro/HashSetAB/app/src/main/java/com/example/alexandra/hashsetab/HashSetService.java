package com.example.alexandra.hashsetab;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

import java.util.HashSet;

public class HashSetService extends Service {
    private final IBinder iBinder = new LocalBinder();

    public class LocalBinder extends Binder {

        HashSetService getService() {
            return HashSetService.this;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    public HashSet setUnion(HashSet A, HashSet B) {
        A.addAll(B);
        return A;
    }

    public HashSet setIntersection(HashSet<Integer> A, HashSet<Integer> B) {
        HashSet<Integer> C = new HashSet<Integer>();
        C.addAll(A);
        C.retainAll(B);
        return C;
    }

    public HashSet setDifference(HashSet<Integer> A, HashSet<Integer> B) {  //A\B
        HashSet<Integer> C = new HashSet<Integer>();
        C.addAll(A);
        C.removeAll(B);
        return C;
    }

    public HashSet setSymetricDifference(HashSet<Integer> A, HashSet<Integer> B) {
        HashSet<Integer> C = new HashSet<Integer>(setDifference(A, B));  // difference between A and B
        HashSet<Integer> D = new HashSet<Integer>(setDifference(B, A)); // difference between B and A
        HashSet<Integer> result = new HashSet<Integer>(setUnion(C, D)); // reunion C and D
        return result;
    }
}
