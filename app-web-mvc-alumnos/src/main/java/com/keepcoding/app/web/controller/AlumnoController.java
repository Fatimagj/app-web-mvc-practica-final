package com.keepcoding.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {
	
	@GetMapping("/login")
	public String login(Model modelo) {
		modelo.addAttribute("key", "este valor desde el controlador");
		return "alumno";
	}
}
