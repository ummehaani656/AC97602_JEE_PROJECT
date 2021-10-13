package com.training;

public class Insurance {
	private int policyNumber;
	private String policyHolderName;
	private double policyAmount;
	public Insurance() {
		super();
		System.out.println("the superclass 0 param");
		// TODO Auto-generated constructor stub
	}
	public Insurance(int policyNumber, String policyHolderName, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
		System.out.println("the superclass -3 param");
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	@Override
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName + ", policyAmount="
				+ policyAmount + "]";
	}
	
	public double calculatePremium()
	{
		double premium=5000;
		if(this.policyAmount>100000) {
			premium=10000;
		}
			return premium;
	}

}
