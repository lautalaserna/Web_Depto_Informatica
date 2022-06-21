package com.example.informatica.carrera.pps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class PPSController {
	
	private PPSService ppsService;
	
	@Autowired
	public PPSController(PPSService ppsService) {
		this.ppsService = ppsService;
	}
	
	@GetMapping(path = "/pps_disponibles")
	public List<PPS> getPPSDisponibles() {
		return ppsService.getPPSDisponibles();
	}
	
	@GetMapping(path = "/pps_curso")
	public List<PPS> getPPSCurso() {
		return ppsService.getPPSCurso();
	}
	
	@GetMapping(path = "/pps_finalizadas")
	public List<PPS> getPPSFinalizadas() {
		return ppsService.getPPSFinalizadas();
	}
}