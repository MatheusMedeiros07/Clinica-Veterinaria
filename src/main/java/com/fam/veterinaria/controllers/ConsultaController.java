package com.fam.veterinaria.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fam.veterinaria.repositorios.ClienteRepository;
import com.fam.veterinaria.repositorios.VeterinarioRepository;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	
	@RequestMapping("/agenda")
	public String agenda(Model model) {
		
		model.addAttribute("clientes", clienteRepository.findAll());
		return "consulta/agenda";
	}
	
	@RequestMapping("/veterinarios")
	public String veterinarios(Model model) {
		
		model.addAttribute("veterinarios", veterinarioRepository.findAll());
		return "consulta/veterinarios";
	}
}
