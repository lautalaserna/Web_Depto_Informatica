package com.example.informatica.internas.carreras;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrerasService {

	private ICarrerasRepository repository;
	
	@Autowired
	public CarrerasService(ICarrerasRepository repository) {
		this.repository = repository;
	}
	
	public List<Carreras> getCarreras() {
		return repository.findAll();
	}
	
	public void addCarreras(Carreras carrera) {
		repository.save(carrera);
	}
	
	public Optional<Carreras> getCarrera(int id){
		return repository.findById(id);
	}
	
	public void updateCarrera(Carreras carrera) {
		repository.save(carrera);
	}
	
	public void deleteCarrera(int id) {
		repository.deleteById(id);
	}
}
