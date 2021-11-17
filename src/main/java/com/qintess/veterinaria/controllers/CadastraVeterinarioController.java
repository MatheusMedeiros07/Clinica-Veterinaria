package com.qintess.veterinaria.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.entidades.Cliente;
import com.qintess.veterinaria.entidades.Veterinario;
import com.qintess.veterinaria.repositorios.AnimalRepository;
import com.qintess.veterinaria.repositorios.VeterinariaRepository;
import com.qintess.veterinaria.repositorios.VeterinarioRepository;

@Controller
@RequestMapping("/cadastra-veterinario")
public class CadastraVeterinarioController {

	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	
	@RequestMapping("/novo")
	public String novo(Model model) {
		var veterinario = new Veterinario();
		
		model.addAttribute("veterinario", veterinario);
		return "cadastro/cadastra-veterinario";
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
