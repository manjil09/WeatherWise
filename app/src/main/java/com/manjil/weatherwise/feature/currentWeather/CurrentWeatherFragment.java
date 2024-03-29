package com.manjil.weatherwise.feature.currentWeather;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.manjil.weatherwise.R;
import com.manjil.weatherwise.feature.dailyWeather.DailyWeatherPojo;

public class CurrentWeatherFragment extends Fragment implements CurrentWeatherContract.View{
    private final String KEY = "e9e4b7b4f32444899243c63d5356580d";
    private final String ICON_PATH = "https://cdn.weatherbit.io/static/img/icons/";
    private final double LAT = 27.7172;
    private final double LON = 85.324;
    private TextView tvWeatherDescription, tvTemperature, tvWindSpeed, tvCloudCover, tvVisibility, tvDewPoint, tvPressure, tvUvIndex, tvSunRiseSetValue;
    private ImageView ivWeatherIcon;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_current_weather, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CurrentWeatherContract.Presenter presenter= new CurrentWeatherPresenter(this);
        presenter.setCurrentWeather(LAT, LON);
    }

    @Override
    public void setCurrentWeather(CurrentWeatherPojo currentWeatherPojo) {
        String weatherDescription = currentWeatherPojo
                .getData()
                .get(0)
                .getWeather()
                .getDescription();
        String temperature = String.valueOf(currentWeatherPojo
                .getData()
                .get(0)
                .getTemp());
        String windSpeed = Double.toString(currentWeatherPojo
                .getData()
                .get(0)
                .getWindSpd());
        int cloudCover = currentWeatherPojo
                .getData()
                .get(0)
                .getClouds();
        String visibility = String.valueOf(currentWeatherPojo
                .getData()
                .get(0)
                .getVis());
        double dewPoint = currentWeatherPojo
                .getData()
                .get(0)
                .getDewpt();
        String pressure = String.valueOf(currentWeatherPojo
                .getData()
                .get(0)
                .getPres());
        double uvIndex = currentWeatherPojo
                .getData()
                .get(0)
                .getUv();
        String sunRise = currentWeatherPojo
                .getData()
                .get(0)
                .getSunrise();
        String sunSet = currentWeatherPojo
                .getData()
                .get(0)
                .getSunset();
        String icon = currentWeatherPojo
                .getData()
                .get(0)
                .getWeather()
                .getIcon();

        View view = getView();
        assert view!=null;

        tvWeatherDescription = view.findViewById(R.id.tvWeatherDescription);
        tvTemperature = view.findViewById(R.id.tvTemperature);
        tvWindSpeed = view.findViewById(R.id.tvWindSpeed);
        tvCloudCover = view.findViewById(R.id.tvCloudCover);
        tvPressure = view.findViewById(R.id.tvPressure);
        tvVisibility = view.findViewById(R.id.tvVisibility);
        tvDewPoint = view.findViewById(R.id.tvDewPoint);
        tvUvIndex = view.findViewById(R.id.tvUvIndex);
        tvSunRiseSetValue = view.findViewById(R.id.tvSunRiseSetValue);
        ivWeatherIcon = view.findViewById(R.id.ivWeatherIcon);

        tvWeatherDescription.setText(weatherDescription);
        tvTemperature.setText(temperature);
        tvSunRiseSetValue.setText(getString(R.string.sunRiseSetValue,sunRise,sunSet));
        tvWindSpeed.setText(getString(R.string.meter_per_second, windSpeed));
        tvCloudCover.setText(getString(R.string.percentage, cloudCover));
        tvVisibility.setText(getString(R.string.kilometer,visibility));
        tvDewPoint.setText(String.valueOf(dewPoint));
        tvPressure.setText(getString(R.string.mmHg,pressure));
        tvUvIndex.setText(String.valueOf(uvIndex));

        Log.d("currentWeather", "setCurrentWeather: successful");

        Glide.with(requireContext()).load(ICON_PATH + icon + ".png").into(ivWeatherIcon);
    }

    @Override
    public void setDailyForecast(DailyWeatherPojo dailyWeatherPojoList) {

    }

    @Override
    public void showErrorMessage(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }
}