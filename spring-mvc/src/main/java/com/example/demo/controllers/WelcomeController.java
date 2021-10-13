package com.example.demo.controllers;

import org.springframework.http.MediaType;
import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.Student;
@Controller
public class WelcomeController {
	@Autowired
	private  RestTemplate template; 
	@Autowired
	private Student object;
	@RequestMapping(value="/",method=RequestMethod.GET)
  public String init(Model model) {
	  model.addAttribute("majHeading","Malla Reddy College of Engineering");
	  return "index";
  }
	@GetMapping(path="/addStudent")
	public String sendForm(Model model) {
		model.addAttribute("command",object);
		return "addStudent";
	}
	//@PostMapping(path="/addStudent")
	//public String submitForm(Student student, Model model) {
		//System.out.println(student);
		//model.addAttribute("added",student);
		//return "success";
	//}another approach 
	
	//@PostMapping(path="/addStudent")
	//public ModelAndView submitForm(Student student) {
		//System.out.println(student);
		//mdlView.addObject("added",student);
		//mdlView.setViewName("success")
		//return mdlView;
	//}
	
	//@PostMapping(path="/addStudent")
	//public String submitForm(@ModelAttribute("command") Student student) {
		//System.out.println(student);
		
		//return "success";
	
	@PostMapping(path="/addStudent")
	public String submitForm(@Valid @ModelAttribute("command") Student student,BindingResult result) {
		//System.out.println(student);
		String nextStep="success";
		if(result.hasErrors()) {
			nextStep="addStudent";
		}
		else {
			template.postForObject("http://localhost:6161/api/v1/students",student,Student.class);
		    HttpHeaders header=new HttpHeaders();
		    header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    header.setContentType(MediaType.APPLICATION_JSON);
		    HttpEntity<Student> requestBody=new HttpEntity<>(student,header);
		    Student resp=template.postForObject("http://localhost:6161/api/v1/students",requestBody,Student.class);
		    System.out.println(resp);
		}
		return nextStep;
	}
	@GetMapping(path = "/getAllStudents")
	public String findAll(Model model) {

	Student[] resp =template.getForObject("http://localhost:6161/api/v1/students",
	Student[].class);

	model.addAttribute("data",resp);
	return "showall";

	}
	
	
}
