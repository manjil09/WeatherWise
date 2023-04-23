package com.manjil.weatherwise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.manjil.weatherwise.currentWeather.CurrentWeatherContract;
import com.manjil.weatherwise.currentWeather.CurrentWeatherFragment;
import com.manjil.weatherwise.currentWeather.CurrentWeatherPojo;
import com.manjil.weatherwise.currentWeather.CurrentWeatherPresenter;
import com.manjil.weatherwise.dailyWeather.DailyWeatherFragment;
import com.manjil.weatherwise.dailyWeather.DailyWeatherPojo;
import com.manjil.weatherwise.hourlyWeather.HourlyWeatherFragment;

public class MainActivity extends AppCompatActivity {
    private final CurrentWeatherFragment currentWeatherFragment = new CurrentWeatherFragment();
    private final HourlyWeatherFragment hourlyWeatherFragment = new HourlyWeatherFragment();
    private final DailyWeatherFragment dailyWeatherFragment = new DailyWeatherFragment();
    private FrameLayout flContainer;
    private TabLayout tlContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flContainer = findViewById(R.id.flContainer);
        tlContainer = findViewById(R.id.tlContainer);

        tlContainer.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position){
                    case 0:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer,currentWeatherFragment).commit();
                        break;
                    case 1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer,hourlyWeatherFragment).commit();
                        break;
                    case 2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer,dailyWeatherFragment).commit();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        tlContainer.addTab(tlContainer.newTab().setText("Current"),true);
        tlContainer.addTab(tlContainer.newTab().setText("Hourly"));
        tlContainer.addTab(tlContainer.newTab().setText("Daily"));
    }
}