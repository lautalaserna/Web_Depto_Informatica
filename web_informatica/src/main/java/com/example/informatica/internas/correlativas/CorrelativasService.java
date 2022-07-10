package com.example.informatica.internas.correlativas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrelativasService {

	private ICorrelativasRepository repository;
	
	@Autowired
	public CorrelativasService(ICorrelativasRepository repository) {
		this.repository = repository;
	}
	
	public List<Correlativas> getCorrelativas() {
		return repository.findAll();
	}
	
	public void addCorrelativa(Correlativas correlativa) {
		repository.save(correlativa);
	}
	
	public Optional<Correlativas> getCorrelativa(int id){
		return repository.findById(id);
	}
	
	public void updateCorrelativa(Correlativas correlativa) {
		repository.save(correlativa);
	}
	
	public void deleteCorrelativa(int id) {
		repository.deleteById(id);
	}
}
