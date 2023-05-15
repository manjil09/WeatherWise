package com.manjil.weatherwise.feature.hourlyWeather;

import com.google.gson.annotations.SerializedName;

public class DataItemPojo {

	@SerializedName("pod")
	private String pod;

	@SerializedName("pres")
	private double pres;

	@SerializedName("wind_cdir")
	private String windCdir;

	@SerializedName("clouds")
	private int clouds;

	@SerializedName("wind_spd")
	private int windSpd;

	@SerializedName("ozone")
	private double ozone;

	@SerializedName("pop")
	private int pop;

	@SerializedName("datetime")
	private String datetime;

	@SerializedName("precip")
	private double precip;

	@SerializedName("timestamp_local")
	private String timestampLocal;

	@SerializedName("timestamp_utc")
	private String timestampUtc;

	@SerializedName("weather")
	private WeatherPojo weather;

	@SerializedName("snow_depth")
	private int snowDepth;

	@SerializedName("dni")
	private double dni;

	@SerializedName("clouds_mid")
	private int cloudsMid;

	@SerializedName("uv")
	private double uv;

	@SerializedName("vis")
	private double vis;

	@SerializedName("temp")
	private int temp;

	@SerializedName("dhi")
	private double dhi;

	@SerializedName("clouds_hi")
	private int cloudsHi;

	@SerializedName("app_temp")
	private int appTemp;

	@SerializedName("ghi")
	private double ghi;

	@SerializedName("dewpt")
	private double dewpt;

	@SerializedName("wind_dir")
	private int windDir;

	@SerializedName("solar_rad")
	private double solarRad;

	@SerializedName("wind_gust_spd")
	private double windGustSpd;

	@SerializedName("clouds_low")
	private int cloudsLow;

	@SerializedName("rh")
	private int rh;

	@SerializedName("slp")
	private int slp;

	@SerializedName("snow")
	private int snow;

	@SerializedName("wind_cdir_full")
	private String windCdirFull;

	@SerializedName("ts")
	private int ts;

	public String getPod(){
		return pod;
	}

	public double getPres(){
		return pres;
	}

	public String getWindCdir(){
		return windCdir;
	}

	public int getClouds(){
		return clouds;
	}

	public int getWindSpd(){
		return windSpd;
	}

	public double getOzone(){
		return ozone;
	}

	public int getPop(){
		return pop;
	}

	public String getDatetime(){
		return datetime;
	}

	public double getPrecip(){
		return precip;
	}

	public String getTimestampLocal(){
		return timestampLocal;
	}

	public String getTimestampUtc(){
		return timestampUtc;
	}

	public WeatherPojo getWeather(){
		return weather;
	}

	public int getSnowDepth(){
		return snowDepth;
	}

	public double getDni(){
		return dni;
	}

	public int getCloudsMid(){
		return cloudsMid;
	}

	public double getUv(){
		return uv;
	}

	public double getVis(){
		return vis;
	}

	public int getTemp(){
		return temp;
	}

	public double getDhi(){
		return dhi;
	}

	public int getCloudsHi(){
		return cloudsHi;
	}

	public int getAppTemp(){
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

	public double getWindGustSpd(){
		return windGustSpd;
	}

	public int getCloudsLow(){
		return cloudsLow;
	}

	public int getRh(){
		return rh;
	}

	public int getSlp(){
		return slp;
	}

	public int getSnow(){
		return snow;
	}

	public String getWindCdirFull(){
		return windCdirFull;
	}

	public int getTs(){
		return ts;
	}
}