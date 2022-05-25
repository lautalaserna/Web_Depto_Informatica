package com.example.informatica.carrera.calendario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class CalendarioController {
	
	private CalendarioService calendarioService;
	
	@Autowired
	public CalendarioController(CalendarioService calendarioService) {
		this.calendarioService = calendarioService;
	}
	
	@GetMapping(path = "/calendario")
	public List<Calendario> getCalendario() {
		return calendarioService.getCalendario();
	}
}