package com.talkingandroid.hour11application;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RadioGroup;


public class ScaleActivity extends Activity {
    RadioGroup radioGroup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        imageView = (ImageView) findViewById(R.id.imageView);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioCenter:
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        break;
                    case R.id.radioCenterCrop:
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        break;
                    case R.id.radioCenterInside:
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        break;
                    case R.id.radioFitCenter:
                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        break;
                    case R.id.radioFitStart:
                        imageView.setScaleType(ImageView.ScaleType.FIT_START);
                        break;
                    case R.id.radioFitEnd:
                        imageView.setScaleType(ImageView.ScaleType.FIT_END);
                        break;
                    case R.id.radioFitXY:
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        break;

                }
            }
        });

    }


}
