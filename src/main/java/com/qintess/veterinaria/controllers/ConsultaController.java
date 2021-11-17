package com.qintess.veterinaria.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.qintess.veterinaria.repositorios.VeterinariaRepository;
import com.qintess.veterinaria.repositorios.VeterinarioRepository;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private VeterinariaRepository veterinariaRepository;

	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	@RequestMapping("/criar")
	public String criar() {
		
		return "consulta/agendamento";
	}
	
	@RequestMapping("/agenda")
	public String agenda(Model model) {
		
		model.addAttribute("clientes", veterinariaRepository.findAll());
		return "consulta/agenda";
	}
	
	@RequestMapping("/veterinarios")
	public String veterinarios(Model model) {
		
		model.addAttribute("veterinarios", veterinarioRepository.findAll());
		return "consulta/veterinarios";
	}
}
