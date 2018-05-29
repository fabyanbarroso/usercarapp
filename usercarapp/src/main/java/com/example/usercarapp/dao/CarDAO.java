package com.example.usercarapp.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.usercarapp.model.Car;
import com.example.usercarapp.model.User;

@Repository
public interface CarDAO extends PagingAndSortingRepository<User,Integer>{

	@Query(value = "select c "
			+ "from Car as c "
			+ "where c.idCar = ?1")
	public Car findByIdUser(@Param(value = "idCar")String idCar);
	
	
}
