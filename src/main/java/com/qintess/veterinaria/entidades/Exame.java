package com.qintess.veterinaria.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Exame {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descricao;
}
