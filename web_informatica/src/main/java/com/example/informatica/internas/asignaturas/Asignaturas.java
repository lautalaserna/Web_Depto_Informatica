package com.example.informatica.internas.asignaturas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="asignaturas")
public class Asignaturas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_asignatura;
	private String codigo;
	private String titulo;
	private int id_area;
	private int creditos_grado;
	private String url;
	
	//constructor vacio
	public Asignaturas() {
	}

	public Asignaturas(int id_asignatura, String codigo, String titulo, int id_area, int creditos_grado, String url) {
		super();
		this.id_asignatura = id_asignatura;
		this.codigo = codigo;
		this.titulo = titulo;
		this.id_area = id_area;
		this.creditos_grado = creditos_grado;
		this.url = url;
	}

	public Asignaturas(String codigo, String titulo, int id_area, int creditos_grado, String url) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.id_area = id_area;
		this.creditos_grado = creditos_grado;
		this.url = url;
	}

	public int getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId_area() {
		return id_area;
	}

	public void setId_area(int id_area) {
		this.id_area = id_area;
	}

	public int getCreditos_grado() {
		return creditos_grado;
	}

	public void setCreditos_grado(int creaditos_grado) {
		this.creditos_grado = creaditos_grado;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

	
	
	
}
