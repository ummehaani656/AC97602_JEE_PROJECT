package com.example.demo;

/**
 * 
 * @author Umme Haani
 * @version 1.0
 * example to understand instance, class variables and methods
 *
 */
public class CreditCard {
	private long cardNumber;// instance variable
	private String cardHolderName;// instance variable
	private static String cardProvider ="Mastercard";
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(long cardNumber, String cardHolderName) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public static String getCardProvider() {
		return cardProvider;
	}
	public static void setCardProvider(String cardProvider) {
		CreditCard.cardProvider = cardProvider;
	}
}
	
	
	
	

