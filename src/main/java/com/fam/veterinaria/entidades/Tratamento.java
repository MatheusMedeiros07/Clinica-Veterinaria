package com.fam.veterinaria.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Tratamento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descricao;
}
