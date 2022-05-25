package com.example.informatica.institucional.docente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class DocenteController {
	
	private DocenteService docenteService;
	
	@Autowired
	public DocenteController(DocenteService docenteService) {
		this.docenteService = docenteService;
	}
	
	@GetMapping(path = "/docentes")
	public List<Docente> getDocentes() {
		return docenteService.getDocentes();
	}
}