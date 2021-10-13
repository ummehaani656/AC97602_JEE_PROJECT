package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class MemberService {
	//HashMap<String,List<String>> details;
	//by using book object class;
HashMap<String,List<Book>> details;
	
	public MemberService() {
		details=new HashMap<>();
		details.put("anil",Arrays.asList(new Book(101,"Java programming","Cathy Caeser"),new Book(201,"python programming","Thomas Brute")));
		details.put("rahul",Arrays.asList(new Book(102,"Springs in summer","Arunitha reddy"),new Book(202,"java for beginners","Robert T")));
	}
		
		public  List<Book> findByName(String memberName){
			return details.get(memberName);
		}

}
