package com.nextbee.logutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "SUPER AWESOME APP";

    public static void d(String messsage) {
        Log.d(TAG, messsage);
    }
}
