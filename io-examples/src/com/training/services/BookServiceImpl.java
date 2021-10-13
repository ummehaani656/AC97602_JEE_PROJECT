package com.training.services;

import java.io.*;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class BookServiceImpl implements BookService {
	/*
	 * the book service has write() method with throws clause,so we can override and add throws clause
	 * if BookSerive interface is not having throws clause
	 * then we have to override and handle IOexception  CANNOT use throws clause;
	 */

	@Override
	public boolean write(Book book) throws IOException {
		boolean result=false;
		try(PrintWriter writer=new PrintWriter(new FileWriter("book.txt",true))){
			writer.println(book.toString());
			result=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Book[] read() throws IOException {
		Book[] booklist=new Book[3];
		try(BufferedReader reader=new BufferedReader(new FileReader("book.txt")))
		{
			String line=null;
			int i=0;
			while((line=reader.readLine())!=null) {
				String values[]=line.split(",");
				Book book=new Book(Integer.parseInt(values[0]),values[1],values[2],Double.parseDouble(values[3]));
				booklist[i]=book;
				i++;
			}
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return booklist;
	}

}
