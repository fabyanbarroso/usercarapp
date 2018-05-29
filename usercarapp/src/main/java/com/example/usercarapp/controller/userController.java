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
	
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping(method = RequestMethod.POST)
	public UserDTO create(@RequestBody UserDTO dto) {
		final User user = userMapper.dtoToModel(dto);
		final User createUser = userService.create(user);
		return userMapper.modeltoDto(createUser);
	}
	
	
	@RequestMapping(value = "/{id}"), method = RequestMethod.)
	public UserDTO findByID(@RequestParam(defaultValue = "0", required = false) Integer id) {
		
		final Optional<User> user = userService.findById(id);
		return userMapper.modelToDto(user.get());
	}
	
	
	
}