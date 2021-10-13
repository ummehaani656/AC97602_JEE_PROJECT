
package com.example.demo;
import java.util.*;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Logger log=Logger.getRootLogger();
       
       
       try(Scanner sc=new Scanner(System.in);){
    	   log.debug("Inside try block");
       System.out.println("Enter the number");
       double num=sc.nextDouble(); 
       log.info("You entered the number : "+num);
       
    	   if(num<0) {
    		   log.error("The number should be a positive ");
    		   throw new Exception("Invalid number");   
    	   }
    	      double result=Math.sqrt(num);
    	      log.info("completed squareRoot : " +result);
    	   
		
	} catch (Exception e) {
       log.debug(e.getMessage());
       e.printStackTrace();
	}
       
    }
}
