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
    push.initialize(getApplicationContext(), "81113842-b8e2-4a4b-8f6b-2f71ac382f5a", "c55280e7-b3ac-47ff-a7e2-ea778ee4a254");
  }
}
