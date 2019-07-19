package com.pradeep.springbootdemo.mycoolapp.rest;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	// expose "/" that return "Hello World"
	
	@GetMapping("/")
	private String sayHello() {
		return "Hello World! Time on server is "+LocalDateTime.now();
	}

}
