package com.example.informatica.carrera.plan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {

	private IPlanRepository planRepository;
	
	@Autowired
	public PlanService(IPlanRepository planRepository) {
		this.planRepository = planRepository;
	}
	
	public List<Plan> getPlan() {
		return planRepository.findAll();
	}
}
