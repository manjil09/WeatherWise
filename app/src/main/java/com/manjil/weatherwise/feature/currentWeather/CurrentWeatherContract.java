package com.manjil.weatherwise.feature.currentWeather;

import com.manjil.weatherwise.feature.dailyWeather.DailyWeatherPojo;

import retrofit2.Call;

public interface CurrentWeatherContract {
    interface Model{
        Call<CurrentWeatherPojo> getCurrentWeather(double lat, double lon);
        Call<DailyWeatherPojo> getDailyForecast(double lat, double lon);


    }
    interface View{
        void setCurrentWeather(CurrentWeatherPojo currentWeatherPojo);
        void setDailyForecast(DailyWeatherPojo dailyWeatherPojoList);

        void showErrorMessage(String message);
    }
    interface Presenter{
        void onCreate();
        void setCurrentWeather(double lat, double lon);
        void setDailyForecast(double lat, double lon);

    }
}
