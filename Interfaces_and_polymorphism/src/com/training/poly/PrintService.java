package com.training.poly;
import com.training.ifaces.Condition;
public class PrintService {
	
	//public static void print(Student obj) {
	//	System.out.println(obj.test());
	//}
	
	//public static void print(Professor obj) {
	//	System.out.println(obj.test());
	//}
	
	public static void print(Condition obj) {
		System.out.println(obj.test());
		}
	
	public static void print(Condition[] obj) {
		//print all
		for(Condition eachElement:obj) {
			System.out.println(eachElement.test());
		}
		
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student(89);
		//print(ram);
		Professor shyam=new Professor("phd");
		//print(shyam);
		
		Student sam=new Student(79);
		Professor adi=new Professor("B.E");
		
   //pass all the four to the print 
		Condition[] list= {ram,shyam,sam,adi};
		print(list);
	}

}
