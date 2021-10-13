package com.training;

import java.util.*;
import java.util.Set;

import com.training.model.Book;
import com.training.model.Student;

public class ApplicationForSet {
	public static void print( String message,Set<Student> list) {
   	 System.out.println(message);
   	 for(Student eachElement:list) {
			System.out.println(eachElement);
   	 
    }}

	public static void main(String[] args) {
		Student ram=new Student(101,90,"Sam","sam123@gmail.com");
		  Student shyam =new Student(201,70,"shyam","shyam345@gmail.com");
		  Student chotoshyam=new Student(201,70,"shyam","shyam345@gmail.com");
	     HashSet<Student> hashset=new HashSet<>();
	     hashset.add(ram);
	     hashset.add(shyam);
	     hashset.add(chotoshyam);
	     print("Hashset -No duplicates only two elements will be listed",hashset);
	     
	     TreeSet<Student> treeset=new TreeSet<>();
	     Student adi =new Student(20,80,"Adi","adi345@gmail.com");
	     treeset.add(ram);
	     treeset.add(shyam);
	     treeset.add(chotoshyam);
	     treeset.add(adi);
	     print("treeset -No duplicates only three elements will be listed ,but sorted in the order of RollNumber",treeset);
	     
	     
	}

}
