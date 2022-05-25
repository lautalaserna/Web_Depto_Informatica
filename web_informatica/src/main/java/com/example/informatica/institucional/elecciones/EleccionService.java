package com.example.informatica.institucional.elecciones;

import java.util.List;

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
}
