package com.example.streams;
import java.util.function.*;
import java.util.List;

import com.training.entity.Student;

public class StreamsApplication {

	public static void main(String[] args) {
		StudentService service =new StudentService();
		/*
		List<Student> markEightytyAbove=service.useFilter();
		System.out.println("Eighty marks and above");
		markEightytyAbove.forEach(System.out::println);
		Predicate<Student> lessThanEighty=e ->e.getMarkScored()<80;
		Predicate<Student> lessThanninety=e ->e.getMarkScored()<90;
		System.out.println("less than 80");
		service.useFilter(lessThanEighty).forEach(System.out::println);
		System.out.println("less than 90");
		service.useFilter(lessThanninety).forEach(System.out::println);
		
		
		service.getStudentNames().forEach(System.out::println);
		service.transformToMap().forEach( (key,value) -> System.out.println(key +" : "+value));
		*/
		
		System.out.println("Highest marks : "+service.highMark());
		System.out.println("Sorted by names");
		service.sortedByName().forEach(System.out::println);
		
		
		

	}

}
