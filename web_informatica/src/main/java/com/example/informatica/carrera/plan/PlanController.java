package com.example.informatica.carrera.plan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class PlanController {
	
	private PlanService planService;
	
	@Autowired
	public PlanController(PlanService planService) {
		this.planService = planService;
	}
	
	@GetMapping(path = "/plan_estudio")
	public List<Plan> getPlan() {
		System.out.println("Controller llamando a service getPlan");
		return planService.getPlan();
	}
}