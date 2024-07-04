package com.keepcoding.app.web.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column (nullable = false, length = 100)
		private String nombre;
		@Column (nullable = false, length = 100)
		private String email;
		@Column (nullable = false, length = 100)
		private String username;
		@Column (nullable = false, length = 100)
		private String password;
		private boolean activo;
		
		public Usuario() {
			this.activo = true; //con esto el usuario es activo por defecto
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isActivo() {
			return activo;
		}

		public void setActivo(boolean activo) {
			this.activo = activo;
		}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
