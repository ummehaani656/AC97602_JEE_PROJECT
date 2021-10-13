package com.training.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class BookServicesImplwithStream implements BookService {

	@Override
	public boolean write(Book book) throws IOException {
	   boolean result=false;
	   try(ObjectOutputStream outstream=new ObjectOutputStream(new FileOutputStream(new File("book.ser")))) {
		   outstream.writeObject(book);
		   result=true;
		   
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
		return result;
	}

	@Override
	public Book[] read() throws IOException {
		Book[] booklist=new Book[2];
		try(ObjectInputStream inputstream =new ObjectInputStream(new FileInputStream("book.ser")))
		{
			
			int i=0;
			
				Book bk=(Book) inputstream.readObject();
				
				booklist[i]=bk;
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return booklist;
	
	}

}
