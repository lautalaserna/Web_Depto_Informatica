package com.example.informatica.carrera.graduados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="graduados")
public class Graduados {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_graduado;
	private String nombre_completo;
	private String url;
	
	//constructor vacio
	public Graduados() {
	}

	public Graduados(int id_graduado, String nombre_completo, String url) {
		super();
		this.id_graduado = id_graduado;
		this.nombre_completo = nombre_completo;
		this.url = url;
	}

	public Graduados(String nombre_completo, String url) {
		super();
		this.nombre_completo = nombre_completo;
		this.url = url;
	}

	public int getId_graduado() {
		return id_graduado;
	}

	public void setId_graduado(int id_graduado) {
		this.id_graduado = id_graduado;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
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
