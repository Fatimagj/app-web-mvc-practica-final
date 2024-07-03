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
	
	//@Override
	//public List<Usuario> listaUsuario(String datoBuscado, String datoBuscado2) {
		//if(datoBuscado != null && datoBuscado2 !=null) {
			//return usuarioRepository.filterEmailAndPassword(datoBuscado, datoBuscado2);
		//}else
		//return (List<Usuario>) usuarioController;
	//}
	//@Override
	//public List<Usuario> procesarLogin (String email, String password) {
		//return usuarioRepository.findByEmailAndPassword(email, password);
	
	//}
	//@Override
	//public Usuario guardarUsuario(Usuario usuario) {
		//return usuarioRepository.save(usuario);
		
	//}
	@Override
	public List<Usuario> findByEmailAndPassword(String email, String password) {
		if(email != null && password !=null) {
		return usuarioRepository.findByEmailAndPassword(email, password);
		}else
		return null;
	}
		
	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
				

	




