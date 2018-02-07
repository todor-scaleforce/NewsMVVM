package com.example.newsmvvm.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.newsmvvm.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button bTopHeadlines;
    private Button bEverything;
    private Button bSources;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: hit");
        setContentView(R.layout.activity_main);

        bTopHeadlines = (Button) findViewById(R.id.top_headlines_button);
        bEverything = (Button) findViewById(R.id.everything_button);
        bSources = (Button) findViewById(R.id.sources_button);

        // TOP HEADLINES CLICK
        bTopHeadlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Top Headlines", Toast.LENGTH_SHORT).show();
            }
        });


        // EVERYTHING CLICK
        bEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Everything", Toast.LENGTH_SHORT).show();
            }
        });


        // SOURCES CLICK
        bSources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sources", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: hit");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: hit");
    }
}
