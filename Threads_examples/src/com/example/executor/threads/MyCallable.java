package com.example.executor.threads;

import java.util.concurrent.Callable;

public  class MyCallable implements Callable<Integer> {
  private String message;
  
  
	public MyCallable(String message) {
	super();
	this.message = message;
}

    //to implement callable of integer type
	@Override
	public Integer call() throws Exception {
	  int count=0;
	  for(int i=0;i<=10;i++) {
		  count+=i;
		  
	  }
		return count;
	}


	//@Override
	//public String call() throws Exception {
	
	//	return "Hello "+message+"!";
	//}

}
