package com.manjil.weatherwise;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.manjil.weatherwise.feature.currentWeather.CurrentWeatherFragment;
import com.manjil.weatherwise.feature.dailyWeather.DailyWeatherFragment;
import com.manjil.weatherwise.feature.hourlyWeather.HourlyWeatherFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private final CurrentWeatherFragment currentWeatherFragment = new CurrentWeatherFragment();
    private final HourlyWeatherFragment hourlyWeatherFragment = new HourlyWeatherFragment();
    private final DailyWeatherFragment dailyWeatherFragment = new DailyWeatherFragment();

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1){
            return hourlyWeatherFragment;
        } else if (position == 2) {
            return dailyWeatherFragment;
        }
        return currentWeatherFragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
