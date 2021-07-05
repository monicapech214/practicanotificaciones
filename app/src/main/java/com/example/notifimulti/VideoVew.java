package com.example.notifimulti;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoVew extends AppCompatActivity {
Button reproduce,stop,pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_vew);
        reproduce=(Button)findViewById(R.id.reproducir);
        stop=(Button)findViewById(R.id.stop);
        pause = (Button)findViewById(R.id.pause);
        Uri myUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        VideoView videoView = (VideoView)findViewById(R.id.video2);
        videoView.setVideoURI(myUri);
        videoView.setMediaController(new MediaController(this));

        videoView.requestFocus();
        reproduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
                videoView.seekTo(0);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });
    }


}