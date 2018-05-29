package com.example.usercarapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class userController {

	@Autowired
	UserService userSevice;
	
	UserMapper userMapper;
	
	@RequestMapping(value = "/{id}"), method = RequestMethod.)
	public UserDTO findByID(@RequestParam(defaultValue = "0", required = false) Integer id) {
		
		final Optional<User> user = userService.findById(id);
		return userMapper.modelToDto(user.get());
	}
	
}
