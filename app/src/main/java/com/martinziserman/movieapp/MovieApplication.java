package com.martinziserman.movieapp;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MovieApplication extends Application {

    private RequestQueue requestQueue;
    private static MovieApplication instance;

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    public static MovieApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MovieApplication.instance = this;

        requestQueue = Volley.newRequestQueue(this);
    }

}
