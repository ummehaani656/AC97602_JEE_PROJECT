package com.example.legacy.threads;

public class JoinApplication {

	public static void main(String[] args) {
     System.out.println("main started");
     TaskForJoin task =new TaskForJoin();
     Thread t1=new Thread(task);
     t1.start();
     try {
    	 t1.join();	 
     }catch(InterruptedException e) {
    	 e.printStackTrace();
     }
     System.out.println("main finished");

	}

}
