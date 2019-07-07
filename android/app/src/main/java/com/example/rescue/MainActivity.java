package com.example.rescue;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
    // Initialize the SDK
    BMSClient.getInstance().initialize(this,"BMSClient.REGION_US_SOUTH");
    //Initialize client Push SDK

    MFPPush push = MFPPush.getInstance();
    push.initialize(getApplicationContext(), "appGUID", "clientSecret");
  }
}
