package com.keepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.app.web.entity.Usuario;
import com.keepcoding.app.web.service.UsuarioService;



@Controller
public class UsuarioController {

		@Autowired
		private UsuarioService usuarioService;
		
		//Para que al registrar un nuevo usuario te devuelva la lista de usuarios registrados con el nuevo registro y de ahí ya tener la opción de alumno
		@GetMapping("/usuarios")
		    public String usuariosList(Model modelo) {
		        modelo.addAttribute("usuario", usuarioService.listarusuario("usuario"));
		        return "usuario";
		
		}
		
		//Login
		
		@GetMapping({"/", "/login"})
	    public String index(Model modelo) {
			modelo.addAttribute("usuario", new Usuario());
	        return "login";
	    }
		
		@PostMapping("/login")
		public String login(@ModelAttribute("usuario") Usuario usuario, Model modelo) {
			Usuario usuarioAutenticado = usuarioService.autenticar(usuario.getUsername(), usuario.getPassword());
			
			if(usuarioAutenticado != null) {
				return "redirect:/alumnos";
			}else {
				modelo.addAttribute("usuario", usuario);
				modelo.addAttribute("error", "El usuario y/o contraseña son incorrectas. Intentelo de nuevo.");
				return "/login";
			}
					
		}
		
		//Registrar nuevo usuario
		
		@GetMapping("/new")
		public String newUsuarioForm(Model modelo) {
			modelo.addAttribute("usuario", new Usuario());
			return "registrar_usuario";
		}
		
		@PostMapping("/usuario/registrar")       
		public String saveUsuario(@ModelAttribute ("usuario") Usuario usuario) {
			usuarioService.save(usuario);
			return "redirect:/usuarios";
		}

}
