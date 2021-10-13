package com.example.executor.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Application {

	public static void main(String[] args) {
		Runnable task1=new PrintStreamTask("Idly","sambar");
	    Runnable task2=new PrintStreamTask("Pizza","Coke");
	   Runnable task3= new PrintStreamTask("Chole","kulche");
	    Runnable task4=new PrintStreamTask("Tea","Biscuit");
	    Runnable[] taskList= {task1,task2,task3,task4};
	   
	    //using single thread pool=>execution is in sequential manner
	   // ExecutorService service=Executors.newSingleThreadExecutor();
	    
	    //using fixed thread pool=> the execution is in concurrent  manner
	    ExecutorService service=Executors.newFixedThreadPool(4);
	    
	    for(Runnable eachTask:taskList) {
	    	service.submit(eachTask);
	    }
	    service.shutdown();
	   
	}

}
