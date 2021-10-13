package com.example.legacy.threads;

public class Application {

	public static void main(String[] args) {
     try{
    	 Runnable tenCounter=new CountNumbers(10);
     
     Thread t1=new Thread(tenCounter,"Ten Counter");
     t1.start();
     Thread.sleep(1600);
     Runnable HunCounter=new CountNumbers(100);
     Thread t2=new Thread(HunCounter,"Hundred Counter");
     t2.start();
     Thread.sleep(1600);
     
     
     Runnable thouCounter=new CountNumbers(1000);
     Thread t3=new Thread(thouCounter,"thousand Counter");
     t3.start();
     Thread.sleep(1600);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

}
}
