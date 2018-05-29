package com.example.usercarapp.dao;
import com.example.usercarapp.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface UserDAO extends PagingAndSortingRepository<User,Integer>{

	@Query(value = "select u "
			+ "from User as u "
			+ "where u.idUser = ?1")
	public User findByIdUser(@Param(value = "idUser")Integer idUser);
	
	@Query(value = "SELECT * "
			+ "FROM USER"
			+ "WHERE id_car = ?1", nativeQuery=true)
	public List<User> findByIdCar(@Param(value = "idCar")String idCar);
	
}
