package com.example.newsmvvm.webServices;

import android.util.Log;

import com.example.newsmvvm.WebClient;
import com.example.newsmvvm.models.ArticlesResponse;
import com.example.newsmvvm.models.Country;
import com.example.newsmvvm.utils.EndpointsConstants;
import com.loopj.android.http.BaseJsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

/**
 * Created by tosheto on 2/18/2018.
 */

public class NewsWebService {

    private static final String TAG = NewsWebService.class.getSimpleName();


    private static NewsWebService service;

    private String apiKey;
    private WebClient webClient;


    private NewsWebService() {
        apiKey = "01792428adf046c6b8d4f926cbfb5674";
        webClient = WebClient.getInstance();
    }


    public static NewsWebService getInstance() {
        if(service == null)
            service = new NewsWebService();

        return service;
    }


    public void fetchTopHeadlinesForCountry(Country country, IWebServiceResponse serviceResponse) {
        Log.d(TAG, "fetchTopHeadlinesForCountry: hit");

        RequestParams requestParams = new RequestParams();
        requestParams.put(EndpointsConstants.COUNTRY_PARAMETER, country.getAbbreviation());

        webClient.getAsyncHttpClient()
                .addHeader(WebClient.AUTHORIZATION_HEADER, apiKey);
        webClient.getAsyncHttpClient()
                .get(EndpointsConstants.TOP_HEADLINES, requestParams, new BaseJsonHttpResponseHandler<ArticlesResponse>() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String rawJsonResponse, ArticlesResponse response) {
                        Log.d(TAG, "onSuccess: hit");
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, Throwable throwable, String rawJsonData, ArticlesResponse errorResponse) {
                        Log.d(TAG, "onFailure: hit");
                    }

                    @Override
                    protected ArticlesResponse parseResponse(String rawJsonData, boolean isFailure) throws Throwable {
                        Log.d(TAG, "parseResponse: hit");
                        return null;
                    }
                }).setTag(WebServiceTag.NEWS_FETCH_TOP_HEADLINES_FOR_COUNTRY);
    }
}
