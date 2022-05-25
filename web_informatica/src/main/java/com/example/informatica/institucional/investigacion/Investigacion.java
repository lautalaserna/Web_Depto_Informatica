package com.example.informatica.institucional.investigacion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="investigacion")
public class Investigacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_investigacion;
	private String titulo;
	private String integrantes;
	private String objetivo;
	private String url;
	
	//constructor vacio
	public Investigacion() {
	}
	
	//constructor completo
	public Investigacion(int id_investigacion, String titulo, String integrantes, String objetivo, String url) {
		this.id_investigacion = id_investigacion;
		this.titulo = titulo;
		this.integrantes = integrantes;
		this.objetivo = objetivo;
		this.url = url;
	}
	
	//constructor SIN id
	public Investigacion(String titulo, String integrantes, String objetivo, String url) {
		this.titulo = titulo;
		this.integrantes = integrantes;
		this.objetivo = objetivo;
		this.url = url;
	}

	public int getId_investigacion() {
		return id_investigacion;
	}

	public void setId_investigacion(int id_investigacion) {
		this.id_investigacion = id_investigacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
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
