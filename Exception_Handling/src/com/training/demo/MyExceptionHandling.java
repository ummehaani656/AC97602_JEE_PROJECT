package com.training.demo;

public class MyExceptionHandling {
	//example for unchecked exception=> runtime exception
	//all classes that extends runtime are unchecked
	public void usingClassCastException()
	{
		//Object ageObj="twenty";
		Object ageObj=Integer.valueOf(20);
		Integer age;
		try {
			age = (Integer)ageObj;
			System.out.println(age);
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			System.err.println("Age object should be a number[0-9]");
			e.printStackTrace();
		}
		
	}
	
	public void usingMultiCatch(String strNumber) {
		String value=null;
		String[] name= {"ram","shyam"};
		
		
		try {
			int num=Integer.parseInt(strNumber);
			
			System.out.println(num);
			System.out.println(value.length());
			System.out.println(name[2]);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("the argument should be a number[0-9]");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.err.println("Argument should not be null"); 
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("All exceptions are handled");
			e.printStackTrace();
		}
		
		
	}
	
	public void tryWithMultipleCatch()
	{
		try { 
			int numerator =20;
			int[] denominators= {10,0};
			System.out.println(numerator/denominators[0]);
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {
			// TODO Auto-generated catch block
	
			e.printStackTrace();
			
		}}

	
	public void usingFinallyBlock()
	{
		try { 
			int numerator =20;
			int[] denominators= {10,0};
			System.out.println(numerator/denominators[1]);
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		finally {
			System.out.println("inside finally block");
		}
	
	 }
	
	public void usingResourceBlock() {
		
	}
	
}


