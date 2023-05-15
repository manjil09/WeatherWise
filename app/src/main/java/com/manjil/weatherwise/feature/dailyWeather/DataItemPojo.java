package com.manjil.weatherwise.feature.dailyWeather;

import com.google.gson.annotations.SerializedName;

public class DataItemPojo {

	@SerializedName("pres")
	private double pres;

	@SerializedName("moon_phase")
	private double moonPhase;

	@SerializedName("wind_cdir")
	private String windCdir;

	@SerializedName("moonrise_ts")
	private int moonriseTs;

	@SerializedName("clouds")
	private int clouds;

	@SerializedName("low_temp")
	private double lowTemp;

	@SerializedName("wind_spd")
	private int windSpd;

	@SerializedName("ozone")
	private double ozone;

	@SerializedName("pop")
	private int pop;

	@SerializedName("datetime")
	private String datetime;

	@SerializedName("valid_date")
	private String validDate;

	@SerializedName("precip")
	private int precip;

	@SerializedName("min_temp")
	private double minTemp;

	@SerializedName("sunrise_ts")
	private int sunriseTs;

	@SerializedName("weather")
	private WeatherPojo weather;

	@SerializedName("app_max_temp")
	private double appMaxTemp;

	@SerializedName("max_temp")
	private double maxTemp;

	@SerializedName("snow_depth")
	private int snowDepth;

	@SerializedName("max_dhi")
	private double maxDhi;

	@SerializedName("sunset_ts")
	private int sunsetTs;

	@SerializedName("clouds_mid")
	private int cloudsMid;

	@SerializedName("uv")
	private double uv;

	@SerializedName("vis")
	private double vis;

	@SerializedName("high_temp")
	private double highTemp;

	@SerializedName("temp")
	private double temp;

	@SerializedName("clouds_hi")
	private int cloudsHi;

	@SerializedName("app_min_temp")
	private double appMinTemp;

	@SerializedName("moon_phase_lunation")
	private double moonPhaseLunation;

	@SerializedName("dewpt")
	private double dewpt;

	@SerializedName("wind_dir")
	private int windDir;

	@SerializedName("wind_gust_spd")
	private int windGustSpd;

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

	@SerializedName("moonset_ts")
	private int moonsetTs;

	@SerializedName("ts")
	private int ts;

	public double getPres(){
		return pres;
	}

	public double getMoonPhase(){
		return moonPhase;
	}

	public String getWindCdir(){
		return windCdir;
	}

	public int getMoonriseTs(){
		return moonriseTs;
	}

	public int getClouds(){
		return clouds;
	}

	public double getLowTemp(){
		return lowTemp;
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

	public String getValidDate(){
		return validDate;
	}

	public int getPrecip(){
		return precip;
	}

	public double getMinTemp(){
		return minTemp;
	}

	public int getSunriseTs(){
		return sunriseTs;
	}

	public WeatherPojo getWeather(){
		return weather;
	}

	public double getAppMaxTemp(){
		return appMaxTemp;
	}

	public double getMaxTemp(){
		return maxTemp;
	}

	public int getSnowDepth(){
		return snowDepth;
	}

	public double getMaxDhi(){
		return maxDhi;
	}

	public int getSunsetTs(){
		return sunsetTs;
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

	public double getHighTemp(){
		return highTemp;
	}

	public double getTemp(){
		return temp;
	}

	public int getCloudsHi(){
		return cloudsHi;
	}

	public double getAppMinTemp(){
		return appMinTemp;
	}

	public double getMoonPhaseLunation(){
		return moonPhaseLunation;
	}

	public double getDewpt(){
		return dewpt;
	}

	public int getWindDir(){
		return windDir;
	}

	public int getWindGustSpd(){
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

	public int getMoonsetTs(){
		return moonsetTs;
	}

	public int getTs(){
		return ts;
	}
}