package com.training.demo.exceptions;

public class RangeCheckException extends Exception {
	private String message;

	public RangeCheckException(String message) {
		super(message);
		this.message=message;
		
	}
	@Override
	public String getMessage()
	{
		return "Exception :"+message;
	}
	
	

}
