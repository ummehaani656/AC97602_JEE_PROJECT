package com.example.executor.threads;

public class PrintStreamTask implements Runnable {
	private String str1;
	private String str2;
	
	
	
	public PrintStreamTask(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		/*
		 * the following lines are commented because we are going to use the executor framework. 
		 * In executor framework threads are created and 
		 *  we only need to submit the task and no need of creating the thread.
		 */
		
		//Thread thread=new Thread(this);
		//thread.start();
		
	}
	@Override
	public void run() {
		PrintStrings.print(str1,str2);
		
	}

}
