package com.keepcoding.app.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.keepcoding.app.web.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	//Usuario findeById(Long id);	
	
	
	//@Query("SELECT u FROM Usuario u WHERE CONCAT(u.email,u.password) LIKE %?1%")
	//@Query("SELECT u FROM Usuario u WHERE u.email = :email AND u.password = :password")
	@Query("select u from Usuario u where u.email = ?1 and u.password = ?2")
	public List<Usuario> findByEmailAndPassword(String  email, String password);
	
}
