package com.example.demo.utils;
import java.sql.*;
import java.time.LocalDate;
import java.util.List;

import com.training.daos.StudentDaoImpl;
import com.training.entity.Student;
import com.training.ifaces.CrudRepository;
public class Application {

	public static void main(String[] args) {
	//System.out.println(DbConnection.getOracleConnection());
		Connection con=DbConnection.getOracleConnection();
		CrudRepository<Student,Integer> repo=new StudentDaoImpl(con) ;
		int key=4;
		if(key==1) {
		Student ram=new Student(103,"Nilesh",LocalDate.of(1998, 12, 12),96);
		boolean result =repo.add(ram);
		
		if(result) {
			System.out.println("One student Added");
		}}
			if(key==2) {
				List<Student> list=repo.findAll();
				for(Student eachstudent:list) {
					System.out.println(eachstudent);
				}	
			}
				if(key==3) {
					Student obj=repo.findById(103);
					System.out.println(obj);
				}
				
				if(key==4) {
					Student pam=new Student(103,"pam",null,96);
					Boolean result=repo.remove(pam);
					if(result) {
						System.out.println("1 row deleted");
					}
					
				}
		}

	}


