package com.example.usercarapp.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.usercarapp.model.Car;

@Repository
public interface CarDAO extends PagingAndSortingRepository<Car,Integer>{

	@Query(value = "select c "
			+ "from Car as c "
			+ "where c.idCar = ?1")
	public Car findByIdCar(@Param(value = "idCar")String idCar);
	
	@Query(value = "SELECT * "
			+ "FROM CAR "
			+ "WHERE model = ?1", nativeQuery=true)
	public Car findByModelCar(@Param(value = "idCar")String idCar);
	
	
}
