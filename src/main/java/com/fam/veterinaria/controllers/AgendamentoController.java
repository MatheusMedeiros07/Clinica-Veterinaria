package com.fam.veterinaria.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fam.veterinaria.entidades.Agendamento;
import com.fam.veterinaria.entidades.Cliente;
import com.fam.veterinaria.entidades.Veterinario;
import com.fam.veterinaria.repositorios.AgendamentoRepository;


@Controller
@RequestMapping("/agendamento")
public class AgendamentoController {

	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	
	
	@RequestMapping("/novo")
	public String novo(Model model) {
		var agendamento = new Agendamento();
		
		model.addAttribute("agendamento", agendamento);
		return "cadastro/cadastra-agendamento";
	}
	
	
	@RequestMapping("/salva")
	public String cadastra(@Valid Agendamento agendamento) {
		agendamentoRepository.save(agendamento);
		return "redirect:/consulta/agendamentos/";
	}
	
	@RequestMapping("/deleta/{id}")
	public String deleta(@PathVariable int id) {
		
		agendamentoRepository.deleteById(id);
		return "redirect:/consulta/agendamentos/";
	}
	
	@RequestMapping("/edita/{id}")
	public String edita(@PathVariable int id, Model model) {
		
		var agendamentoOptional = agendamentoRepository.findById(id);
		
		if(agendamentoOptional.isPresent()) {
			var agendamento = agendamentoOptional.get();
			var agendamentoDto = new Agendamento(agendamento);
			
			model.addAttribute("agendamento", agendamentoDto);
		}
		return "cadastro/cadastra-agendamento";
	}
	
	
}
