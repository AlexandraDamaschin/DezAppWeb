package com.example.alexandra.startstopservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class StopService extends Service {
    public StopService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
