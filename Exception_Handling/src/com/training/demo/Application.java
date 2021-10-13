package com.training.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.training.Student;
import com.training.demo.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MyExceptionHandling handler=new MyExceptionHandling();
   try(Scanner sc=new Scanner(System.in)){
	   System.out.println("enter the value[1-6]:");
   int key=sc.nextInt();
   
   switch (key) {
   case 1: handler.usingClassCastException();break;
   case 2:handler.usingMultiCatch("45");break;
   case 3: handler.tryWithMultipleCatch();break;
   case 4: handler.usingFinallyBlock();break;
   case 5: Student ram=new Student();
            ram.setMarkScored(89);
            System.out.println(ram.getMarkScored());
            break;
   case 6: Student shyam=new Student(202,105,"Shyam","shyam123@gmail.com");
   System.out.println(shyam);
            break;
   default:break;
	}

} 
	catch(InputMismatchException | RangeCheckException e) {
	e.printStackTrace();
}
  
	}}
