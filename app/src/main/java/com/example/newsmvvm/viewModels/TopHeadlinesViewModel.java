package com.example.newsmvvm.viewModels;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.example.newsmvvm.models.Article;
import com.example.newsmvvm.models.Country;
import com.example.newsmvvm.webServices.IWebServiceResponse;
import com.example.newsmvvm.webServices.NewsWebService;

import java.util.ArrayList;

/**
 * Created by tosheto on 2/8/2018.
 */

public class TopHeadlinesViewModel extends ViewModel implements IWebServiceResponse {

    private static final String TAG = TopHeadlinesViewModel.class.getSimpleName();

    private MutableLiveData<ArrayList<Article>> articles = new MutableLiveData<>();


    public void fetchTopHeadlinesForCountry(Country country) {
        Log.d(TAG, "fetchTopHeadlinesForCountry: hit");
        NewsWebService.getInstance().fetchTopHeadlinesForCountry(country, this);
    }


    @Override
    public void onWebServiceSuccess(Object response, Object tag) {
        Log.d(TAG, "onWebServiceSuccess: hit");
    }


    @Override
    public void onWebServiceFailure(Object response, Object tag) {
        Log.d(TAG, "onWebServiceFailure: hit");
    }
}
