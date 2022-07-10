package com.example.informatica.internas.plan_estudio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanEstudioService {

	private IPlanEstudioRepository repository;
	
	@Autowired
	public PlanEstudioService(IPlanEstudioRepository repository) {
		this.repository = repository;
	}
	
	public List<PlanEstudio> getPlanEstudios() {
		return repository.findAll();
	}
	
	public void addPlanEstudios(PlanEstudio planestudios) {
		repository.save(planestudios);
	}
	
	public Optional<PlanEstudio> getPlanEstudios(int id){
		return repository.findById(id);
	}
	
	public void updatePlanEstudios(PlanEstudio planestudios) {
		repository.save(planestudios);
	}
	
	public void deletePlanEstudios(int id) {
		repository.deleteById(id);
	}
}
