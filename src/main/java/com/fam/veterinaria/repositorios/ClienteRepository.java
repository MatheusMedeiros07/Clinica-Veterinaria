package com.fam.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.fam.veterinaria.entidades.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
