package com.example.usercarapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class userController {

	UserService carService;
	
	UserMapper carMapper;
	
	@RequestMapping(value = "/{id}"), method = RequestMethod.)
	public UserDTO findByID(@RequestParam(defaultValue = "0", required = false) Integer id) {
		
		final Optional<User> user = 
	}
	
}
