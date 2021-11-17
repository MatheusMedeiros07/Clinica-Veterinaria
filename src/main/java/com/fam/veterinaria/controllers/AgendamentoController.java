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
import com.fam.veterinaria.repositorios.AnimalRepository;
import com.fam.veterinaria.repositorios.ClienteRepository;
import com.fam.veterinaria.repositorios.VeterinarioRepository;

@Controller
@RequestMapping("/agendamento")
public class AgendamentoController {

	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	@RequestMapping("/criar")
	public String criar() {
		
		return "cadastro/agendamento";
	}
	
	@RequestMapping("/novo")
	public String novo(Model model) {
		var agendamento = new Agendamento();
		
		model.addAttribute("agendamento", agendamento);
		return "cadastro/agendamento";
	}
	
	
	@RequestMapping("/salva")
	public String cadastra(@Valid Veterinario veterinario) {
		veterinarioRepository.save(veterinario);
		return "redirect:/consulta/veterinarios/";
	}
	
	@RequestMapping("/deleta/{id}")
	public String deleta(@PathVariable int id) {
		
		veterinarioRepository.deleteById(id);
		return "redirect:/consulta/veterinarios/";
	}
	
	@RequestMapping("/edita/{id}")
	public String edita(@PathVariable int id, Model model) {
		
		var veterinarioOptional = veterinarioRepository.findById(id);
		
		if(veterinarioOptional.isPresent()) {
			var veterinario = veterinarioOptional.get();
			var veterinarioDto = new Veterinario(veterinario);
			
			model.addAttribute("veterinario", veterinarioDto);
		}
		return "cadastro/cadastra-veterinario";
	}
	
	
}
