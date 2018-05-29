package com.example.usercarapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int idUser;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column()
	private String password;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = Car.FIELD_USER)
	Set<Car> cars;
}