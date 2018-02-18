package com.example.newsmvvm;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.MySSLSocketFactory;

import java.security.KeyStore;

/**
 * Created by tosheto on 2/3/2018.
 */

public class WebClient {

    private static final String TAG = WebClient.class.getSimpleName();
    public static final String AUTHORIZATION_HEADER = "Authorization";

    private static WebClient client = null;

    private AsyncHttpClient asyncHttpClient;


    private WebClient() {
        asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.setTimeout(120000);

        MySSLSocketFactory socketFactory = null;
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            trustStore.load(null, null);
            socketFactory = new MySSLSocketFactory(trustStore);
            socketFactory.setHostnameVerifier(MySSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            asyncHttpClient.setSSLSocketFactory(socketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static WebClient getInstance() {
        if(client == null)
            client = new WebClient();

        return client;
    }


    public AsyncHttpClient getAsyncHttpClient() {
        return asyncHttpClient;
    }
}
