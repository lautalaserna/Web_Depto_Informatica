package com.example.informatica.carrera.optativas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="vista_optativas")
public class Optativas {
	private String asignatura;
	private String codigo;
	private String creditos_grado;
	private String cuatrimestre;
	private String correlativas;
	
	//constructor vacio
	public Optativas() {
	}

	public Optativas(String asignatura, String codigo, String creditos_grado, String cuatrimestre,
			String correlativas) {
		super();
		this.asignatura = asignatura;
		this.codigo = codigo;
		this.creditos_grado = creditos_grado;
		this.cuatrimestre = cuatrimestre;
		this.correlativas = correlativas;
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

	public String getCreditos_grado() {
		return creditos_grado;
	}

	public void setCreditos_grado(String creditos_grado) {
		this.creditos_grado = creditos_grado;
	}

	public String getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(String cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
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
