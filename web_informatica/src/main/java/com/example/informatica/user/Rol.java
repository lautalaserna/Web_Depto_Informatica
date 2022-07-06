package com.example.informatica.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;
	private int id_usuario;
    private String rol;
	public Rol(int id_rol, int id_usuario, String rol) {
		super();
		this.id_rol = id_rol;
		this.id_usuario = id_usuario;
		this.rol = rol;
	}
	
	public Rol(int id_usuario, String rol) {
		super();
		this.id_usuario = id_usuario;
		this.rol = rol;
	}
	
	public Rol() {
		super();
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
}















