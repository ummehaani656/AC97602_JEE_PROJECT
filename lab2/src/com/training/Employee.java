package com.training;

public class Employee {
	private double empId;
     
	private String employeeName;
    private double salary;
 
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(double empId, String employeeName, double salary) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public double getEmpId() {
		return empId;
	}

	public void setEmpId(double empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) 
	{
		if(salary>5000)
		this.salary = salary;
		else 
			System.out.println("invalid salary");
	}
    
    
    
}
