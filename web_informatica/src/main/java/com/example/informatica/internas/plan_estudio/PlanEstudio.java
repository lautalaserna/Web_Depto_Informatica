package com.example.informatica.internas.plan_estudio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="plan_estudio")
public class PlanEstudio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_plan_estudio;
	private int id_carrera;
	private int id_asignatura;
	private int anio;
	private char cuatrimestre;
	private String url;
	
	//constructor vacio
	public PlanEstudio() {
	}

	public PlanEstudio(int id_plan_estudio, int id_carrera, int id_asignatura, int anio, char cuatrimestre,
			String url) {
		super();
		this.id_plan_estudio = id_plan_estudio;
		this.id_carrera = id_carrera;
		this.id_asignatura = id_asignatura;
		this.anio = anio;
		this.cuatrimestre = cuatrimestre;
		this.url = url;
	}

	public PlanEstudio(int id_carrera, int id_asignatura, int anio, char cuatrimestre, String url) {
		super();
		this.id_carrera = id_carrera;
		this.id_asignatura = id_asignatura;
		this.anio = anio;
		this.cuatrimestre = cuatrimestre;
		this.url = url;
	}

	public int getId_plan_estudio() {
		return id_plan_estudio;
	}

	public void setId_plan_estudio(int id_plan_estudio) {
		this.id_plan_estudio = id_plan_estudio;
	}

	public int getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	public int getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
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
