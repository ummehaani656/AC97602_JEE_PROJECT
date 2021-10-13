package com.training;
import java.util.Scanner;
public class UsingScanner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the RollNUMBER :");
			int  rollNumber =scanner.nextInt();
	
        System.out.println("Enter the Student Name :");
		String  studentName =scanner.next();
		System.out.println("Enter the Marks scored :");
		double markScored=scanner.nextDouble();
		System.out.println("Enter the Email :");
		String email=scanner.next();
		
		Student obj= new Student(rollNumber,markScored,studentName,email);
		System.out.println(obj.getStudentName()+obj.getMarkScored());
		scanner.close();
		
		

	}

}
