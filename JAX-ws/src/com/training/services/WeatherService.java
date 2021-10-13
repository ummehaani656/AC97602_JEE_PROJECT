package com.training.services;

import javax.jws.WebService;

import com.training.ifaces.WeatherServices;
@WebService(endpointInterface ="com.training.ifaces.WeatherServices" )
public class WeatherService implements WeatherServices {

	@Override
	public String getWeather(String city) {
		String currentWeather="29C -HAZE";
		if(city.equals("CHN")) {
			currentWeather="32C -SUNNY";
		}
		return currentWeather;
	}

}
