package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {
	@Id  //only for primary key
	@Column(name="rollnumber")
  int rollNumber;
	@Column(name="syudentname")
  String studentName;
	@Column(name="dateofbirth")
  LocalDate dateOfBirth;
	@Column(name="markscored")
  double markScored;
  
}
