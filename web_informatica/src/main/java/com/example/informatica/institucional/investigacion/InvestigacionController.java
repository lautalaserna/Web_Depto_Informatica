package com.example.informatica.institucional.investigacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class InvestigacionController {
	
	private InvestigacionService investigacionService;
	
	@Autowired
	public InvestigacionController(InvestigacionService investigacionService) {
		this.investigacionService = investigacionService;
	}
	
	@GetMapping(path = "/investigacion")
	public List<Investigacion> getInvestigacion() {
		return investigacionService.getInvestigacion();
	}
}