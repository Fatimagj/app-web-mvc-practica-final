package com.keepcoding.app.web.service;

import java.util.List;


import com.keepcoding.app.web.entity.Usuario;


public interface UsuarioService {
	
	//Método para que el login tenga que filtrar por email y contraseña
	List<Usuario> findByEmailAndPassword(String email, String password);

	//Método para guardar un nuevo usuario
	public Usuario save(Usuario usuario);

	

	
	
	//Método para devolver una lista de empleado
	//public List<Usuario> listarUsuario();

	//Usuario procesarLogin(String datoBuscado, String datoBuscado2);

	
}
