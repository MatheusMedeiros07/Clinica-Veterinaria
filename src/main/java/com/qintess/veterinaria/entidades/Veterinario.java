package com.qintess.veterinaria.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Veterinario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String CRV;
	
	private String nome;
	
	private String endereco;
	
	private String especialidades;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Atendimento> atendimentos = new ArrayList<Atendimento>();
	
}
