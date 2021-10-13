package com.training;

import java.util.HashMap;

import com.training.model.Student;

public class ApplicationForMap {

	public static void main(String[] args) {
		Student ram=new Student(1012,90,"Sam","sam123@gmail.com");
		  Student shyam =new Student(201,70,"shyam","shyam345@gmail.com");
		  Student chotoshyam =new Student(202,70,"chotoshyam","shyam345@gmail.com");
		  HashMap<Integer, Student> list=new HashMap<>();
		  list.put(200,ram);
		   Object obj2=list.put(201,shyam);
		  Object obj=list.put(201, chotoshyam);
		  System.out.println(obj);// if key(201) of some value is present earlier then it returns old credentials
		  System.out.println(obj2);//if key of some value is not present earlier then it returns null
		  System.out.println(list.get(201));
		  
		  

	}

}
