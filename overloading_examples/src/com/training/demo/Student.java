package com.training.demo;

public class Student {

		//modifier type name=initial_value
		private int rollNumber; //private
		private double markScored;//protected-inheritance
		private String email; //public-accessible anywhere
		private String studentName;//default package
	
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(int rollNumber, double markScored, String email, String studentName) {
			super();
			this.rollNumber = rollNumber;
			this.markScored = markScored;
			this.email = email;
			this.studentName = studentName;
		}

		public int getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}

		public double getMarkScored() {
			return markScored;
		}
		
	        
		
        
		
		public void setMarkScored(double markScored) {
			this.markScored = markScored;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		
		
		
}
