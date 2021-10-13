package com.training.demo;

public class StudentService {
	
public String assignGrade(Student student)
{
		String grade="A";
		
		if(student.getMarkScored()>80) {
			grade="o";
		}
			return grade;
			
	}
   
  public String assignGrade(Student student,String category) {
	  String grade="A";
		if(category.equals("Urban")) {
			
		
		if(student.getMarkScored()>80) {
			grade="o";
		}
		else  {
			if(student.getMarkScored()>70) {
				grade="o";
			}
		}
		}
//			
			return grade;
  }
}
