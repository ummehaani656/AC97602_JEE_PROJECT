package com.training.demo;

public class CorporateAccount extends BankAccount {

	public CorporateAccount(long accountNumber, double balance) {
		super(accountNumber,balance);
}
	@Override
	public double deposit(double amount)
	{
		return 0;
		
	}
	
	@Override
	public double withdraw(double amount)
	{
		return 0;
		
	}
	
}
	 

