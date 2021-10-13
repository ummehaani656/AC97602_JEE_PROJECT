package com.example.demo.exceptions;

public class NameNotfoundException extends Exception {
   String message;

public NameNotfoundException(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return "NameNotfoundException [error:" + message + "]";
}
   
   
}
