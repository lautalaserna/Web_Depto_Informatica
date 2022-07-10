package com.example.informatica.internas.carreras;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="carreras")
public class Carreras {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_carrera;
	private String titulo;
	private int id_tipo_carrera;
	private String url;
	
	//constructor vacio
	public Carreras() {
	}

	public Carreras(int id_carrera, String titulo, int id_tipo_carrera, String url) {
		super();
		this.id_carrera = id_carrera;
		this.titulo = titulo;
		this.id_tipo_carrera = id_tipo_carrera;
		this.url = url;
	}

	public Carreras(String titulo, int id_tipo_carrera, String url) {
		super();
		this.titulo = titulo;
		this.id_tipo_carrera = id_tipo_carrera;
		this.url = url;
	}

	public int getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId_tipo_carrera() {
		return id_tipo_carrera;
	}

	public void setId_tipo_carrera(int id_tipo_carrera) {
		this.id_tipo_carrera = id_tipo_carrera;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	
	
}
