package com.example.demo;
import java.util.*;
public class StudentService {
	//HashMap<String,Student> details;
	HashMap<String,List<Student>> details;
	
	public StudentService() {
		details=new HashMap<>();
		List<Student> belist=Arrays.asList(new Student(101,"Rahil",79),new Student(102,"Aahil",92));
		details.put("be",belist);
		List<Student> mcalist=Arrays.asList(new Student(201,"Anil",89),new Student(202,"Sunil",62));
		details.put("mca",mcalist);
	}
		
		public  List<Student> findByBranch(String branch){
			return details.get(branch);
		}
		
		
	

}
