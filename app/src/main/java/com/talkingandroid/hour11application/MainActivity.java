package com.talkingandroid.hour11application;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

    String[] choices;
    ListView choicesListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources = getResources();
        choices = resources.getStringArray(R.array.choices_array);
        choicesListView = (ListView) findViewById(R.id.listView);
        choicesListView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, choices));
        choicesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(MainActivity.this, ScaleActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, RotateActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, AlphaActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, LargeImageActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, DrawActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, PicassoActivity.class));
                        break;
                }

            }
        });

    }
}
