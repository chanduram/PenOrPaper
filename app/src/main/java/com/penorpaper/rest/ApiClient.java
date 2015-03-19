package com.penorpaper.rest;

import com.penorpaper.services.ApiService;

import retrofit.RestAdapter;

/**
 * Created by Chandu on 3/7/2015.
 */
public class ApiClient {

    private static final String SERVICE_URL = "http://penorpaper.com/new/index.php?route=feed/rest_api";

    private ApiService apiService;

    public ApiClient() {
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(SERVICE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        apiService = adapter.create(ApiService.class);
    }

    public ApiService getApiService() {
        return apiService;
    }
}
