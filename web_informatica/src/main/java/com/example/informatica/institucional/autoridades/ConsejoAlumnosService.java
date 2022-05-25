package com.example.informatica.institucional.autoridades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsejoAlumnosService {

	private IConsejoAlumnosRepository consejoAlumnosRepository;
	
	@Autowired
	public ConsejoAlumnosService(IConsejoAlumnosRepository consejoAlumnosRepository) {
		this.consejoAlumnosRepository = consejoAlumnosRepository;
	}
	
	public List<Consejo_Alumnos> getConsejoAlumnos() {
		return consejoAlumnosRepository.findAll();
	}
}
