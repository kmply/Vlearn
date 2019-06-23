package com.example.vlearn.api;


import com.example.vlearn.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiVLearnClient {

    @GET("login.php")
    Call<List<User>> getUserInfo(@Query("username") String username, @Query("password") String password);
}
