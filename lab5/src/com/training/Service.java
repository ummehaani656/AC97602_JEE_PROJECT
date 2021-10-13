package com.training;
import com.training.ifaces.Billable;

public class Service {
	public static void print(Billable func,Object arg) {
		System.out.println(func.calculate(arg));
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Billable skills=new SoftwareEnginner();
     Billable quali=new CivilEngineer();
     Billable practice=new Advocate();
     print(skills,"software developer");
     print(quali,"b.arch");
     print(practice,"high court");
	

} }
