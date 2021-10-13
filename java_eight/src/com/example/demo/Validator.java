package com.example.demo;
@FunctionalInterface
public interface Validator {
	public boolean Validate();
    public default String show() {
    	return " i am  From validator ";
    	
    }
}
