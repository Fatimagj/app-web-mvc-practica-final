package com.keepcoding.app.web.service;

import java.util.List;

import com.keepcoding.app.web.entity.Usuario;


public interface UsuarioService {
	
	//Método para que devuelva una lista de usuarios
	List<Usuario> listarusuario(String dato);

	//Método para guardar un nuevo usuario
	public Usuario save(Usuario usuario);

	//Método para que se puedan logar los usuarios
	public Usuario autenticar(String username, String password);
	


}
