package com.wong.actorclientandroid;

import im.actor.sdk.ActorSDK;
import im.actor.sdk.ActorSDKApplication;
import im.actor.sdk.ActorStyle;

public class MessengerApplication extends ActorSDKApplication {

    @Override
    public void onConfigureActorSDK() {
        
        // ActorSDK.sharedActor().setEndpoints(new String[]{"YOUR_ENDPOINT_HERE"});

        ActorStyle style = ActorSDK.sharedActor().style;
        ActorSDK.sharedActor().setEndpoints(new String[] {
                "tcp://93.184.216.34:9070"
        });
        // Customize your colors here
    }
}
