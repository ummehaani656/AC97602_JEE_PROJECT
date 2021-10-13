package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram=new Student();  
		//System.out.println(ram.rollNumber); rollNumber is  private therefore not visible
		System.out.println(ram.studentName);
		System.out.println(ram.markScored);
		System.out.println(ram.email);
	}

}
