package com.fam.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.fam.veterinaria.entidades.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {
}
