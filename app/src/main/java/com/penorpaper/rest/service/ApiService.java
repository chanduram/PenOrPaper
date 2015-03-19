package com.penorpaper.rest.service;

import com.penorpaper.model.NavCategories;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Chandu on 3/1/2015.
 */
public interface ApiService {


    @GET("/home&key=restbypenpaper")
    void getCategories(Callback<NavCategories> callback);

    
}
