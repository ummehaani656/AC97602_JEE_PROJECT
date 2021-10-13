package com.training;

import com.training.ifaces.BookService;
import com.training.model.Book;
import com.training.services.BookServiceImpl;
import com.training.services.BookServicesImplwithStream;

public class Application {

	public static void main(String[] args) {
    BookService service=new BookServiceImpl();
    BookService obj=new BookServicesImplwithStream();
    int key=4;
    try{
    	switch(key) {
    case 1: 
    	Book book=new Book(102,"Spring in action","Thomson Alfred",850);
    	boolean result=service.write(book);
    	if(result) {
    		System.out.println("Added to the file");
    	}
    case 2:
    	Book[] list=service.read();
    	for(Book eachbook:list) {
    		if(eachbook!=null) {
    			System.out.println(eachbook);
    		}
    	}
    	break;
    case 3:
    	Book jsbook=new Book(104,"Java Script","Paul Watson",350);
    	
    	boolean status=obj.write(jsbook);
    	if(status) {
    		System.out.println("One book Serialized");
    	}
    	break;
    case 4:
    	Book[] foundlist=obj.read();
    	
    			System.out.println(foundlist[0]);
    		
    	
    	break;
    	default:
    		break;
    }
	}
    catch(Exception e) {
     e.printStackTrace();
    }
    	
    	
    	
    }
    
	}


