package com.jack.facebooklogin;

import android.app.Application;
import android.content.Context;

import com.facebook.FacebookSdk;

/**
 * Created by jatin on 5/9/2018.
 */

public class Appanalyzer extends Application {

    public Appanalyzer() {
        super();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    /*
     * To avoid memory leak
     * For more use this link : https://corner.squareup.com/2015/05/leak-canary.html
     */

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            FacebookSdk.sdkInitialize(getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
