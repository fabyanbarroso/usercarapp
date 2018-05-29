package com.example.usercarapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String idCar;
	
	@Column(nullable = false)
	private String model;
	

}
