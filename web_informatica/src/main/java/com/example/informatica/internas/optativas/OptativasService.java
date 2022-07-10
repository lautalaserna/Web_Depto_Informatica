package com.example.informatica.internas.optativas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptativasService {

	private IOptativasRepository repository;
	
	@Autowired
	public OptativasService(IOptativasRepository repository) {
		this.repository = repository;
	}
	
	public List<Optativas> getOptativas() {
		return repository.findAll();
	}
	
	public void addOptativa(Optativas optativa) {
		repository.save(optativa);
	}
	
	public Optional<Optativas> getOptativa(int id){
		return repository.findById(id);
	}
	
	public void updateOptativa(Optativas optativa) {
		repository.save(optativa);
	}
	
	public void deleteOptativa(int id) {
		repository.deleteById(id);
	}
}
