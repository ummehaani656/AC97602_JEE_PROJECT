package com.training.model;

import java.util.Objects;

public class Student implements Comparable<Student> {

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

		@Override
		public int hashCode() {
			return Objects.hash(email, markScored, rollNumber, studentName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(email, other.email)
					&& Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
					&& rollNumber == other.rollNumber && Objects.equals(studentName, other.studentName);
		}

		@Override
		public int compareTo(Student o) {
	     if(this.rollNumber>o.rollNumber) return 1;
	     if(this.rollNumber<o.rollNumber) return -1;
			return 0;
		}

		@Override
		public String toString() {
			return "Student [rollNumber=" + rollNumber + ", markScored=" + markScored + ", email=" + email
					+ ", studentName=" + studentName + "]";
		}
		
		
		
}
