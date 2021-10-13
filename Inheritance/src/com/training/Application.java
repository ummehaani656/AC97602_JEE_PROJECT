package com.training;

public class Application {
     Object obj;
	public static void main(String[] args) {
//		Book headFirstJava= new Book(101,"Head First Java","Kathy Sieera",450);
//		System.out.println(headFirstJava);
		
//		Insurance lifeInsurance=new Insurance(101,"Ashok",200000);
//	System.out.println("expected answer is 10000: Actual is :"+lifeInsurance.calculatePremium());
		VehicleInsurance VInsurance=new VehicleInsurance(101,"Ashok",200000,"bike");
		System.out.println("expected answer is 2000: Actual is :"+VInsurance.calculatePremium());
		
		

	}
	

}
