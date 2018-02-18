package com.example.newsmvvm.webServices;

/**
 * Created by tosheto on 2/18/2018.
 */

public interface IWebServiceResponse {

    void onWebServiceSuccess(Object response, Object tag);
    void onWebServiceFailure(Object response, Object tag);

}
