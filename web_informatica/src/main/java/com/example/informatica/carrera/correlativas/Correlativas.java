package com.example.informatica.carrera.correlativas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="vista_correlativas")
public class Correlativas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_docente;
	private String id_asignatura;
	private String asignatura; //correlativa de la asignatura a la que corresponde el id_asignatura
	
	//constructor vacio
	public Correlativas() {
	}
	
	
	
}
