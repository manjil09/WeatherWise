package com.manjil.weatherwise.feature.currentWeather;

import com.manjil.weatherwise.api.ApiCallInstance;
import com.manjil.weatherwise.api.ApiService;
import com.manjil.weatherwise.feature.dailyWeather.DailyWeatherPojo;

import retrofit2.Call;
import retrofit2.Retrofit;

public class CurrentWeatherModel implements CurrentWeatherContract.Model{
    @Override
    public Call<CurrentWeatherPojo> getCurrentWeather(double lat, double lon) {
        Retrofit retrofit = new ApiCallInstance().getInstance();
        return retrofit.create(ApiService.class).getCurrentWeather(lat, lon);
    }

    @Override
    public Call<DailyWeatherPojo> getDailyForecast(double lat, double lon) {
        Retrofit retrofit = new ApiCallInstance().getInstance();
        return retrofit.create(ApiService.class).getDailyForecast(lat, lon);
    }
}
