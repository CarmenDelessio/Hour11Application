package com.talkingandroid.hour11application;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class LargeImageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_large_image);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        Directly loading resource will crash app
//        imageView.setImageResource(R.drawable.largeimage);
        Display display = getWindowManager().getDefaultDisplay();
        int displayWidth = display.getWidth();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.drawable.largeimage, options);
        int width = options.outWidth;
        if (width > displayWidth) {
            int widthRatio = Math.round((float) width / (float) displayWidth);
            options.inSampleSize = widthRatio;
        }
        options.inJustDecodeBounds = false;
        Bitmap scaledBitmap =  BitmapFactory.decodeResource(getResources(), R.drawable.largeimage, options);
        imageView.setImageBitmap(scaledBitmap);

    }



}
