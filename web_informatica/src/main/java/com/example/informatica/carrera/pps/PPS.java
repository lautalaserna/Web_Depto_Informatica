package com.example.informatica.carrera.pps;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="pps")
public class PPS {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_pps;
	private String entidad;
	private String objetivo;
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "fecha_fin")
	private Date fecha_fin;
	private float presupuesto;
	private char is_contratacion;
	private char estado;
	private String url;
	private String estudiantes;
	private String tutores;
	private String lugar;
	private char is_pdts;
	private char is_pps;
	private char is_psc;
	
	//constructor vacio
	public PPS() {
	}

	public PPS(int id_pps, String entidad, String objetivo, Date fecha_inicio, Date fecha_fin, float presupuesto,
			char is_contratacion, char estado, String url, String estudiantes, String tutores, String lugar,
			char is_pdts, char is_pps, char is_psc) {
		super();
		this.id_pps = id_pps;
		this.entidad = entidad;
		this.objetivo = objetivo;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.presupuesto = presupuesto;
		this.is_contratacion = is_contratacion;
		this.estado = estado;
		this.url = url;
		this.estudiantes = estudiantes;
		this.tutores = tutores;
		this.lugar = lugar;
		this.is_pdts = is_pdts;
		this.is_pps = is_pps;
		this.is_psc = is_psc;
	}


	

	public PPS(String entidad, String objetivo, Date fecha_inicio, Date fecha_fin, float presupuesto,
			char is_contratacion, char estado, String url, String estudiantes, String tutores, String lugar,
			char is_pdts, char is_pps, char is_psc) {
		super();
		this.entidad = entidad;
		this.objetivo = objetivo;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.presupuesto = presupuesto;
		this.is_contratacion = is_contratacion;
		this.estado = estado;
		this.url = url;
		this.estudiantes = estudiantes;
		this.tutores = tutores;
		this.lugar = lugar;
		this.is_pdts = is_pdts;
		this.is_pps = is_pps;
		this.is_psc = is_psc;
	}



	public int getId_pps() {
		return id_pps;
	}

	public void setId_pps(int id_pps) {
		this.id_pps = id_pps;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}


	public float getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}

	public char getIs_contratacion() {
		return is_contratacion;
	}

	public void setIs_contratacion(char is_contratacion) {
		this.is_contratacion = is_contratacion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(String estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getTutores() {
		return tutores;
	}

	public void setTutores(String tutores) {
		this.tutores = tutores;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public char getIs_pdts() {
		return is_pdts;
	}

	public void setIs_pdts(char is_pdts) {
		this.is_pdts = is_pdts;
	}

	public char getIs_pps() {
		return is_pps;
	}

	public void setIs_pps(char is_pps) {
		this.is_pps = is_pps;
	}

	public char getIs_psc() {
		return is_psc;
	}

	public void setIs_psc(char is_psc) {
		this.is_psc = is_psc;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
	
	
}
