package com.fam.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.fam.veterinaria.entidades.Veterinario;

public interface VeterinarioRepository extends CrudRepository<Veterinario, Integer> {

}
