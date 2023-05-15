package com.manjil.weatherwise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;
import com.manjil.weatherwise.feature.currentWeather.CurrentWeatherFragment;
import com.manjil.weatherwise.feature.dailyWeather.DailyWeatherFragment;
import com.manjil.weatherwise.feature.hourlyWeather.HourlyWeatherFragment;

public class MainActivity extends AppCompatActivity {
    private final CurrentWeatherFragment currentWeatherFragment = new CurrentWeatherFragment();
    private final HourlyWeatherFragment hourlyWeatherFragment = new HourlyWeatherFragment();
    private final DailyWeatherFragment dailyWeatherFragment = new DailyWeatherFragment();
    private FrameLayout flContainer;
    private TabLayout tlContainer;
    private ViewPager2 viewPager;
    private  ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(viewPagerAdapter);

        tlContainer = findViewById(R.id.tlContainer);
        tlContainer.addTab(tlContainer.newTab().setText("Current"),true);
        tlContainer.addTab(tlContainer.newTab().setText("Hourly"));
        tlContainer.addTab(tlContainer.newTab().setText("Daily"));

        tlContainer.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tlContainer.selectTab(tlContainer.getTabAt(position));
            }
        });
    }
}