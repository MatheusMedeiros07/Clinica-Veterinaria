package com.qintess.veterinaria.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Veterinario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@NotNull
	@Column(length = 30)
	private String CRV;
	
	@NotBlank
	@NotNull
	@Column(length = 60)
	private String nome;
	
	@NotBlank
	@NotNull
	@Column(length = 60)
	private String endereco;
	
	@NotBlank
	@NotNull
	@Column(length = 60)
	private String especialidades;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Atendimento> atendimentos = new ArrayList<Atendimento>();

	
	public Veterinario(Veterinario v) {
		super();
		this.id = v.id;
		this.CRV = v.CRV;
		this.nome = v.nome;
		this.endereco = v.endereco;
		this.especialidades = v.especialidades;
	}
	

	public Veterinario() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCRV() {
		return CRV;
	}

	public void setCRV(String cRV) {
		CRV = cRV;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void addAtendimentos(Atendimento atendimento) {
		atendimentos.add(atendimento);
	}
	
	public void removeAtendimentos(Atendimento atendimento) {
		atendimentos.remove(atendimento);
	}
	
	
	
}
