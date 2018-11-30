package com.wong.actorclientandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import im.actor.sdk.ActorSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActorSDK.sharedActor().waitForReady();
        ActorSDK.sharedActor().startMessagingApp(this);
        finish();
    }
}
