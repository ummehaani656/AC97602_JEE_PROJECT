package org.training;
import com.training.*;

public class SecondApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student();  
		//System.out.println(ram.rollNumber); //rollNumber is  private therefore not visible
		//System.out.println(ram.studentName); //  different package ,default package so not able to access it in subclass
		//System.out.println(ram.markScored);//protected modifier-since its different package not able to access it in subclass
		System.out.println(ram.email);

	}

}
