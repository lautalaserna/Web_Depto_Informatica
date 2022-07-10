package com.example.informatica.carrera.optativas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class VOptativasController {
	
	private VOptativasService optativasService;
	
	@Autowired
	public VOptativasController(VOptativasService optativasService) {
		this.optativasService = optativasService;
	}
	
	@GetMapping(path = "/optativas")
	public List<VOptativas> getDocentes() {
		return optativasService.getOptativas();
	}
}