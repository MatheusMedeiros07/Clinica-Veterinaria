package com.fam.veterinaria.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fam.veterinaria.repositorios.AgendamentoRepository;
import com.fam.veterinaria.repositorios.ClienteRepository;
import com.fam.veterinaria.repositorios.VeterinarioRepository;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	
	@RequestMapping("/clientes")
	public String agenda(Model model) {
		
		model.addAttribute("clientes", clienteRepository.findAll());
		return "consulta/clientes";
	}
	
	@RequestMapping("/veterinarios")
	public String veterinarios(Model model) {
		
		model.addAttribute("veterinarios", veterinarioRepository.findAll());
		return "consulta/veterinarios";
	}
	
	@RequestMapping("/agendamentos")
	public String agendamentos(Model model) {
		
		model.addAttribute("agendamentos", agendamentoRepository.findAll());
		return "consulta/agendamentos";
	}
}
