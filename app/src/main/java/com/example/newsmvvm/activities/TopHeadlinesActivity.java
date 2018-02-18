package com.example.newsmvvm.activities;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.newsmvvm.R;
import com.example.newsmvvm.adapters.ArticlesAdapter;
import com.example.newsmvvm.models.Country;
import com.example.newsmvvm.viewModels.TopHeadlinesViewModel;

/**
 * Created by tosheto on 2/7/2018.
 */

public class TopHeadlinesActivity extends AppCompatActivity {

    private static final String TAG = TopHeadlinesActivity.class.getSimpleName();

    private ProgressBar progressBar;
    private RecyclerView topHeadlinesList;
    private LinearLayout somethingWrongContainer;
    private Button retryButton;

    private ArticlesAdapter articlesAdapter;

    private TopHeadlinesViewModel topHeadlinesViewModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_headlines);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        topHeadlinesList = (RecyclerView) findViewById(R.id.top_headlines_list);
        somethingWrongContainer = (LinearLayout) findViewById(R.id.something_wrong_container);
        retryButton = (Button) findViewById(R.id.retry_button);

        topHeadlinesList.setLayoutManager(new LinearLayoutManager(this));

        // CLICK RETRY BUTTON
        retryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TopHeadlinesActivity.this, "Retry click", Toast.LENGTH_SHORT).show();
            }
        });

        topHeadlinesViewModel = ViewModelProviders.of(this).get(TopHeadlinesViewModel.class);

        topHeadlinesViewModel.fetchTopHeadlinesForCountry(Country.BULGARIA);
    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }
}
