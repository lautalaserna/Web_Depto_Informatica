package com.example.informatica.institucional.autoridades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="autoridades")
public class Autoridad {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_autoridad;
	private String director;
	private String vicedirector;
	private String url;
	
	//constructor vacio
	public Autoridad() {
	}

	//constructor completo
	public Autoridad(int id_autoridad, String director, String vicedirector, String url) {
		super();
		this.id_autoridad = id_autoridad;
		this.director = director;
		this.vicedirector = vicedirector;
		this.url = url;
	}

	//constructor sin id
	public Autoridad(String director, String vicedirector, String url) {
		super();
		this.director = director;
		this.vicedirector = vicedirector;
		this.url = url;
	}

	public int getId_autoridad() {
		return id_autoridad;
	}

	public void setId_autoridad(int id_autoridad) {
		this.id_autoridad = id_autoridad;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getVicedirector() {
		return vicedirector;
	}

	public void setVicedirector(String vicedirector) {
		this.vicedirector = vicedirector;
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
