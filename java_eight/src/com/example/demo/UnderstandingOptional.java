package com.example.demo;

import java.util.Optional;

public class UnderstandingOptional {
	//using optional class below 
	public static String  getMessage(int key) {
	   
		switch (key) {
		case 1:return "Happy diwali";
		case 2:return "Happy Birthday";
		case 3: return "Happy Anniversary";
		default:return null;
			
		}
	}
    
	public static Optional<String>  getMessage(char key) {
		   
		switch (key) {
		case 'a':return Optional.of("Happy diwali");
		case 'b':return Optional.of("Happy Birthday");
		case 'c': return Optional.of("Happy Anniversary");
		default:return Optional.empty();
			
		}
	}
	
	public static void main(String[] args) {
		
			//System.out.println(getMessage(4).toUpperCase());
		
            Optional<String> resp=Optional.ofNullable(getMessage(4));
           // if(resp.isPresent()) {
            //	System.out.println(resp.get().toUpperCase());
            //}
            //else System.out.println("invalid choice--> check again");
            //resp.orElseThrow(RuntimeException::new);
            System.out.println(resp.orElseGet( () -> getMessage(2)));
            
            Optional<String> value=getMessage('a');
            if(value.isPresent()) {
            	System.out.println(value.get());
            }
            
	}

}

