package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard ram=new CreditCard(101,"Ram Reddy");
		CreditCard shyam=new CreditCard(102,"Shyam Sharma");
		CreditCard sam=new CreditCard(103,"Sam Chopra");
		CreditCard priya=new CreditCard(104,"priya Sharma");
		 
		CreditCardService service=new CreditCardService();
		service.addCard(ram);
		service.addCard(shyam);
		service.addCard(sam);
		service.addCard(priya);
		
		CreditCard[] array =service.getcardlist();
		int reddyCount=0;
		int sharmaCount=0;
		 
		for(CreditCard eachcard:array)
		{
			String name=eachcard.getCardHolderName();
			if(name.toLowerCase().contains("reddy"))
			{ reddyCount++;
			}
			else if(name.toLowerCase().contains("sharma"))
			{ sharmaCount++;
			}
			System.out.println(eachcard);	
		}
		System.out.println("reddy Count :" +reddyCount);
		System.out.println("sharma Count :" +sharmaCount);
		
		
		
		
		
	}

}
