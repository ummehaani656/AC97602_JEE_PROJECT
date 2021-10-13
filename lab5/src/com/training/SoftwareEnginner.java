package com.training;

import com.training.ifaces.Billable;

public class SoftwareEnginner implements Billable {
private Object skillSet;


	public SoftwareEnginner() {
	super();
	// TODO Auto-generated constructor stub
}

	

	   
		public SoftwareEnginner(Object skillSet) {
		super();
		this.skillSet = skillSet;
	}
		




		public Object getSkillSet() {
			return skillSet;
		}




		public void setSkillSet(Object skillSet) {
			this.skillSet = skillSet;
		}




        public double calculate(Object obj) 
        {
		double sal=10000;
		 if(obj.equals("software tester")) {
			   sal=40000;
			
		 }
			 else if(obj.equals("java developer"))
				 sal=55000;
		 
		   return sal;	  	 
		 
		 
        }
	}


