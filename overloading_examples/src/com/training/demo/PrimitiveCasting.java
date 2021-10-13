package com.training.demo;

public class PrimitiveCasting {
	//casting primitives
	//wrapper class
	//autoboxing
	//method overloading

	public static void main(String[] args) {
		
      int age=23;
      long maxAge=age;//here casting is not required => int to long =upcasting noneed to do manually
      long salaryPerMonth=55000;
     // int salary= salaryPerMonth;
      //casting long to int=> requires down casting
      int salary= (int)salaryPerMonth;
      System.out.println(salary);
      System.out.println(maxAge);
	}

}
