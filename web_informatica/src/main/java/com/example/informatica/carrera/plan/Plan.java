package com.example.informatica.carrera.plan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="vista_plan_estudio")
public class Plan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_plan_estudio;
	private int anio;
	private int cuatrimestre;
	private String asignatura;
	private String codigo;
	private int creditos_grado;
	private String correlativas;
	
	public Plan(int id_plan_estudio, int anio, int cuatrimestre, String asignatura, String codigo, int creditos_grado,
			String correlativas) {
		super();
		this.id_plan_estudio = id_plan_estudio;
		this.anio = anio;
		this.cuatrimestre = cuatrimestre;
		this.asignatura = asignatura;
		this.codigo = codigo;
		this.creditos_grado = creditos_grado;
		this.correlativas = correlativas;
	}

	public Plan(int anio, int cuatrimestre, String asignatura, String codigo, int creditos_grado, String correlativas) {
		super();
		this.anio = anio;
		this.cuatrimestre = cuatrimestre;
		this.asignatura = asignatura;
		this.codigo = codigo;
		this.creditos_grado = creditos_grado;
		this.correlativas = correlativas;
	}

	public Plan() {
		super();
	}

	public int getId_plan_estudio() {
		return id_plan_estudio;
	}

	public void setId_plan_estudio(int id_plan_estudio) {
		this.id_plan_estudio = id_plan_estudio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCreditos_grado() {
		return creditos_grado;
	}

	public void setCreditos_grado(int creditos_grado) {
		this.creditos_grado = creditos_grado;
	}

	public String getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(String correlativas) {
		this.correlativas = correlativas;
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
}
