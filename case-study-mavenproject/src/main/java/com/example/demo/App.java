package com.example.demo;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.example.demo.daos.EmployeeDaoImpl;
import com.example.demo.entity.Employee;
import com.example.demo.ifaces.EmployeeRepository;
import com.example.demo.utils.DbConnection;




public class App 
{
    public static void main( String[] args )
    {
    	
		Connection con=DbConnection.getOracleConnection();
		Logger log=Logger.getRootLogger();
		EmployeeRepository<Employee, LocalDate, String> repo=new EmployeeDaoImpl(con) ;
		
		System.out.println("Select the option to do the following operations :");
		System.out.println("Select 1 :To  add employee details :");
		System.out.println("Select 2 : To retrieve information about  the employee  by entering firstname:");
		System.out.println("Select 3 : To edit the details of an employee  by entering firstname:.");
		System.out.println("Select 4 : To get the name and email id of  employee by entering the date of birth ");
		System.out.println("Select 5 : To get the name and phone number of  employee by entering the weddingAnniversary date ");
		System.out.println("Select 6 : to get the details Just FirstName and Phone Number of all the employees");
		 Scanner scanner=new Scanner(System.in);	
		 int  choice =scanner.nextInt();
		 log.info("entered choice is : "+choice);
			switch(choice){
			case 1:
				System.out.println("Enter the First Name of the Employee:");
			String firstName =scanner.next();
			System.out.println("Enter the Last Name of the Employee:");
			String  lastName=scanner.next();
			System.out.println("Enter the Address of the Employee:");
			String address =scanner.next();
			System.out.println("Enter the Email Address of the Employee:");
			String emailAddress =scanner.next();
			System.out.println("Enter the Phone Number of the Employee: which should be 10 digits");
			long phoneNumber =scanner.nextLong();
			System.out.println("Enter the Date of Birth as yyyy-mm-dd  of the Employee:");
			String birthdayString =scanner.next();
			LocalDate birthday = LocalDate.parse(birthdayString);
			System.out.println("Enter the Wedding Anniversary Date of the Employee: or if unmarried enter 0000-01-01");
			String weddingAnniversaryString =scanner.next();
			LocalDate weddingAnniversary = LocalDate.parse(weddingAnniversaryString);
			log.info("The entered details are :"+firstName+" , "+lastName+" , "+address+" ,"+emailAddress+" , "
			+phoneNumber+" , "+birthday+" , "+weddingAnniversary);
			Employee obj=new Employee(firstName,lastName,address,emailAddress,phoneNumber,birthday,weddingAnniversary);
			boolean result =repo.add(obj);
			
			if(result) {
				log.info("One Employee Added");
				break;
			}
			case 2:
				log.debug("Enter the First Name of the Employee:");
				String name =scanner.next();
				Employee details=repo.findByName(name);
				log.info(details);
				break;
			case 3:int updated=repo.update();break;
			case 4:
				System.out.println("Enter the Date of Birth as yyyy-mm-dd  of the Employee:");
				String births =scanner.next();
				LocalDate birth = LocalDate.parse(births);
				repo.findByBirthday(birth);
				break;
			case 5:
				LocalDate wedding;
				System.out.println("Enter the Wedding date as yyyy-mm-dd  of the Employee:");
				String weddingDate =scanner.next();
				 wedding = LocalDate.parse(weddingDate);
				repo.findByWeddingAnniversery(wedding);
				break;
			case 6:
				List<Employee> list=repo.findAll();
				list.stream().map(Employee::getFirstName).forEach(System.out::println);
				list.stream().map(Employee::getPhoneNumber).forEach(System.out::println);
				break;
				
			default:System.out.println("Please enter the correct option!");
			}
			scanner.close();
		
    }	}
    

