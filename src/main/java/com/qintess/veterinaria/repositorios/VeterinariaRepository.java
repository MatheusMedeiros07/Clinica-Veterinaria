package com.qintess.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.qintess.veterinaria.entidades.Cliente;

public interface VeterinariaRepository extends CrudRepository<Cliente, Integer> {

}
