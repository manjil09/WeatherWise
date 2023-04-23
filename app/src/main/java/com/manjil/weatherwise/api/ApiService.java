package com.manjil.weatherwise.api;

import com.manjil.weatherwise.currentWeather.CurrentWeatherPojo;
import com.manjil.weatherwise.dailyWeather.DailyWeatherPojo;
import com.manjil.weatherwise.hourlyWeather.HourlyWeatherPojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {
    @Headers({"X-RapidAPI-Key: 4433b8c9bcmsh567c2114d821c93p1b8766jsncd5d94c028ff",
            "X-RapidAPI-Host: weatherbit-v1-mashape.p.rapidapi.com"})
//    @GET("current")
    @GET("weather.json")
    Call<CurrentWeatherPojo> getCurrentWeather(@Query("lat") double lat, @Query("lon") double lon);

    @Headers({"X-RapidAPI-Key: 4433b8c9bcmsh567c2114d821c93p1b8766jsncd5d94c028ff",
            "X-RapidAPI-Host: weatherbit-v1-mashape.p.rapidapi.com"})
    @GET("forecast/daily")
    Call<DailyWeatherPojo> getDailyForecast(@Query("lat") double lat, @Query("lon") double lon);

    @Headers({"X-RapidAPI-Key: 4433b8c9bcmsh567c2114d821c93p1b8766jsncd5d94c028ff",
            "X-RapidAPI-Host: weatherbit-v1-mashape.p.rapidapi.com"})
    @GET("forecast/daily")
    Call<List<HourlyWeatherPojo>> getHourlyForecast(@Query("lat") double lat, @Query("lon") double lon, @Query("hours") int hours);


}
