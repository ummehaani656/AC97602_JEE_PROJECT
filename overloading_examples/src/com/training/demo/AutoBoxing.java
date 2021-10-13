package com.training.demo;

public class AutoBoxing {
	public static void print(int a, int b)
	{
		System.out.println(a+b);
	}
    
	public static void printUsingWrapper(Integer a,Integer b)
	{
		System.out.println(a+b+100);
	}
	public static void main(String[] args) {
		
      print(46,54);
      //java uses autoboxing to convert primitive to objects
      printUsingWrapper(46,54);
	}

}
