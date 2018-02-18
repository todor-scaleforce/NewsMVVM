package com.example.newsmvvm.viewModels;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.example.newsmvvm.WebClient;
import com.example.newsmvvm.models.Article;
import com.example.newsmvvm.models.Country;

import java.util.ArrayList;

/**
 * Created by tosheto on 2/8/2018.
 */

public class TopHeadlinesViewModel extends ViewModel {

    private static final String TAG = TopHeadlinesViewModel.class.getSimpleName();

    private MutableLiveData<ArrayList<Article>> articles = new MutableLiveData<>();


    public void fetchTopHeadlinesForCountry(Country country) {
        Log.d(TAG, "fetchTopHeadlinesForCountry: hit");
        
    }
}
