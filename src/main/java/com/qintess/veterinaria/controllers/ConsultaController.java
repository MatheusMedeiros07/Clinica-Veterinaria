package com.qintess.veterinaria.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.qintess.veterinaria.repositorios.VeterinariaRepository;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private VeterinariaRepository veterinariaRepository;
	
	@RequestMapping("/criar")
	public String criar() {
		
		return "consulta/agendamento";
	}
	
	@RequestMapping("/agenda")
	public String agenda(Model model) {
		
		model.addAttribute("clientes", veterinariaRepository.findAll());
		return "consulta/agenda";
	}
}
