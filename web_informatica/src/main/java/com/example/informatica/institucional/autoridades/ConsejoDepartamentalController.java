package com.example.informatica.institucional.autoridades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class ConsejoDepartamentalController {
	
	private ConsejoDepartamentalService consejoDepartamentalService;
	
	@Autowired
	public ConsejoDepartamentalController(ConsejoDepartamentalService consejoDepartamentalService) {
		this.consejoDepartamentalService = consejoDepartamentalService;
	}
	
	@GetMapping(path = "/consejo_departamental")
	public List<Consejo_Departamental> getConsejoDepartamental() {
		return consejoDepartamentalService.getConsejoDepartamental();
	}
}