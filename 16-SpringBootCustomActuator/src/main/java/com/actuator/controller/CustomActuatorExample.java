package com.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomActuatorExample {
	
	@GetMapping("/hello")
	public String printMessage() {
		
		return "Hello All! Welcome to Coding ";
		
	}
	
}
