package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	
	@GetMapping("/course")
	public String courseName() {
		return "Spring Boot Course ";
	}
	
}
