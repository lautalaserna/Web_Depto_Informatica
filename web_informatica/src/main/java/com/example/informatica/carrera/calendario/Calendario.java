package com.example.informatica.carrera.calendario;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="calendario_academico")
public class Calendario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_calendario_academico;
	//@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "fechaInicio")
	private Date fecha_inicio;
	//@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "fechaFin")
	private Date fecha_fin;
	private String concepto;
	private String url;
	
	//constructor vacio
	public Calendario() {
	}

	public Calendario(int id_calendario_academico, Date fecha_inicio, Date fecha_fin, String concepto, String url) {
		super();
		this.id_calendario_academico = id_calendario_academico;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.concepto = concepto;
		this.url = url;
	}

	public Calendario(Date fecha_inicio, Date fecha_fin, String concepto, String url) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.concepto = concepto;
		this.url = url;
	}

	public int getId_calendario_academico() {
		return id_calendario_academico;
	}

	public void setId_calendario_academico(int id_calendario_academico) {
		this.id_calendario_academico = id_calendario_academico;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
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

	
	
}
