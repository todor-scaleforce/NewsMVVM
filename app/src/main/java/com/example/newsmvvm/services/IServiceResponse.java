package com.example.newsmvvm.services;

/**
 * Created by tosheto on 2/18/2018.
 */

public interface IServiceResponse {

    void onServiceSuccess(Object response, Object tag);
    void onServiceFailure(Object response, Object tag);

}
