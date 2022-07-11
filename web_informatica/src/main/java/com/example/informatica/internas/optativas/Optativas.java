package com.example.informatica.internas.optativas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="optativas")
public class Optativas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_optativa;
	private int id_asignatura;
	private char cuatrimestre;
	private String url;
	
	//constructor vacio
	public Optativas() {
	}

	public Optativas(int id_optativa, int id_asignatura, char cuatrimestre, String url) {
		super();
		this.id_optativa = id_optativa;
		this.id_asignatura = id_asignatura;
		this.cuatrimestre = cuatrimestre;
		this.url = url;
	}

	public Optativas(int id_asignatura, char cuatrimestre, String url) {
		super();
		this.id_asignatura = id_asignatura;
		this.cuatrimestre = cuatrimestre;
		this.url = url;
	}

	public int getId_optativa() {
		return id_optativa;
	}

	public void setId_optativa(int id_optativa) {
		this.id_optativa = id_optativa;
	}

	public int getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public char getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(char cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
