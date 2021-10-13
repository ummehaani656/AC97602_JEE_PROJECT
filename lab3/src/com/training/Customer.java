package com.training;

public class Customer {
	
	private String customerCategory;
	public Customer() {
		super();
		
		
	}
	public Customer( String customerCategory) {
		super();
		
		this.customerCategory = customerCategory;
	}
	
	
	public String getCustomerCategory() {
		return customerCategory;
	}
	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}
	
	
	

}
