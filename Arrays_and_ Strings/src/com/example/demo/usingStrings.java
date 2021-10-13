package com.example.demo;
//substr,length,trim,uppercase,lowercase
public class usingStrings {

	public static void main(String[] args) {
		String city="Hyderabad";
		String firstName="RAMESH";
		String lastName="Kanna";
		String college="  Thapar college   ";
		System.out.println("Length of string"+city.length());
		System.out.println("Transfer to uppercase"+lastName.toUpperCase());
		System.out.println("Substring :"+city.substring(6, 8));
		System.out.println("College :"+college.length());
		System.out.println("Trim College :"+college.trim().length());
		System.out.println("character at position 2 :"+city.charAt(1));
		System.out.println("the index of h in the string :"+college.indexOf("h"));
		

	}

}
