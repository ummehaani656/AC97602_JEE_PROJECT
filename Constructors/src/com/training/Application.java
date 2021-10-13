package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student ram=new Student();
      ram.setRollNumber(202);
      ram.setStudentName("Ram Kapoor");
      ram.setEmail("abcd@gmail.com");
      ram.setMarkScored(95);
      System.out.println(ram.getMarkScored());
      
      ram.setMarkScored(78);
      System.out.println("Updated marks :"+ram.getMarkScored());
      
      Student shyam=new Student(253,96,"Shyam Sharma","shyam123@gmail.com");
      System.out.println(shyam.getMarkScored());
      System.out.println(shyam.getStudentName());
      
      
      
	}

}
