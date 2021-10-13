package com.example.demo;

public class UnderstandingDefaultMethods implements Condition, Validator {

	@Override
	public boolean Validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String show() {
		
		//return "I am from class";
		return Condition.super.show()+Validator.super.show()+" This is  from class ";
	}


	
}
