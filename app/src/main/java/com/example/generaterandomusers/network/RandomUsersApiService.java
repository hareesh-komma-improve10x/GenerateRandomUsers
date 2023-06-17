package com.example.generaterandomusers.network;

import com.example.generaterandomusers.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RandomUsersApiService {

    @GET("person/10")
    Call<List<User>> fetchUser();
}
