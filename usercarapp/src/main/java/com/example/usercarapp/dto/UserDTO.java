package com.example.usercarapp.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserDTO {
	
	private Integer idUser;
	private String name;
	private List<Integer> cars;

}
