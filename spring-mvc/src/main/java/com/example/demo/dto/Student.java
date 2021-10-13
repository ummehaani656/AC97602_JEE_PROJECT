package com.example.demo.dto;

import java.time.LocalDate;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class Student {
		  @Range(min=101,max=1000,message="the Roll Number should be between 100 to 200")
		  int rollNumber;
		  @Length(min=3,max=20,message="name should be between 3 and 20 characters")
		  String studentName;
		  @DateTimeFormat(iso = ISO.DATE)
		  LocalDate dateOfBirth;
		  double markScored;
		  
		  
	}


