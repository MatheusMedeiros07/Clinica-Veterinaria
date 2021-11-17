package com.fam.veterinaria.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Agendamento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@NotNull
	@Column(length = 60)
	private String nome;
	
	@NotBlank
	@NotNull
	@Column(length = 20)
	private String telefone;
	
	@NotBlank
	@NotNull
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataAgendamento; 
	
	@NotNull
	@NotBlank
	@DateTimeFormat(iso = ISO.DATE)
	private LocalTime horaAgendamento;
	
	@NotBlank
	@NotNull
	@Column(length = 80)
	private String veterinario;

	public Agendamento(Agendamento a) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.dataAgendamento = dataAgendamento;
		this.horaAgendamento = horaAgendamento;
		this.veterinario = veterinario;
	}
	
	public Agendamento() {
		super();
	}
	
	
}
