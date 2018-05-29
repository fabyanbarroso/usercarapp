package com.example.usercarapp.service;

import java.util.List;
import com.example.usercarapp.dto.CarDTO;
import com.example.usercarapp.model.Car;
import com.example.usercarapp.exception.NotFoundException;

public interface CarService {

	public List<CarDTO> findAll(Integer page, Integer size);
	
	public CarDTO findByIdCar(String idCar) throws NotFoundException;
	
	public Car create(Car c);
}

