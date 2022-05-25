package com.example.informatica.institucional.elecciones;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="elecciones")
public class Eleccion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_eleccion;
	private String postulante;
	private String dni;
	private int votos;
	private String url;
	
	//constructor vacio
	public Eleccion() {
	}

	//constructor completo
	public Eleccion(int id_eleccion, String postulante, String dni, int votos, String url) {
		this.id_eleccion = id_eleccion;
		this.postulante = postulante;
		this.dni = dni;
		this.votos = votos;
		this.url = url;
	}

	//constructor SIN id
	public Eleccion(String postulante, String dni, int votos, String url) {
		this.postulante = postulante;
		this.dni = dni;
		this.votos = votos;
		this.url = url;
	}

	public int getId_eleccion() {
		return id_eleccion;
	}

	public void setId_eleccion(int id_eleccion) {
		this.id_eleccion = id_eleccion;
	}

	public String getPostulante() {
		return postulante;
	}

	public void setPostulante(String postulante) {
		this.postulante = postulante;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
