package com.keepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.app.web.service.UsuarioService;

@Controller
public class UsuarioController {

		@Autowired
		private UsuarioService usuarioService;
		
		@GetMapping("/usuarios")
		public String usuarioList(Model modelo) {
			modelo.addAttribute("usuario", usuarioService.listaUsuario());
			return "usuario";		
		}
}
