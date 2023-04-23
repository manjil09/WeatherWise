package com.manjil.weatherwise.dailyWeather;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DailyWeatherPojo {

	@SerializedName("country_code")
	private String countryCode;

	@SerializedName("city_name")
	private String cityName;

	@SerializedName("data")
	private List<DataItemPojo> data;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("lon")
	private double lon;

	@SerializedName("state_code")
	private String stateCode;

	@SerializedName("lat")
	private double lat;

	public String getCountryCode(){
		return countryCode;
	}

	public String getCityName(){
		return cityName;
	}

	public List<DataItemPojo> getData(){
		return data;
	}

	public String getTimezone(){
		return timezone;
	}

	public double getLon(){
		return lon;
	}

	public String getStateCode(){
		return stateCode;
	}

	public double getLat(){
		return lat;
	}
}