package io.antmedia.mywebrtcstreamingapp;

import android.app.Activity;
import android.os.Bundle;
import io.antmedia.webrtcandroidframework.api.IWebRTCClient;

public class WebRTCStreamingActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.webrtc_streaming);

IWebRTCClient webRTCClient = IWebRTCClient.builder()
.setActivity(this)
.setLocalVideoRenderer(findViewById(R.id.full_screen_renderer))
.setServerUrl("wss://test.antmedia.io:5443/WebRTCAppEE/websocket")
.build();

webRTCClient.publish("stream1");
}
}