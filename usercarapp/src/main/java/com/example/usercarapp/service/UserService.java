package com.example.usercarapp.service;

import java.util.List;

import com.example.usercarapp.dto.UserDTO;
import com.example.usercarapp.model.User;
import com.example.usercarapp.exception.NotFoundException;


public interface UserService {
	
	public List<UserDTO> findAll(Integer page, Integer size);
	
	public UserDTO findByIdUser(Integer idUser) throws NotFoundException;
	
	public List<UserDTO> finIdCar(String idCar) throws NotFoundException;
	
	public User create(User u);
	
	public void update (User u);
	
}
