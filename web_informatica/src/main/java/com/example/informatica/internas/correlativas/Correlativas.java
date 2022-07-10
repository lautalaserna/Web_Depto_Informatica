package com.example.informatica.internas.correlativas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="correlativas")
public class Correlativas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_correlativa;
	private int id_asignatura_principal;
	private int id_asignatura_correlativa;
	private String url;
	
	//constructor vacio
	public Correlativas() {
	}

	public Correlativas(int id_correlativa, int id_asignatura_principal, int id_asignatura_correlativa, String url) {
		super();
		this.id_correlativa = id_correlativa;
		this.id_asignatura_principal = id_asignatura_principal;
		this.id_asignatura_correlativa = id_asignatura_correlativa;
		this.url = url;
	}

	public Correlativas(int id_asignatura_principal, int id_asignatura_correlativa, String url) {
		super();
		this.id_asignatura_principal = id_asignatura_principal;
		this.id_asignatura_correlativa = id_asignatura_correlativa;
		this.url = url;
	}

	public int getId_correlativa() {
		return id_correlativa;
	}

	public void setId_correlativa(int id_correlativa) {
		this.id_correlativa = id_correlativa;
	}

	public int getId_asignatura_principal() {
		return id_asignatura_principal;
	}

	public void setId_asignatura_principal(int id_asignatura_principal) {
		this.id_asignatura_principal = id_asignatura_principal;
	}

	public int getId_asignatura_correlativa() {
		return id_asignatura_correlativa;
	}

	public void setId_asignatura_correlativa(int id_asignatura_correlativa) {
		this.id_asignatura_correlativa = id_asignatura_correlativa;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

	
	
	
}
