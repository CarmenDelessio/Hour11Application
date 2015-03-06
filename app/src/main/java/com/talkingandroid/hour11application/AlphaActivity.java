package com.talkingandroid.hour11application;

import android.app.Activity;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;


public class AlphaActivity extends Activity {
    ImageView imageView;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        imageView = (ImageView) findViewById(R.id.imageView);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setProgress(255);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                imageView.setImageAlpha(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }



}
