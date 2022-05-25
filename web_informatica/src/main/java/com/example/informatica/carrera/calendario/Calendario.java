package com.example.informatica.carrera.calendario;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calendario_academico")
public class Calendario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_calendario_academico;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private String concepto;
	private String url;
	
	//constructor vacio
	public Calendario() {
	}

	//constructor completo
	public Calendario(int id_calendario_academico, LocalDateTime fechaInicio, LocalDateTime fechaFin, String concepto,
			String url) {
		super();
		this.id_calendario_academico = id_calendario_academico;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.concepto = concepto;
		this.url = url;
	}

	//constructor SIN id
	public Calendario(LocalDateTime fechaInicio, LocalDateTime fechaFin, String concepto, String url) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.concepto = concepto;
		this.url = url;
	}

	public int getId_calendario_academico() {
		return id_calendario_academico;
	}

	public void setId_calendario_academico(int id_calendario_academico) {
		this.id_calendario_academico = id_calendario_academico;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
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
