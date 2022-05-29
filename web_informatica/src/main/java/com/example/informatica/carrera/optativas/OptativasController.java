package com.example.informatica.carrera.optativas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class OptativasController {
	
	private OptativasService optativasService;
	
	@Autowired
	public OptativasController(OptativasService optativasService) {
		this.optativasService = optativasService;
	}
	
	@GetMapping(path = "/optativas")
	public List<Optativas> getDocentes() {
		return optativasService.getOptativas();
	}
}