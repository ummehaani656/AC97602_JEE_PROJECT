package com.training;
import com.training.ifaces.Ifunction;

public class Application {
	
	public static void print(Ifunction func,double arg) {
		System.out.println(func.apply(arg));
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifunction inrTousd=new CurrencyConverter();
		System.out.println("Expected 7000: "+inrTousd.apply(100));
		Ifunction farTocel=new TempConverter();
		System.out.println("Expected 0 :"+farTocel.apply(34));
		
		
	      print(inrTousd,100);
	      print(farTocel,34);
		

	}

}
