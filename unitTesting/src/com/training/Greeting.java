package com.training;

import java.util.Arrays;
import java.util.List;

public class Greeting {
   public String getMessage() {
	   return "Hello India";
   }
   
   public String assignGrade(double mark) {
	   String grade="c";
	   if(mark<=40) {
		   grade="b";
	   }
	   else if(mark>40 &&mark<80) {
		   grade="a";
	   }
	   return grade;
   }
   
   public void parse(String mark) {
	   try {
		   int markScored=Integer.parseInt(mark);
		   System.out.println(markScored);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		throw e;
	}
   }
   
   public String getBestBook(int code) {
	   try {
		   Thread.sleep(2000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   List<String> bookList=Arrays.asList("java","python","Ruby","c#");
	   return bookList.get(code);
	   
   }
}
