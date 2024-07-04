package com.keepcoding.app.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.app.web.entity.Usuario;
import com.keepcoding.app.web.repository.UsuarioRepository;
import com.keepcoding.app.web.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Override
	public List<Usuario> listarusuario(String dato) {
		
		return usuarioRepository.findAll();
	}
	
	@Override
	public Usuario autenticar(String username, String password) {
		List<Usuario> usuarios= usuarioRepository.findByUsernameAndPassword(username, password);
		if (usuarios.isEmpty()) {
			return null;
		} else {
			return usuarios.get(0);	
		}
	}
		
	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}


}				

	




