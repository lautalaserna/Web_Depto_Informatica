package com.example.informatica.institucional.autoridades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="consejo_departamental")
public class Consejo_Departamental {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_consejo_departamental;
	private String nombre;
	private String tipo;
	private String url;
	
	//constructor vacio
	public Consejo_Departamental() {
	}

	//constructor completo
	public Consejo_Departamental(int id_consejo_departamental, String nombre, String tipo, String url) {
		super();
		this.id_consejo_departamental = id_consejo_departamental;
		this.nombre = nombre;
		this.tipo = tipo;
		this.url = url;
	}

	//constructor sin id
	public Consejo_Departamental(String nombre, String tipo, String url) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.url = url;
	}

	public int getId_consejo_departamental() {
		return id_consejo_departamental;
	}

	public void setId_consejo_departamental(int id_consejo_departamental) {
		this.id_consejo_departamental = id_consejo_departamental;
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
