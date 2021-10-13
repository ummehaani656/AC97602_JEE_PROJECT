package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;




@SpringBootApplication
public class Lab7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt= SpringApplication.run(Lab7Application.class, args);
		StudentService list=cxt.getBean(StudentService.class);
		List<Student> stud=list.getList();
	    list.getList().forEach(System.out::println);
	   //System.out.println("Is singleton  :"+cxt.isSingleton("studentService"));
	   // System.out.println("Scope is prototype :" +cxt.isPrototype("studentService"));
		cxt.close();
	}

}
