package com.manjil.weatherwise.feature.hourlyWeather;

import com.google.gson.annotations.SerializedName;

public class WeatherPojo {

	@SerializedName("code")
	private int code;

	@SerializedName("icon")
	private String icon;

	@SerializedName("description")
	private String description;

	public int getCode(){
		return code;
	}

	public String getIcon(){
		return icon;
	}

	public String getDescription(){
		return description;
	}
}