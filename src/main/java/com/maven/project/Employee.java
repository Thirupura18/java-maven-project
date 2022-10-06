package com.maven.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Employee {

	@GetMapping("/message")
	public String getMessage() {
		return "Happy Diwali...!";
	}
}
