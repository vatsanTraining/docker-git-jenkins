package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	
	@GetMapping(path = "/students")
	public String getStudents() {
		
		return "Ram ramesh suresh";
	}
}





