package com.training;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		Boolean flag=true;
		Scanner sc=new Scanner(System.in);
		
		
	while(flag) {

		
		System.out.println("Enter the Item id :");
		int ItemId=sc.nextInt();
		System.out.println("Enter the Item name :");
		String ItemName=sc.next();
		System.out.println("Enter Rate per unit:");
		float ratePerUnit=sc.nextFloat();
		System.out.println("Enter the customer category :");
		String customerCategory=sc.next();
		
		ItemService obj= new ItemService();
		Item item=new Item(ItemId,ItemName,ratePerUnit,customerCategory);
		Customer type=new Customer(customerCategory);
		System.out.println(obj.findDiscount(item));
		
		   System.out.println(obj.findDiscount(item,type));
		System.out.println("Enter the flag value");
		
		Boolean flag1=sc.nextBoolean();
		if (flag1.equals(flag)) {
	        continue;
		}
	        else {
	        	break;
	    }
		
	}
	    
		sc.close();
	}
		

	}


