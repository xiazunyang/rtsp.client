package org.easydarwin.player.simpleplayer;

import android.os.Bundle;
import android.view.TextureView;

import androidx.appcompat.app.AppCompatActivity;

import org.easydarwin.video.RtspClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextureView textureView1 = findViewById(R.id.texture_view_1);
        TextureView textureView2 = findViewById(R.id.texture_view_2);
        RtspClient client1 = new RtspClient(this, "11111", textureView1, null, null);
        client1.play(BuildConfig.RTSP_URL);
        RtspClient client2 = new RtspClient(this, "22222", textureView2, null, null);
        client2.play(BuildConfig.RTSP_URL);
    }

}
