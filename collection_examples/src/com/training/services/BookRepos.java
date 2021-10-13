package com.training.services;

import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookRepos implements CrudRepository {
	
	private ArrayList<Book> BookList;//declaring
	
	

	public BookRepos() {
		super();
		this.BookList=new ArrayList<>();//initializing
	}

	@Override
	public boolean add(Book book) {
		/*
		 * type safety or generics prevent adding any other object other than book;
		 */
      //return this.BookList.add(new String("hello"));
		
		//System.out.println("List Size "+this.BookList.size());
		return this.BookList.add(book);
	}

	@Override
	public List<Book> findAll() {
         
		return this.BookList;
	}

	@Override
	public int update(Book book) {

		return 0;
	}

	@Override
	public boolean remove(Book book) {

		return false;
	}

}
