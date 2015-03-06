package com.talkingandroid.hour11application;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class RotateActivity extends Activity {
    Button rotateButton;
    ImageView imageView;
    int numClicks = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        imageView = (ImageView)findViewById(R.id.imageView);
        rotateButton = (Button) findViewById(R.id.button);
        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setPivotX(imageView.getWidth()/2);
                imageView.setPivotY(imageView.getHeight() / 2);
                imageView.setRotation(30*numClicks);
                numClicks++;
            }
        });
    }



}
