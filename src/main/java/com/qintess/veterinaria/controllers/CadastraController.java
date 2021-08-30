package com.qintess.veterinaria.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qintess.veterinaria.entidades.Animal;
import com.qintess.veterinaria.entidades.Cliente;
import com.qintess.veterinaria.repositorios.AnimalRepository;
import com.qintess.veterinaria.repositorios.VeterinariaRepository;

@Controller
@RequestMapping("/cadastra")
public class CadastraController {

	@Autowired
	private VeterinariaRepository veterinariaRepository;

	@Autowired
	private AnimalRepository animalRepository;
	
	
	@RequestMapping("/novo")
	public String novo(Model model) {
		
		var cliente = new Cliente();
		
		model.addAttribute("cliente", cliente);
		return "cadastro/cadastra";
	}
	
	@RequestMapping("/salva")
	public String cadastra(@Valid Cliente cliente) {
		veterinariaRepository.save(cliente);
		return "redirect:/consulta/agenda/";
	}
	
	@RequestMapping("/deleta/{id}")
	public String deleta(@PathVariable int id) {
		
		veterinariaRepository.deleteById(id);
		return "redirect:/consulta/agenda/";
	}
	
	@RequestMapping("/edita/{id}")
	public String edita(@PathVariable int id, Model model) {
		
		var clienteOptional = veterinariaRepository.findById(id);
		
		if(clienteOptional.isPresent()) {
			var cliente = clienteOptional.get();
			var clienteDto = new Cliente(cliente);
			
			model.addAttribute("cliente", clienteDto);
		}
		return "cadastro/cadastra";
	}
	
	@RequestMapping("/animais-cliente/{id}")
	public String animais(@PathVariable int id, Model model) {
		
		Cliente cliente = veterinariaRepository.findById(id).get();
		model.addAttribute("animais", cliente.getAnimais());
		model.addAttribute("clienteId", id);
		return "consulta/animais";
	}
	
	@RequestMapping("/cadastra-animal/{id}")
	public String cadastraAnimal(@PathVariable int id, Model model) {
		var animal = new Animal();	
		model.addAttribute("animal", animal);
		model.addAttribute("clienteId", id);
		return "cadastro/cadastra-animal";
	}
	
	@RequestMapping("/salva-animais/{id}")
	public String salvaAnimal(@PathVariable int id, @Valid Animal animal) {
		animalRepository.save(animal);
		
		Cliente cliente = veterinariaRepository.findById(id).get();
		cliente.addAnimal(animal);
		veterinariaRepository.save(cliente);
		return "redirect:/cadastra/animais-cliente/" + id;
	}
	
	@RequestMapping("/deleta-animal/{clienteId}/{id}")
	public String deletaAnimal (@PathVariable int clienteId, @PathVariable int id) {
		
		Cliente cliente = veterinariaRepository.findById(clienteId).get();
		Animal animal = animalRepository.findById(id).get();
		cliente.removeAnimal(animal);
		veterinariaRepository.save(cliente);
		
		return "redirect:/cadastra/animais-cliente/" + clienteId;
	}
	
	@RequestMapping("/edita-animal/{clienteId}/{id}")
	public String editaAnimal(@PathVariable int id, Model model) {
		
		var animalOptional = animalRepository.findById(id);
		
		if(animalOptional.isPresent()) {
			var animal = animalOptional.get();
			var animalDto = new Animal(animal);
			
			model.addAttribute("animal", animalDto);
			model.addAttribute("clienteId", id);
		}
		return "cadastro/cadastra-animal";
	}
}
