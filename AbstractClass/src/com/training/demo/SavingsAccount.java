package com.training.demo;

import java.util.Objects;

public class SavingsAccount extends BankAccount {
	private String nominee;
	
	

	public SavingsAccount(long accountNumber, double balance, String nominee) {
		super(accountNumber, balance);
		this.nominee = nominee;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(nominee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		return Objects.equals(nominee, other.nominee);
	}

	@Override
	public double deposit(double amount) {
		double currBalance=getBalance();
		double updatedBalance=currBalance+amount;
		setBalance(updatedBalance);
		
		return updatedBalance;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		double currBalance=getBalance();
		if(currBalance-amount>1000) {
			double updatedBalance=currBalance-amount;
			setBalance(updatedBalance);
			return updatedBalance;
		}
		else {
			System.out.println("Minimum balance should be maintained");
			return 0;
		}
		
	
   
} 
	public String showGreeting()
	{ return "Welcome";
	}
}
