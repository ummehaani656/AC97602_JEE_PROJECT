package com.training.poly;

import java.io.Serializable;

import com.training.ifaces.Condition;
//marker interface -that doesn't have any method;
//functional interface- that  have only 1  method;
//interface-have more than 1 method;

public class Student extends Person implements Condition,Serializable {
	private int markScored;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public int getMarkScored() {
		return markScored;
	}




	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}




	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}




	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.markScored>80;
	}

}
