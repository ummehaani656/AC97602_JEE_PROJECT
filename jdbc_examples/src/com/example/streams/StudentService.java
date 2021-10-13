package com.example.streams;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import com.training.entity.Student;
import java.util.function.*;

public class StudentService {
	private List<Student> studentlist;

	public StudentService() {
		super();
		this.studentlist=new ArrayList<>();
		this.studentlist.add(new Student(101,"Sam",LocalDate.of(1998, 12, 2),98));
		this.studentlist.add(new Student(102,"Ram",LocalDate.of(1995, 1, 20),95));
		this.studentlist.add(new Student(103,"Pam",LocalDate.of(1991, 10, 12),75));
		this.studentlist.add(new Student(104,"Shyam",LocalDate.of(1997, 8, 21),80));
		this.studentlist.add(new Student(104,"Gam",LocalDate.of(1997, 8, 21),28));
	}
	 public List<Student> useFilter(){
		 return this.studentlist.stream().filter(e ->e.getMarkScored()>80).collect(Collectors.toList());
	 }
   public List<Student> useFilter(Predicate<Student> predicate)
   {
	   return this.studentlist.stream().filter(predicate).collect(Collectors.toList());
	 
   }
   
   public Map<String,Double> transformToMap(){
	   return this.studentlist.stream().filter(e ->e.getMarkScored()>80)
			   .collect(Collectors.toMap(Student::getStudentName,Student::getMarkScored));
   }
   
   public List<String> getStudentNames(){
	   return this.studentlist.stream().filter(e ->e.getMarkScored()>80)
			   .map(e -> e.getStudentName()).collect(Collectors.toList());
   }
   
   public Set<Student> sortedByName(){
	   TreeSet<Student> list=this.studentlist.stream().sorted()
			   .collect(Collectors.toCollection(TreeSet::new));
	   
	   
	     List<Student> list2=this.studentlist.stream().sorted(Comparator.comparing(Student::getStudentName))
			   .collect(Collectors.toList());
	     list2.forEach(e -> System.out.println(e.getStudentName()));
	     
	   return list;
   }
	public  double highMark() {
		
   Optional<Student> value= this.studentlist.stream()
		   .max(Comparator.comparing(Student::getMarkScored));
   double max=0;
   if(value.isPresent()) {
	   max=value.get().getMarkScored();
   }
	return max;   
   }
    
}
