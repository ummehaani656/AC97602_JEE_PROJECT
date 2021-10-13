package com.example.demo;

public class Application {

	public static void main(String[] args) {
	Student ram= new Student(101,98,"ram@gamil.com","ram");
	Student shyam= new Student(102,90,"shyam@gamil.com","shyam");
	Student ganesh= new Student(103,91,"ganesh@gamil.com","Ganesh");
	Student Sam=new Student(104,86,"sam23@gmail.com","sam");
	
	StudentService service= new StudentService();
	service.addStudent(ram);
	service.addStudent(shyam);
	service.addStudent(ganesh);
	boolean bool=service.addStudent(Sam);
	if(!bool)
	{System.out.println("The array is full");}
		System.out.println(bool);
	
	Student[] list= service.getStdlist();
	for(Student eachStudent:list)
	{
	System.out.println(eachStudent.getStudentName());
	}

}}
