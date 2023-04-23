package com.manjil.weatherwise.currentWeather;

import android.util.Log;

import androidx.annotation.NonNull;

import com.manjil.weatherwise.dailyWeather.DailyWeatherPojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrentWeatherPresenter implements CurrentWeatherContract.Presenter{
    private final CurrentWeatherContract.View view;
    private final CurrentWeatherModel model = new CurrentWeatherModel();

    public CurrentWeatherPresenter(CurrentWeatherContract.View view) {
        this.view = view;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void setCurrentWeather(double lat, double lon) {
        model.getCurrentWeather(lat, lon).enqueue(new Callback<CurrentWeatherPojo>() {
            @Override
            public void onResponse(@NonNull Call<CurrentWeatherPojo> call, @NonNull Response<CurrentWeatherPojo> response) {
                Log.d("weatherData","this is currentWeatherPresenter setCurrentWeather onResponse");
                if (response.isSuccessful()){
                    Log.d("weatherData","this is currentWeatherPresenter setCurrentWeather if response successful");
                    view.setCurrentWeather(response.body());
//                    response.raw().body().close();
                }else {
                    view.showErrorMessage("Failed to load weather data. Error " + response.code());
                }
            }

            @Override
            public void onFailure(@NonNull Call<CurrentWeatherPojo> call, @NonNull Throwable t) {
                Log.d("weatherData","this is currentWeatherPresenter setCurrentWeather onFailure");
                t.printStackTrace();
            }
        });
    }

    @Override
    public void setDailyForecast(double lat, double lon) {
        model.getDailyForecast(lat, lon).enqueue(new Callback<DailyWeatherPojo>() {
            @Override
            public void onResponse(Call<DailyWeatherPojo> call, Response<DailyWeatherPojo> response) {
                if (response.isSuccessful()){
                    view.setDailyForecast(response.body());
                }else {
                    view.showErrorMessage("Failed to load daily forecast data. Error "+response.code());
                }
            }

            @Override
            public void onFailure(Call<DailyWeatherPojo> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
