package com.example.demo;
import com.google.gson.*;
public class MyJsonParser {
	private Gson parser;

	public MyJsonParser() {
		super();
		this.parser=new GsonBuilder().setPrettyPrinting().create();
	}

	public String convertToJson(Product product) {
		//Gson parser=new GsonBuilder().setPrettyPrinting().create();
		return parser.toJson(product);
	}
     
	public Product jsonToJava(String value) {
		//Gson parser=new Gson();
		return parser.fromJson(value, Product.class);
	}
}
