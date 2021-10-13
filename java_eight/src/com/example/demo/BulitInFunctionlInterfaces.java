package com.example.demo;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.training.entity.Student;
;

public class BulitInFunctionlInterfaces {

	public static void main(String[] args) {
        List<String> names=Arrays.asList("Ramesh","Suresh","Mahesh");
        List<String> city=Arrays.asList("Bangalore","Mysore","Tumkuru");
        for(String eachname:names)
        	System.out.println(eachname);
        names.forEach(e -> System.out.println(e));
        //Consumer<String> print=(e) -> System.out.println(e);
        //1
        Consumer<String> print=System.out::println;//e is not passed and only reference is made using ::
        names.forEach(print);
        city.forEach(print);
        
        //2
        Student ram=new Student(101,"ram",LocalDate.now(),90);
        Predicate<Student> result =(obj)-> obj.getMarkScored()>80;
        System.out.println("Result = "+result.test(ram));
       
        //3
        Supplier<String> message=() -> "Happy Ramzan";
        System.out.println("Greeting = "+message.get());
        
        //4
        Function<String, Integer> func=(arg)-> arg.length();
        System.out.println(func.apply(message.get()));
	}

}
