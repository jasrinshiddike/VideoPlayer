package com.jasrin.videoplayer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

    VideoView videoView;
    MediaController controller;//for controlling video

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller=new MediaController(this);
        videoView=findViewById(R.id.videoView);
        videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        videoView.setMediaController(controller);
        videoView.start();
    }
}
