package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.dto.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/client/students")
public class ClientController {
  private WebClient client;
  //private static String uri="http://localhost:8080/api/v1/students/";
  //or use this
  private static String baseURI="http://localhost:8080/api/v1/students";
  
  @Autowired
  public void setClient(WebClient client) {
	  this.client=client;
	  
  }
  @GetMapping
  public Flux<String> getAllStudents(){
	  return this.client.get().uri(baseURI)
			  .headers(header -> header.setBasicAuth("india","india"))
					  .retrieve().bodyToFlux(String.class);
  }
  
  @GetMapping("/{rollNumber}")
  public Mono<String> getById(@PathVariable("rollNumber") int rollNumber){
	  //return this.client.get().uri(uri+rollNumber).retrieve().bodyToMono(String.class);
	  //or use this
	  return this.client.get().uri(baseURI+"/{rollNumber}",rollNumber).retrieve().bodyToMono(String.class);
  }
  
  @PostMapping
  public Mono<Student> addStudent(@RequestBody Student entity){
	  return client.post().uri(baseURI).body(Mono.just(entity),Student.class)
			  .retrieve().bodyToMono(Student.class);  
  }
  @DeleteMapping("/{rollNumber}")
  public Mono<String> RemoveById(@PathVariable("rollNumber") int rollNumber){
	  return client.delete().uri(baseURI+"/{rollNumber}",rollNumber).retrieve().bodyToMono(String.class);  
  }
  @PutMapping("/{rollNumber}/{markToUpdate}")
  public Mono<String> updateMark(@PathVariable("rollNumber") int rollNumber
  		,@PathVariable("markToUpdate") double markToUpdate){
	  return client.put().uri(baseURI+"/{rollNumber}/{markToUpdate}",rollNumber,markToUpdate).retrieve().bodyToMono(String.class); 
	  
  }
}
