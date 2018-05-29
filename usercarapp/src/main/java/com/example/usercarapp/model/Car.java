package com.example.usercarapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Car {
	
	public static final String FIELD_USER = "user";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String idCar;
	
	@Column(nullable = false)
	private String model;
	
	@JoinColumn(name = FIELD_USER)
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	

}
