package com.training.services;

import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.utils.AuthorComaparator;
import com.training.utils.BookNameComparator;

public class GandhiLibrary {
     public static void print( String message,List<Book> list) {
    	 System.out.println(message);
    	 for(Book eachBook:list) {
 			System.out.println(eachBook);
    	 
     }}
	public static void main(String[] args) {
		Book spring=new Book(101,"Springs in action","Thomson",850);
		Book java=new Book(102,"Effective Java","Bruce",450);
		Book python=new Book(103,"Python fundamentals","TwoAnna",500);
		
		CrudRepository repo=new BookRepos();
		repo.add(spring);
		repo.add(java);
		repo.add(python);
		List<Book> BookList=repo.findAll();
		
		
		print("displaying the list",BookList);
		//System.out.println(BookList.size());
		//BookList.set(1, python);
		//System.out.println(BookList.size());
		//System.out.println("After setting the element");
		//for(Book eachBook:BookList) {
		//	System.out.println(eachBook);
		//}
		Collections.sort(BookList);
		//System.out.println("the list in sorted order of number");
		print("Sorted by number",BookList);
		Collections.sort(BookList, new BookNameComparator());
		//System.out.println("the list in sorted order of Name");
		print("Sorted by Name",BookList);
		Collections.sort(BookList,new AuthorComaparator());
		//System.out.println("the list in sorted order of Author");
		print("Sorted by Author",BookList);
		
		

	}

}
