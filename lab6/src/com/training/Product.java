package com.training;



public abstract class Product implements Comparable<Product> {
	private int itemCode;
	String itemName;
	protected double quantity;
	 String itemType;
	private double unitPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int itemCode, String itemName, double quantity,String itemType, double unitPrice) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.itemType=itemType;
		
		this.unitPrice = unitPrice;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + ", unitPrice="
				+ unitPrice + "]";
	}
	
	public int compareTo(Product o) {
	     if(this.quantity>o.quantity) return 1;
	     if(this.quantity<o.quantity) return -1;
			return 0;
		}
	
	
	
}
