package com.example.informatica.institucional.autoridades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class AutoridadController {
	
	private AutoridadService autoridadesService;
	
	@Autowired
	public AutoridadController(AutoridadService autoridadesService) {
		this.autoridadesService = autoridadesService;
	}
	
	@GetMapping(path = "/autoridades")
	public List<Autoridad> getAutoridades() {
		return autoridadesService.getAutoridades();
	}
}