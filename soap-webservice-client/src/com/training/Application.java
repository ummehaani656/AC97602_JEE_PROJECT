package com.training;

public class Application {

	public static void main(String[] args) {
    WeatherServiceImplService service= new WeatherServiceImplService();
    WeatherServices proxy =service.getPort(WeatherServices.class);
    System.out.println(proxy.getWeather("SBC"));

	}

}
