package com.example.informatica.carrera.optativas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="vista_docentes")
public class Optativas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_optativa;
	private String asignatura;
	private String codigo;
	//private List<Correlativa> correlativas;
	private String cuatrimestre;
	
	//constructor vacio
	public Optativas() {
	}
	
	
	
}
