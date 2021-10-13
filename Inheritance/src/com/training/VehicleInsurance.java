package com.training;

public class VehicleInsurance extends Insurance {
	private String vehicleType;

	public VehicleInsurance() {
		super();
		System.out.println("Inside sub class 0 param constructor");
	}

	public VehicleInsurance(int policyNumber, String policyHolderName, double policyAmount) {
		super(policyNumber, policyHolderName, policyAmount);
		System.out.println("inside subclass -3param");
		// TODO Auto-generated constructor stub
	}

	public VehicleInsurance(int policyNumber, String policyHolderName, double policyAmount, String vehicleType) {
		super(policyNumber, policyHolderName, policyAmount);
		System.out.println("inside sub class -4 param");
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	
	
	

	@Override
	public String toString() {
		return "VehicleInsurance [getPolicyNumber()=" + getPolicyNumber() + ", getPolicyHolderName()="
				+ getPolicyHolderName() + ", getPolicyAmount()=" + getPolicyAmount() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public double calculatePremium()
	{
		double premium=1000;
		
		switch(vehicleType.toLowerCase()) {
		case "car":
			if(getPolicyAmount()>50000)
			premium=1000;
		
		case "bike":
			if(getPolicyAmount()>50000)
				premium=2000;
				
		}
		return premium;
		
	}
	

}
