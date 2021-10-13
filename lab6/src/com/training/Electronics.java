package com.training;

public class Electronics extends Product {
	private int warrantyMonths;
	
	

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

   

	public Electronics(int warrantyMonths) {
		super();
		this.warrantyMonths = warrantyMonths;
	}



	public Electronics(int itemCode, String itemName, double quantity,String itemType,double unitPrice) {
		super(itemCode, itemName, quantity,itemType, unitPrice);
		// TODO Auto-generated constructor stub
	}

    

	public int getWarrantyMonths() {
		return warrantyMonths;
	}



	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}

     

	
	


	
}
