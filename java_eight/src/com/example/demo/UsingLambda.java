package com.example.demo;

import java.util.function.Predicate;

class Example implements Runnable {
  //inbuilt-functional interface =>traditional method in java 7
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
	
}

public class UsingLambda {

	public static void main(String[] args) {
		//using lambda function in java8
		Runnable task=() -> {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
		};
		
		Thread thread=new Thread(task);
		thread.start();
		
		Condition passMark =() -> "remesh".length() > 10;
		System.out.println(passMark.test());
		System.out.println("Calling the default method "+passMark.show());
		
		Predicate<Integer> isPassmark=(mark)-> mark>60;
		System.out.println("pass status-->"+isPassmark.test(27));
			
		}
	
}
    	 
     



