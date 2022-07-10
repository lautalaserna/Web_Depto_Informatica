package com.example.informatica.internas.dedicacion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="dedicacion")
public class Dedicacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_dedicacion;
	private String nombre;
	
	//constructor vacio
	public Dedicacion() {
	}

	public Dedicacion(int id_dedicacion, String nombre) {
		super();
		this.id_dedicacion = id_dedicacion;
		this.nombre = nombre;
	}

	public Dedicacion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId_dedicacion() {
		return id_dedicacion;
	}

	public void setId_dedicacion(int id_dedicacion) {
		this.id_dedicacion = id_dedicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
