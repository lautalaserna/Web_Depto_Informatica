package com.example.informatica.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsuarioDTO {
    private int id_usuario;
    private String username;
    private String password;
    List<SingleRol> roles = new ArrayList<SingleRol>();
	
	public UsuarioDTO(Usuario usuario) {
		super();
		this.id_usuario = usuario.getId_usuario();
		this.username = usuario.getUsername();
		this.password = usuario.getPassword();
		this.roles.add(new SingleRol("admin", false));
		this.roles.add(new SingleRol("pps", false));
		this.roles.add(new SingleRol("elecciones", false));
		this.roles.add(new SingleRol("trabajosfinales", false));
		this.roles.add(new SingleRol("graduados", false));
		this.roles.add(new SingleRol("investigacion", false));
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
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

	public List<SingleRol> getRoles() {
		return roles;
	}

	public void setRoles(List<SingleRol> roles) {
		this.roles = roles;
	}

	


}
