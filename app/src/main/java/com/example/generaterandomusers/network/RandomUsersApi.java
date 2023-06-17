package com.example.generaterandomusers.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RandomUsersApi {
    public RandomUsersApiService createRandomUsersApi() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://peoplegeneratorapi.live/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RandomUsersApiService randomUsersApiService = retrofit.create(RandomUsersApiService.class);
        return randomUsersApiService;
    }
}
