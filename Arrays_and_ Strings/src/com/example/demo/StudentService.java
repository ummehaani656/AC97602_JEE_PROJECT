package com.example.demo;

public class StudentService {
	private Student[] Stdlist;//declaration
	private static int maxSize=3;
	private static int count=0;

	public StudentService(Student[] stdlist) {
		super();
		this.Stdlist = stdlist;//initialization
	}
	
	

	public StudentService() {
		super();
	    this.Stdlist= new Student[maxSize];
	}

    public boolean addStudent(Student student)
    {  //create a if condition -if the condition is met u add the element if no-return boolean false and 
    	//return a message cannot add the elements;
    	if(count<maxSize) {
    	this.Stdlist[count++]=student;
    	return true;
    	}
    	else {
    
    		return false;
    	}
    }


	public Student[] getStdlist() {
		return this.Stdlist;
	}



	



	

	
	
	

}
