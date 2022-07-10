package com.example.informatica.internas.areas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="areas")
public class Areas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_area;
	private String titulo;
	private String url;
	
	//constructor vacio
	public Areas() {
	}

	public Areas(int id_area, String titulo, String url) {
		super();
		this.id_area = id_area;
		this.titulo = titulo;
		this.url = url;
	}

	public Areas(String titulo, String url) {
		super();
		this.titulo = titulo;
		this.url = url;
	}

	public int getId_area() {
		return id_area;
	}

	public void setId_area(int id_area) {
		this.id_area = id_area;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
