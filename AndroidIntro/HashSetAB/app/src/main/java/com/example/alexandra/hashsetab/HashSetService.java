package com.example.alexandra.hashsetab;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class HashSetService extends Service {
    // indicates how to behave if the service is killed
    int mStartMode;

    // interface for clients that bind
    IBinder mBinder;

    //indicates whether onRebind should be used
    boolean mAllowRebind;

    // Called when the service is being created.
    @Override
    public void onCreate() {

    }

    //The service is starting, due to a call to startService()
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Start service", Toast.LENGTH_SHORT).show();
        return mStartMode;
    }

    //A client is binding to the service with bindService()
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this, "Start service onBind", Toast.LENGTH_SHORT).show();
        return mBinder;
    }

    //Called when all clients have unbound with unbindService()
    @Override
    public boolean onUnbind(Intent intent) {
        Toast.makeText(this, "Start service onUnbind", Toast.LENGTH_SHORT).show();
        return mAllowRebind;
    }

    //Called when The service is no longer used and is being destroyed
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
