package com.training.demo;

public class Overloading {

	public static void main(String[] args) {
	  Student ram=new Student(1,90,"Sam","sam123@gmail.com");
	  Student shyam =new Student(201,70,"Adi","adi345@gmail.com");
	   StudentService service =new StudentService();
	   System.out.println("expect Grade =>o: "+service.assignGrade(ram));
	   System.out.println("expect  Grade =>A: "+service.assignGrade(shyam, "Urban"));

	}

}
