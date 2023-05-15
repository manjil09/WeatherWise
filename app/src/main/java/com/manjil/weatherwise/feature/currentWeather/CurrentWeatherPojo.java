package com.manjil.weatherwise.feature.currentWeather;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CurrentWeatherPojo{

	@SerializedName("data")
	private List<DataItemPojo> data;

	@SerializedName("count")
	private int count;

	public List<DataItemPojo> getData(){
		return data;
	}

	public int getCount(){
		return count;
	}
}