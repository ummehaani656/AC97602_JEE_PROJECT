package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.Product;

@Configuration
public class ApplicationConfig {
	//bean factory
	//Spring IOC container will call this method and 
	//register with bean id "ram"
	//ram being the method name
	@Bean
	public Customer ram() {
		return new Customer(101,"Ramesh",8796325014L);
		
	}
	//two beans of same type customer so we need to specify the id=> default id is method name
	@Bean
	public Customer shyam() {
		return new Customer(105,"shyam",8796312583L);
		
	}
	public Customer vicky() {
		return new Customer(103,"Vicky",8796321258L);
		
	}
	//bean factory
		//Spring IOC container will call this method and 
		//register with bean id "sony"
		//sony  being the attribute name
	//overriding the default name which is the method name with custom name
	@Bean(name="sony")
	public Product tv() {
		return new Product(101,"Sony TV",23000);

} 
	@Bean(name="samsung")
	public Product frigde() {
		return new Product(201,"samsung fridge",33000);
	}
	//refering the beans
	@Bean
	public Bill inv() {
		return new Bill(ram(),tv());
	}
	
	@Bean(name="ramsInvoice")
	public Invoice ramsInv() {
		return new Invoice(ram(),tv());
		
	}
	@Bean(name="vickysInvoice")
	public Invoice vickysInv() {
		return new Invoice(vicky(),frigde());
		
	}
	
}
