package com.training;

import javax.xml.ws.Endpoint;

import com.training.services.WeatherService;

public class Application {

	public static void main(String[] args) {
		Endpoint ep=Endpoint.publish("http://localhost:5050/weather", new WeatherService());
         System.out.println("Service published");
	}

}
