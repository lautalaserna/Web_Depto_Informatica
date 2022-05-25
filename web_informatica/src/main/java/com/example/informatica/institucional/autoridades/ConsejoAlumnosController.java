package com.example.informatica.institucional.autoridades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class ConsejoAlumnosController {
	
	private ConsejoAlumnosService consejoAlumnosService;
	
	@Autowired
	public ConsejoAlumnosController(ConsejoAlumnosService consejoAlumnosService) {
		this.consejoAlumnosService = consejoAlumnosService;
	}
	
	@GetMapping(path = "/consejo_alumnos")
	public List<Consejo_Alumnos> getConsejoAlumnos() {
		return consejoAlumnosService.getConsejoAlumnos();
	}
}