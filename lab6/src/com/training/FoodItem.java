package com.training;

public class FoodItem extends Product {
	private boolean isVegetarian;
	
	

	

	public FoodItem(int itemCode, String itemName, double quantity,String itemType,double price,boolean isVegeterian) {
		super(itemCode, itemName, quantity,itemType,price);
		this.isVegetarian=isVegeterian;
		
	}

	

	

}
