package com.example.informatica.institucional.autoridades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="consejo_alumnos")
public class Consejo_Alumnos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_consejo_alumnos;
	private String nombre;
	private String tipo;
	private String url;
	
	//constructor vacio
	public Consejo_Alumnos() {
	}

	//constructor completo
	public Consejo_Alumnos(int id_consejo_alumnos, String nombre, String tipo, String url) {
		this.id_consejo_alumnos = id_consejo_alumnos;
		this.nombre = nombre;
		this.tipo = tipo;
		this.url = url;
	}

	//constructor sin id
	public Consejo_Alumnos(String nombre, String tipo, String url) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.url = url;
	}

	public int getId_consejo_alumnos() {
		return id_consejo_alumnos;
	}

	public void setId_consejo_alumnos(int id_consejo_alumnos) {
		this.id_consejo_alumnos = id_consejo_alumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
