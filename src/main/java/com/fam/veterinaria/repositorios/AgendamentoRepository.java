package com.fam.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.fam.veterinaria.entidades.Agendamento;


public interface AgendamentoRepository extends CrudRepository<Agendamento, Integer> {

}
