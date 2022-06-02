package com.example.informatica.carrera.trabajos_finales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class TrabajoFinalController {
	
	private TrabajoFInalService trabajoFinalService;
	
	@Autowired
	public TrabajoFinalController(TrabajoFInalService trabajoFinalService) {
		this.trabajoFinalService = trabajoFinalService;
	}
	
	@GetMapping(path = "/trabajosfinales")
	public List<TrabajoFinal> getTrabajosFinales() {
		return trabajoFinalService.getTrabajosFinales();
	}
}