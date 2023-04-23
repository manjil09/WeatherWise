package com.manjil.weatherwise.api;

import com.manjil.weatherwise.R;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCallInstance {
    private Retrofit retrofit;

    //    private final String BASE_URL = "https://api.weatherbit.io/v2.0/";
//    private final String BASE_URL = "https://weatherbit-v1-mashape.p.rapidapi.com/";
    private final String BASE_URL = "http://10.0.2.2/manjilKoju/";

    public Retrofit getInstance() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
