package com.example.vlearn.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiVLearn {

    public static final String BASE_URL_VLEARN = "http://mobileschool.alwaysdata.net/sondageHF/";
    // public static final String BASE_URL_OS = "http://192.168.43.64/sondageOS/";

    public static Retrofit retrofit ;


    //méthode qui retourne une instance de retrofit

    public static Retrofit getApiVLearn() {

        if (retrofit == null) {
            //bonjour
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL_VLEARN).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
