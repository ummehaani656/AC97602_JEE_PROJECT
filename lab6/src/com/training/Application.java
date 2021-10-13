package com.training;

import java.util.ArrayList;

public class Application {
	public static  void print(ArrayList<Product> list) {
		for(Product eachitem:list) {
 			System.out.println(eachitem);
		}
	}

	public static void main(String[] args) {
	ProductService service=new ProductService();
	FoodItem item1=new FoodItem(1,"sugar",25,"Food",100,true);
	FoodItem item2=new FoodItem(2,"Salt",12,"Food",10,true);
	FoodItem item3=new FoodItem(3,"Noodles",20,"Food",10,true);
	FoodItem item4=new FoodItem(4,"Baking Soda",100,"Food",50,true);
	
	service.add(item1);
	service.add(item2);
	service.add(item3);
	service.add(item4);
	print(service.TopThree("Food"));
	
	Apparel aitem1=new Apparel(1,"Salwar-Suit",100,"Apparel",400);
	Apparel aitem2=new Apparel(2,"Suit",50,"Apparel",300);
	Apparel aitem3=new Apparel(3,"T-shirt",10,"Apparel",100);
	Apparel aitem4=new Apparel(4,"Legging",40,"Apparel",200);
	service.add(aitem1);
	service.add(aitem2);
	service.add(aitem3);
	service.add(aitem4);
	print(service.TopThree("Apparel"));
	
	Electronics eitem1=new Electronics(1,"Laptop",100,"electronics",50000);
	Electronics eitem2=new Electronics(2,"Mobile phone",10,"electronics",12000);
	Electronics eitem3=new Electronics(3,"Tablet",20,"electronics",10000);
	Electronics eitem4=new Electronics(4,"LCD",50,"electronics",5000);
	service.add(eitem1);
	service.add(eitem2);
	service.add(eitem3);
	service.add(eitem4);
	print(service.TopThree("electronics"));

	}

}
