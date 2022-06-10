package com.sbnz.pestdeterminatorapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbnz.pestdeterminatorapp.model.User;
import com.sbnz.pestdeterminatorapp.service.serviceInterface.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> findByUsername() {
		 
	return new ResponseEntity<>(userService.findByUsername("student") , HttpStatus.OK);
	
	}
}
