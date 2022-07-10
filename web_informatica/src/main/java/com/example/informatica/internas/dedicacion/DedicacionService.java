package com.example.informatica.internas.dedicacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DedicacionService {

	private IDedicacionRepository repository;
	
	@Autowired
	public DedicacionService(IDedicacionRepository repository) {
		this.repository = repository;
	}
	
	public List<Dedicacion> getDedicacion() {
		return repository.findAll();
	}
	
	public void addDedicacion(Dedicacion dedicacion) {
		repository.save(dedicacion);
	}
	
	public Optional<Dedicacion> getDedicacion(int id){
		return repository.findById(id);
	}
	
	public void updateDedicacion(Dedicacion dedicacion) {
		repository.save(dedicacion);
	}
	
	public void deleteDedicacion(int id) {
		repository.deleteById(id);
	}
}
