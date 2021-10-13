package com.example.demo;

public class localAndParameterExample {
	private int num=900;  //instance variable
	private static String name="Priya"; //class variable
	
	public void usingLocalVariable()
	{
		//int age;
		/*local variable=> have to be initialized b4 use
		 * cannot use private/public/protected/default in case of local variable
		 * 
		 */
		int age=20;
		System.out.println(age);
	}
	
	public void usingInstanceVariable()
	{
		System.out.println(num);//instance variable,they have default value
	}
	
	public CreditCard usingParamVariable(CreditCard card)
	{//  instance methods can access static and instance variables and methods
		System.out.println(name);
		System.out.println(num);
		card.setCardHolderName("Ms. "+card.getCardHolderName());
		return card;
	}
	
	public int usingPrimitive(int num)
	{
		num=45;
		return num;
	}
	
	public static void usingInstance()
	{ //can only access static variables and methods
		//System.out.println(num);
		
	}
}

