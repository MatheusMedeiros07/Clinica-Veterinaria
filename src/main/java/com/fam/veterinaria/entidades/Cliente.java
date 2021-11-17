package com.fam.veterinaria.entidades;

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

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Cliente {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@NotNull
	@Column(length = 60)
	private String nome;
	
	@NotBlank
	@NotNull
	@Column(length = 14)
	@CPF
	private String cpf;
	
	@NotBlank
	@NotNull
	@Column(length = 80)
	private String endereco;
	
	@NotBlank
	@NotNull
	@Column(length = 20)
	private String telefone;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Animal> animais = new ArrayList<Animal>();

	
	public Cliente() {}
	
	public Cliente(Cliente c) {
		this.id = c.getId();
		this.nome = c.getNome();
		this.cpf = c.getCpf();
		this.endereco = c.getEndereco();
		this.telefone = c.getTelefone();
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void addAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public void removeAnimal(Animal animal) {
		animais.remove(animal);
	}
	
	
}
