package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	
	
	@GetMapping(path = "/teachers")
	public String getTeachers() {
		
		return "Mala Bala Kala";
	}
	
	@GetMapping(path = "/teachers/{id}")
	public String getTeachersById(@PathVariable("id") int id) {
		
		String response ="Nila";
		if(id==1) {
		response ="Mala";
		}
		return response;
	}
	
}
