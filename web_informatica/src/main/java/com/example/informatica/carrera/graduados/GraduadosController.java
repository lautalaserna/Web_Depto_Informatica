package com.example.informatica.carrera.graduados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class GraduadosController {
	
	private GraduadosService graduadosService;
	
	@Autowired
	public GraduadosController(GraduadosService graduadosService) {
		this.graduadosService = graduadosService;
	}
	
	@GetMapping(path = "/graduados")
	public List<Graduados> getGraduados() {
		return graduadosService.getGraduados();
	}
}