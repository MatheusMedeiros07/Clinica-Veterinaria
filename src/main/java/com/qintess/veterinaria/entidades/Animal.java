package com.qintess.veterinaria.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.print.DocFlavor.CHAR_ARRAY;


@Entity
public class Animal {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 70)
	private String nome;
	
	//@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private String especie;
	
	//@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private String raca;

	
	private LocalDate dataNasc;
	

	
	public Animal() {}

	public Animal(Animal a) {
		this.id = a.id;
		this.nome = a.nome;
		this.especie = a.especie;
		this.raca = a.raca;
		this.dataNasc = a.dataNasc;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	
	
	
	public String getDataNasc1() {
		
		return dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	
	
	
	
}
