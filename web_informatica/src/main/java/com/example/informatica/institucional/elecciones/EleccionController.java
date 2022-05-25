package com.example.informatica.institucional.elecciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class EleccionController {
	
	private EleccionService eleccionService;
	
	@Autowired
	public EleccionController(EleccionService eleccionService) {
		this.eleccionService = eleccionService;
	}
	
	@GetMapping(path = "/elecciones")
	public List<Eleccion> getElecciones() {
		return eleccionService.getElecciones();
	}
}