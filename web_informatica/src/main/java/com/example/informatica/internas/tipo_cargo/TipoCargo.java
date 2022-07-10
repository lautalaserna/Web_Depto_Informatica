package com.example.informatica.internas.tipo_cargo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tipo_cargo")
public class TipoCargo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_tipo_cargo;
	private String nombre;
	
	//constructor vacio
	public TipoCargo() {
	}

	public TipoCargo(int id_tipo_cargo, String nombre) {
		super();
		this.id_tipo_cargo = id_tipo_cargo;
		this.nombre = nombre;
	}

	public TipoCargo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId_tipo_cargo() {
		return id_tipo_cargo;
	}

	public void setId_tipo_cargo(int id_tipo_cargo) {
		this.id_tipo_cargo = id_tipo_cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
