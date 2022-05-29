package com.example.informatica.carrera.trabajos_finales;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="trabajos_finales")
public class TrabajoFinal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_trabajo_final;
	private String titulo;
	private String estudiantes;
	private String demandante;
	private String directores;
	private char is_concluido;
	private String url;
	
	//constructor vacio
	public TrabajoFinal() {
	}

	public TrabajoFinal(int id_trabajo_final, String titulo, String estudiantes, String demandante, String directores,
			char is_concluido, String url) {
		super();
		this.id_trabajo_final = id_trabajo_final;
		this.titulo = titulo;
		this.estudiantes = estudiantes;
		this.demandante = demandante;
		this.directores = directores;
		this.is_concluido = is_concluido;
		this.url = url;
	}

	public TrabajoFinal(String titulo, String estudiantes, String demandante, String directores, char is_concluido,
			String url) {
		super();
		this.titulo = titulo;
		this.estudiantes = estudiantes;
		this.demandante = demandante;
		this.directores = directores;
		this.is_concluido = is_concluido;
		this.url = url;
	}

	public int getId_trabajo_final() {
		return id_trabajo_final;
	}

	public void setId_trabajo_final(int id_trabajo_final) {
		this.id_trabajo_final = id_trabajo_final;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(String estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getDemandante() {
		return demandante;
	}

	public void setDemandante(String demandante) {
		this.demandante = demandante;
	}

	public String getDirectores() {
		return directores;
	}

	public void setDirectores(String directores) {
		this.directores = directores;
	}

	public char getIs_concluido() {
		return is_concluido;
	}

	public void setIs_concluido(char is_concluido) {
		this.is_concluido = is_concluido;
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
