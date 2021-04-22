package com.courses.client.curriculum.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectsController {
	
	@GetMapping("/")
	public ResponseEntity<String> hello() {
		return ResponseEntity.status(HttpStatus.OK).body("hi rest world");		
	}

}
