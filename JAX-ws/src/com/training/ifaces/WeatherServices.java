package com.training.ifaces;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.*;

@WebService
@SOAPBinding(style = Style.RPC)
public interface WeatherServices {
@WebResult(name="presentCondition")	
public String getWeather(@WebParam(name="City") String city);
	



}
