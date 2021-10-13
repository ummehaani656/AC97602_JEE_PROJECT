package com.training;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee();
		emp1.setEmpId(12358);
		emp1.setEmployeeName("Priya Sharma");
		emp1.setSalary(50000);
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmployeeName());
		System.out.println(emp1.getSalary());
		
		Employee emp2=new Employee();
		emp2.setEmpId(12865);
		emp2.setEmployeeName("Rakesh Roshan");
		emp2.setSalary(500);
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getEmployeeName());
		System.out.println(emp2.getSalary());
		
	}

}
