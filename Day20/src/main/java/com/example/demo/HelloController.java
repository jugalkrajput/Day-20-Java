package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@GetMapping("/welcome")
	public String greet()
	{
		return "Hello Everyone, Welcome to the Spring Boot";
	}
}
