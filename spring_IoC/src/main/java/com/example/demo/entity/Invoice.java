package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Component("invoice")
public class Invoice {
private Customer customer;
 private Product product;  
public Customer getCustomer() {
	return customer;
	//it require only one bean but the customer has 2 beans therefore we use qualifier
}
//setter dependency injection used
//@Autowired
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Product getProduct() {
	return product;
}
//@Autowired
public void setProduct(Product product) {
	this.product = product;
}
//constructor injection
@Autowired
public Invoice(@Qualifier("shyam") Customer customer,@Qualifier("sony") Product product) {
	super();
	this.customer = customer;
	this.product = product;
}
  
  
  
}
