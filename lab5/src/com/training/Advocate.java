package com.training;

import com.training.ifaces.Billable;

public class Advocate implements Billable {
    private Object practice;
	@Override
	public double calculate(Object obj) {
		// TODO Auto-generated method stub
		double sal=10000;
		 if(obj.equals("district court")) {
			   sal=40000;
			
		 }
			 else if(obj.equals("high court"))
				 sal=55000;
			 else if(obj.equals("supreme court"))
				 sal=70000;
		   return sal;	  	 
		 
		 
       }
		
	}


