package com.training;

import com.training.ifaces.Billable;

public class CivilEngineer implements Billable {

	@Override
	public double calculate(Object obj) {
		// TODO Auto-generated method stub
		double sal=10000;
		 if(obj.equals("b.arch")) {
			   sal=40000;
			
		 }
			 else if(obj.equals("b.e"))
				 sal=55000;
		 
		   return sal;	  	 
		 
		 
       }
		
	}


