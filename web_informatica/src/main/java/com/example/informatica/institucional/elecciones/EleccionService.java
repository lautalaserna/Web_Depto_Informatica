package com.example.informatica.institucional.elecciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EleccionService {

	private IEleccionRepository eleccionRepository;
	
	@Autowired
	public EleccionService(IEleccionRepository eleccionRepository) {
		this.eleccionRepository = eleccionRepository;
	}
	
	public List<Eleccion> getElecciones() {
		return eleccionRepository.findAll();
	}
	
	public void addEleccion(Eleccion eleccion) {
		eleccionRepository.save(eleccion);
	}
	
	public Optional<Eleccion> getEleccion(int id){
		return eleccionRepository.findById(id);
	}
	
	public void updateEleccion(Eleccion eleccion) {
		eleccionRepository.save(eleccion);
	}
	
	public void deleteEleccion(int id) {
		eleccionRepository.deleteById(id);
	}
}
