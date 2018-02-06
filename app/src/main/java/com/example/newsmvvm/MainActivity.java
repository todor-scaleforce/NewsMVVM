package com.example.newsmvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bTopHeadlines;
    private Button bEverything;
    private Button bSources;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
}
