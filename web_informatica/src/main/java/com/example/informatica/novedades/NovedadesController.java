package com.example.informatica.novedades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class NovedadesController {
	
	private NovedadesService novedadesService;
	
	@Autowired
	public NovedadesController(NovedadesService novedadesService) {
		this.novedadesService = novedadesService;
	}
	
	@GetMapping(path = "/noticias")
	public List<Novedades> getNoticias() {
		return novedadesService.getNoticias();
	}
	
	@GetMapping(path = "/bolsa_trabajo")
	public List<Novedades> getTrabajos() {
		return novedadesService.getTrabajos();
	}
	
}