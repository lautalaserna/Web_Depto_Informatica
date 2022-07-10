package com.example.informatica.internas.cargos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="cargos")
public class Cargos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_cargo;
	private int id_asignatura;
	private int id_tipo_cargo;
	private int id_dedicacion;
	private int id_docente;
	private char clasificacion;
	
	//constructor vacio
	public Cargos() {
	}

	public Cargos(int id_cargo, int id_asignatura, int id_tipo_cargo, int id_dedicacion, int id_docente,
			char clasificacion) {
		super();
		this.id_cargo = id_cargo;
		this.id_asignatura = id_asignatura;
		this.id_tipo_cargo = id_tipo_cargo;
		this.id_dedicacion = id_dedicacion;
		this.id_docente = id_docente;
		this.clasificacion = clasificacion;
	}

	public Cargos(int id_asignatura, int id_tipo_cargo, int id_dedicacion, int id_docente, char clasificacion) {
		super();
		this.id_asignatura = id_asignatura;
		this.id_tipo_cargo = id_tipo_cargo;
		this.id_dedicacion = id_dedicacion;
		this.id_docente = id_docente;
		this.clasificacion = clasificacion;
	}

	public int getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(int id_cargo) {
		this.id_cargo = id_cargo;
	}

	public int getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public int getId_tipo_cargo() {
		return id_tipo_cargo;
	}

	public void setId_tipo_cargo(int id_tipo_cargo) {
		this.id_tipo_cargo = id_tipo_cargo;
	}

	public int getId_dedicacion() {
		return id_dedicacion;
	}

	public void setId_dedicacion(int id_dedicacion) {
		this.id_dedicacion = id_dedicacion;
	}

	public int getId_docente() {
		return id_docente;
	}

	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}

	public char getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(char clasificacion) {
		this.clasificacion = clasificacion;
	}

	
	
	
	
}
