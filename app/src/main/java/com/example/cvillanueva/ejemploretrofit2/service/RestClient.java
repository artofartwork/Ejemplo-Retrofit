package com.example.cvillanueva.ejemploretrofit2.service;

import com.example.cvillanueva.ejemploretrofit2.PokemonFeed;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by cvillanueva on 26/01/2018.
 */

public interface RestClient {
    @GET("pokemon")
    Call<PokemonFeed> getData();

}