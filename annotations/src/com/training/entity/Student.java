package com.training.entity;

import com.training.stereotypes.Column;
import com.training.stereotypes.Table;

@Table(TableName="Vidyarthi")
public class Student {
	@Column(name="rollNumber")
	private int id;
	
	 @Column(name="firstName")
	 private String name;

	public Student() {
		super();
		
	}
	

}
