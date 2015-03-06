package com.talkingandroid.hour11application;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class PicassoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(this).load(R.drawable.ic_launcher).into(imageView);

    }



}
