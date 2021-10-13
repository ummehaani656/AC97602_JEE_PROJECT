package com.training;

public class Book {
  private int bookNumber;
  private String bookName;
  private String author;
  private double price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int bookNumber, String bookName, String author, double price) {
	super();
	this.bookNumber = bookNumber;
	this.bookName = bookName;
	this.author = author;
	this.price = price;
}
public int getBookNumber() {
	return bookNumber;
}
public void setBookNumber(int bookNumber) {
	this.bookNumber = bookNumber;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

//method name should be same
//method args and order should be same
//return type should be same
//the modifier- should not reduce visibility
@Override
public String toString() {
	// TODO Auto-generated method stub
	return (this.bookNumber+": "+this.bookName+": "+this.author+": "+this.price);
}




  
  
}
