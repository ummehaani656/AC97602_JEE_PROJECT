package com.training;

public class ItemService {
	public double findDiscount(Item item)
	{
		double discount=item.getRatePerUnit()*0.05;
		return discount;
	}
	
	public double findDiscount(Item item,Customer customer)
	{  //float rate=item.getRatePerUnit();
		if(customer.getCustomerCategory().toLowerCase().equals("corporate")) {
	       return (item.getRatePerUnit()*0.15);
		}
		else if(customer.getCustomerCategory().toLowerCase().equals("retail")) {
			return (item.getRatePerUnit()*0.10);
		
		}
		else
			{
			 return (item.getRatePerUnit()*0.05);
			}
		
		
				
	}

}
