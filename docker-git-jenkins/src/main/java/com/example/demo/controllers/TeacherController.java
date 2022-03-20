package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	
	
	@GetMapping(path = "/teachers")
	public String getTeachers() {
		
		return "Mala Bala Kala";
	}
}
