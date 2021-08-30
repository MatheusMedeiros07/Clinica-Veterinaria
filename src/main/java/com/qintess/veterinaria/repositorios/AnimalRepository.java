package com.qintess.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.qintess.veterinaria.entidades.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {
}
