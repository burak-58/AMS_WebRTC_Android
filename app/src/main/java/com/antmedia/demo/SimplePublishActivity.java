package com.antmedia.demo;

import android.app.Activity;
import android.os.Bundle;

import org.webrtc.SurfaceViewRenderer;

import io.antmedia.webrtcandroidframework.api.IWebRTCClient;

public class SimplePublishActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_publish);

        SurfaceViewRenderer fullScreenRenderer = findViewById(R.id.full_screen_renderer);

        IWebRTCClient webRTCClient = IWebRTCClient.builder()
                .setActivity(this)
                .setLocalVideoRenderer(fullScreenRenderer)
                .setServerUrl("wss://test.antmedia.io:5443/LiveApp/websocket")
                .build();

        webRTCClient.publish("stream1");
    }
}
