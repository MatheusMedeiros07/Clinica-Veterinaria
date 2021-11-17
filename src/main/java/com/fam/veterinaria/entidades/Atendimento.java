package com.fam.veterinaria.entidades;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atendimento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDate dataInicio;
	
	private LocalDate dataFim;
}
