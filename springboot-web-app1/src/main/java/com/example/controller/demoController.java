package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class demoController {
	
	@GetMapping("/hello-world")
	public String getMsg(){
		String test="This is Sai Babu";
		ResponseEntity<String> response= new ResponseEntity<>(test,HttpStatus.OK);
		return response.getBody();
	}

}
