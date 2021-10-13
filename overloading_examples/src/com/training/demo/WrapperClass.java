package com.training.demo;

public class WrapperClass {

	public static void main(String[] args) {
		// u will get an exception so therefore command line arguments are passed-
		//runAs-> run configuration-> arguments-> 
		//give the arguments in order as in below(int string double string)
		int rollNumber=Integer.parseInt(args[0]);
		String studentName=args[1];
		double markScored=Double.parseDouble(args[2]);
		String email=args[3];
		
		Student ram= new Student(rollNumber,markScored,email,studentName);
		System.out.println(ram.getMarkScored());
		System.out.println(ram.getEmail());
		
		int phoneNumber=1235869425;
		//transforming integer to string using Integer.toString
		String StrPhoneNumber=Integer.toString(phoneNumber);
		//using the string class length to find the length
		System.out.println("The length of Phone number :"+StrPhoneNumber.length());

	}

	
}
