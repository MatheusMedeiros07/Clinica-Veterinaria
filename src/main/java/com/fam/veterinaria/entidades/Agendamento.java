package com.fam.veterinaria.entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
	
	
	@NotNull
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataAgendamento; 
	
	@NotNull
	@DateTimeFormat(iso = ISO.TIME)
	private LocalTime horaAgendamento;
	
	
	@NotNull
	@Column(length = 80)
	private String veterinario;

	public Agendamento(Agendamento a) {
		this.id = a.id;
		this.nome = a.nome;
		this.telefone = a.telefone;
		this.dataAgendamento = a.dataAgendamento;
		this.horaAgendamento = a.horaAgendamento;
		this.veterinario = a.veterinario;
	}
	
	public Agendamento() {
		super();
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
	public String getDataAgendamento1() {
		
		return dataAgendamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public LocalTime getHoraAgendamento() {
		return horaAgendamento;
	}

	public void setHoraAgendamento(LocalTime horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
	}

	public String getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}
	
	
	
	
	
}
