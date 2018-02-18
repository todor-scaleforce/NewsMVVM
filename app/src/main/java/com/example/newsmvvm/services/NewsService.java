package com.example.newsmvvm.services;

import android.util.Log;

import com.example.newsmvvm.WebClient;
import com.example.newsmvvm.models.Country;

/**
 * Created by tosheto on 2/18/2018.
 */

public class NewsService {

    private static final String TAG = NewsService.class.getSimpleName();


    private static NewsService service;

    private String apiKey;
    private WebClient webClient;


    private NewsService() {
        apiKey = "01792428adf046c6b8d4f926cbfb5674";
        webClient = WebClient.getInstance();
    }


    public NewsService getInstance() {
        if(service == null)
            service = new NewsService();

        return service;
    }


    public void fetchTopHeadlinesForCountry(Country country, ) {
        Log.d(TAG, "fetchTopHeadlinesForCountry: hit");
        webClient.getAsyncHttpClient()
                .addHeader(WebClient.AUTHORIZATION_HEADER, apiKey)
    }
}
