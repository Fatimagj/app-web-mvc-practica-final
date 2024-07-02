package com.keepcoding.app.web.service;

import java.util.List;

import com.keepcoding.app.web.entity.Alumno;

public interface AlumnoService {
	
	//Método que devuelve una lista de empleados
	public List<Alumno> listarAlumno();
	
	//método para guardar nuevo alumno
	public Alumno guardarAlumno(Alumno alumno);
	
	//método para obtener empleado por id
	public Alumno obtenerAlumno(Long id);
	
	//método para actualizar o modificar un alumno
	public Alumno actualizarAlumno(Alumno alumno);
	
	//para eliminar un alumno
	public void eliminarAlumno(Long id);
}
