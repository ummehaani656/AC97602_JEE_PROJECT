package com.training.entity;

import java.time.LocalDate;

public class Student {
	private int rollNumber ;
	private String StudentName;
	private LocalDate dateofBirth;
	private double markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, LocalDate dateofBirth, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.StudentName = studentName;
		this.dateofBirth = dateofBirth;
		this.markScored = markScored;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public LocalDate getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", StudentName=" + StudentName + ", dateofBirth=" + dateofBirth
				+ ", markScored=" + markScored + "]";
	}
	
	
}
