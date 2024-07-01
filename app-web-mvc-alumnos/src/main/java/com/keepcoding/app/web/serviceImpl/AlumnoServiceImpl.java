package com.keepcoding.app.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.app.web.entity.Alumno;
import com.keepcoding.app.web.repository.AlumnoRepository;
import com.keepcoding.app.web.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> listarAlumno() {
		return alumnoRepository.findAll();
	}
}
