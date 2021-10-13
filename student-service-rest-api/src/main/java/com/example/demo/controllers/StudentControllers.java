package com.example.demo.controllers;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@RestController 
@RequestMapping(path="/api/v1/students")
public class StudentControllers {
   private StudentService service;


@Autowired
public void setService(StudentService service) {
	this.service = service;
}   
   //uri mapping is prefixed with /api/ followed by the version number/ followed by
   //entity class name in plural and in lowercase
   // @GetMapping(path="/api/v1/students") => inorder to type the path repetatively we can do 
   //@requestMapping
    @GetMapping
    @RolesAllowed(value = {"ROLE_ADMIN"})
    public List<Student> findAll(){
    	return this.service.findAll();
    }
    
    @GetMapping("/{rollNumber}")
    @RolesAllowed(value = {"ROLE_ADMIN", "ROLE_GUEST"})
    public Student findById(@PathVariable("rollNumber") int rollNumber){
    	return this.service.findById(rollNumber);
    }
    @GetMapping("/srch/{name}")
    public List<Student> findByName(@PathVariable("name") String studentName){
    	return this.service.findByName(studentName);
    }
   
   // @PostMapping(path="/api/v1/students")
    @PostMapping
    public ResponseEntity<Student> add(@RequestBody Student entity) {
    	
    	Student addedEntity=this.service.addStudent(entity);
    	return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
    }
    @PutMapping("/{rollNumber}/{markToUpdate}")
    public ResponseEntity<String> updateMark(@PathVariable("rollNumber") int rollNumber
    		,@PathVariable("markToUpdate") double markToUpdate){
    	int count= this.service.updateMark(rollNumber,markToUpdate);
    	return ResponseEntity.ok().body(count+" :record updated");
    }
    @DeleteMapping("/{rollNumber}")
    public ResponseEntity<String> removeStudent(@PathVariable("rollNumber") int rollNumber){
    	int count= this.service.remove(rollNumber);
    	HttpStatus status=HttpStatus.NOT_FOUND;
    	String message="record not found";
    	if(count==1){
    		status=HttpStatus.OK;
    		message="One record Deleted";
    	}
    	
    			return ResponseEntity.status(status).body(message);
    }
    
    
}
