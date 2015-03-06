package com.talkingandroid.hour11application;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class DrawActivity extends Activity {
    ImageView imageView;
    Button drawButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        imageView = (ImageView) findViewById(R.id.imageView);
        drawButton = (Button)findViewById(R.id.button);
        drawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap imageBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(imageBitmap);
                float scale = getResources().getDisplayMetrics().density;
                Paint p = new Paint();
                p.setColor(Color.BLUE);
                p.setTextSize(48*scale);
                canvas.drawText("Hello", imageView.getWidth()/2,imageView.getHeight()/2, p);
                imageView.setImageBitmap(imageBitmap);
            }
        });
    }
}
