package com.example.informatica.institucional.autoridades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoridadService {

	private IAutoridadRepository autoridadesRepository;
	
	@Autowired
	public AutoridadService(IAutoridadRepository autoridadesRepository) {
		this.autoridadesRepository = autoridadesRepository;
	}
	
	public List<Autoridad> getAutoridades() {
		return autoridadesRepository.findAll();
	}
}
