package com.fam.veterinaria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

	@RequestMapping("")
	public String home() {
		
		return "index";
	}
}
