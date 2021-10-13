package com.training.poly;

import java.io.Serializable;

import com.training.ifaces.Condition;

public class Professor extends Person implements Condition,Serializable {
	private String qualification;
	
	

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.qualification.toLowerCase().equals("phd");
	}

}
