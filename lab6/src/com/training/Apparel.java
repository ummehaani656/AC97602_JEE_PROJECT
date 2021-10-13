package com.training;

public class Apparel extends Product {
	private int size;
	private String material;
	
	public Apparel(int itemCode, String itemName, double quantity,String itemType, double unitPrice) {
		super(itemCode, itemName, quantity,itemType, unitPrice);
	this.size=size;
	this.material=material;
	}
	
	

	
}
