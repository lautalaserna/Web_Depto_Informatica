package com.example.informatica.internas.docentes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="docentes")
public class Docentes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_docente;
	private String nombre_completo;
	private String dni;
	private String email;
	private String titulo;
	private String img_url;
	private String url;
	
	//constructor vacio
	public Docentes() {
	}

	public Docentes(int id_docente, String nombre_completo, String dni, String email, String titulo, String img_url,
			String url) {
		super();
		this.id_docente = id_docente;
		this.nombre_completo = nombre_completo;
		this.dni = dni;
		this.email = email;
		this.titulo = titulo;
		this.img_url = img_url;
		this.url = url;
	}

	public Docentes(String nombre_completo, String dni, String email, String titulo, String img_url, String url) {
		super();
		this.nombre_completo = nombre_completo;
		this.dni = dni;
		this.email = email;
		this.titulo = titulo;
		this.img_url = img_url;
		this.url = url;
	}

	public int getId_docente() {
		return id_docente;
	}

	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
