package com.example.demo;

public class Application {
	public static void print(CreditCard card)
	{
		System.out.println(card.getCardHolderName());
		System.out.println(card.getCardNumber());
		System.out.println(CreditCard.getCardProvider());
		/*
		 * static method should be accessed by class name =>classname.method()
		 * static method should not  be accessed by obj.method().If it's done
		 * warning is thrown
		 * System.out.println(card.getcardProvider());
		 */
		
	}

	public static void main(String[] args) {
		CreditCard card = new CreditCard(10990,"Haani");
		/*
		 * since print is the static method of the same class
		 */
		print(card);
		
		localAndParameterExample obj=new localAndParameterExample();
		obj.usingInstanceVariable();
		
		System.out.println(card.getCardHolderName());
		//when u r passing objects, the copy of reference is passed
		//changes made to objects inside method=> it will get reflected
		obj.usingParamVariable(card);
		System.out.println(card.getCardHolderName());
		
		int num=89;
		System.out.println("number :"+num);
		obj.usingPrimitive(num);
		System.out.println("Number again :"+num);
		

	}

}
