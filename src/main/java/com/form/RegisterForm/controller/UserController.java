package com.form.RegisterForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.RegisterForm.entity.User;
import com.form.RegisterForm.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<String> createUser(@RequestBody User user)
	{
		
		return new ResponseEntity<String>(userService.saveUser(user),HttpStatus.OK);
	}


}
