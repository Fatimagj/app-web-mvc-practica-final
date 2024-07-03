package com.keepcoding.app.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.keepcoding.app.web.entity.Usuario;
import com.keepcoding.app.web.repository.UsuarioRepository;
import com.keepcoding.app.web.service.UsuarioService;



@Controller
public class UsuarioController {

		@Autowired
		private UsuarioService usuarioService;

		
		@GetMapping({"/", "/login"})
	    public String index(Model modelo) {
			modelo.addAttribute("usuario", new Usuario());
	        return "login";
	    }
		
		
		@PostMapping("/login")
		public String procesarLogin(@RequestParam String email, @RequestParam String password, Model modelo) {
			List<Usuario> usuarioAutentificado = usuarioService.findByEmailAndPassword(email, password);
			
			if(usuarioAutentificado != null && !usuarioAutentificado.isEmpty()) {
				modelo.addAttribute("usuario", usuarioAutentificado);
				return "redirect:/alumnos";
			}else {
				modelo.addAttribute("Error, el usuario y/o contraseña son incorrectas. Íntentelo de nuevo.");
				return "/login";
			}
					
		}
		
		@GetMapping("/new")
		public String newUsuarioForm(Model modelo) {
			modelo.addAttribute("usuario", new Usuario());
			return "registrar_usuario";
		}
		
		@PostMapping("/usuario/registrar")       
		public String saveUsuario(@ModelAttribute ("usuario") Usuario usuario) {
			usuarioService.save(usuario);
			return "redirect:/login";
		}
		
}
