package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component  //class name with first character in lowercase will be the default name
@Setter
//@Scope("prototype")
@AllArgsConstructor
@Getter
@ToString

public class StudentService {
	@Autowired
	private List<Student> list;

	public StudentService() {
		super();
		System.out.println("===== StudentService called =====");
	}
	
	

	//public List<Student> getList() {
		//return list;
	//}
    //@Autowired
	//public void setList(List<Student> list) {
		//this.list = list;
	//}
	
	

}
