package com.example.informatica.internas.tipocarrera;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tipo_carrera")
public class TipoCarrera {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_tipo_carrera;
	private String nombre;
	private String url;
	
	//constructor vacio
	public TipoCarrera() {
	}

	public TipoCarrera(int id_tipo_carrera, String nombre, String url) {
		super();
		this.id_tipo_carrera = id_tipo_carrera;
		this.nombre = nombre;
		this.url = url;
	}

	public TipoCarrera(String nombre, String url) {
		super();
		this.nombre = nombre;
		this.url = url;
	}

	public int getId_tipo_carrera() {
		return id_tipo_carrera;
	}

	public void setId_tipo_carrera(int id_tipo_carrera) {
		this.id_tipo_carrera = id_tipo_carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
