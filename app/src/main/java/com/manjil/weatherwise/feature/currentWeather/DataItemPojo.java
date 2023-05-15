package com.manjil.weatherwise.feature.currentWeather;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataItemPojo {

	@SerializedName("sunrise")
	private String sunrise;

	@SerializedName("pod")
	private String pod;

	@SerializedName("pres")
	private double pres;

	@SerializedName("sources")
	private List<String> sources;

	@SerializedName("ob_time")
	private String obTime;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("wind_cdir")
	private String windCdir;

	@SerializedName("lon")
	private double lon;

	@SerializedName("clouds")
	private int clouds;

	@SerializedName("wind_spd")
	private double windSpd;

	@SerializedName("city_name")
	private String cityName;

	@SerializedName("datetime")
	private String datetime;

	@SerializedName("h_angle")
	private int hAngle;

	@SerializedName("precip")
	private double precip;

	@SerializedName("station")
	private String station;

	@SerializedName("weather")
	private WeatherPojo weather;

	@SerializedName("elev_angle")
	private double elevAngle;

	@SerializedName("dni")
	private double dni;

	@SerializedName("lat")
	private double lat;

	@SerializedName("uv")
	private double uv;

	@SerializedName("vis")
	private double vis;

	@SerializedName("temp")
	private double temp;

	@SerializedName("dhi")
	private double dhi;

	@SerializedName("app_temp")
	private double appTemp;

	@SerializedName("ghi")
	private double ghi;

	@SerializedName("dewpt")
	private double dewpt;

	@SerializedName("wind_dir")
	private int windDir;

	@SerializedName("solar_rad")
	private double solarRad;

	@SerializedName("country_code")
	private String countryCode;

	@SerializedName("rh")
	private int rh;

	@SerializedName("slp")
	private double slp;

	@SerializedName("snow")
	private double snow;

	@SerializedName("sunset")
	private String sunset;

	@SerializedName("aqi")
	private int aqi;

	@SerializedName("state_code")
	private String stateCode;

	@SerializedName("wind_cdir_full")
	private String windCdirFull;

	@SerializedName("gust")
	private double gust;

	@SerializedName("ts")
	private int ts;

	public String getSunrise(){
		return sunrise;
	}

	public String getPod(){
		return pod;
	}

	public double getPres(){
		return pres;
	}

	public List<String> getSources(){
		return sources;
	}

	public String getObTime(){
		return obTime;
	}

	public String getTimezone(){
		return timezone;
	}

	public String getWindCdir(){
		return windCdir;
	}

	public double getLon(){
		return lon;
	}

	public int getClouds(){
		return clouds;
	}

	public double getWindSpd(){
		return windSpd;
	}

	public String getCityName(){
		return cityName;
	}

	public String getDatetime(){
		return datetime;
	}

	public int getHAngle(){
		return hAngle;
	}

	public double getPrecip(){
		return precip;
	}

	public String getStation(){
		return station;
	}

	public WeatherPojo getWeather(){
		return weather;
	}

	public double getElevAngle(){
		return elevAngle;
	}

	public double getDni(){
		return dni;
	}

	public double getLat(){
		return lat;
	}

	public double getUv(){
		return uv;
	}

	public double getVis(){
		return vis;
	}

	public double getTemp(){
		return temp;
	}

	public double getDhi(){
		return dhi;
	}

	public double getAppTemp(){
		return appTemp;
	}

	public double getGhi(){
		return ghi;
	}

	public double getDewpt(){
		return dewpt;
	}

	public int getWindDir(){
		return windDir;
	}

	public double getSolarRad(){
		return solarRad;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public int getRh(){
		return rh;
	}

	public double getSlp(){
		return slp;
	}

	public double getSnow(){
		return snow;
	}

	public String getSunset(){
		return sunset;
	}

	public int getAqi(){
		return aqi;
	}

	public String getStateCode(){
		return stateCode;
	}

	public String getWindCdirFull(){
		return windCdirFull;
	}

	public double getGust(){
		return gust;
	}

	public int getTs(){
		return ts;
	}
}