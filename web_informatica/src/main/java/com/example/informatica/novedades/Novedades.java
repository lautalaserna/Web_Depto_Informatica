package com.example.informatica.novedades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="novedades")
public class Novedades {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_novedad;
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "fecha")
	private Date fecha;
	private String imgurl;
	private String titulo;
	private String info;
	private String contenido;
	private String url;
	private char is_bolsa_trabajo;
	
	//constructor vacio
	public Novedades() {
	}

	public Novedades(int id_novedad, Date fecha, String imgurl, String titulo, String info, String contenido,
			String url, char is_bolsa_trabajo) {
		super();
		this.id_novedad = id_novedad;
		this.fecha = fecha;
		this.imgurl = imgurl;
		this.titulo = titulo;
		this.info = info;
		this.contenido = contenido;
		this.url = url;
		this.is_bolsa_trabajo = is_bolsa_trabajo;
	}

	public Novedades(Date fecha, String imgurl, String titulo, String info, String contenido, String url,
			char is_bolsa_trabajo) {
		super();
		this.fecha = fecha;
		this.imgurl = imgurl;
		this.titulo = titulo;
		this.info = info;
		this.contenido = contenido;
		this.url = url;
		this.is_bolsa_trabajo = is_bolsa_trabajo;
	}
	
	
	public int getId_novedad() {
		return id_novedad;
	}

	public void setId_novedad(int id_novedad) {
		this.id_novedad = id_novedad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public char getIs_bolsa_trabajo() {
		return is_bolsa_trabajo;
	}

	public void setIs_bolsa_trabajo(char is_bolsa_trabajo) {
		this.is_bolsa_trabajo = is_bolsa_trabajo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
	
	
}
