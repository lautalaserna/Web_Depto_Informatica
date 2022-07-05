package com.example.informatica.institucional.autoridades;

import java.util.List;
import java.util.Optional;

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
	
	public void addAutoridad(Autoridad autoridad) {
		autoridadesRepository.save(autoridad);
	}
	
	public Optional<Autoridad> getAutoridad(int id){
		return autoridadesRepository.findById(id);
	}
	
	public void updateAutoridad(Autoridad autoridad) {
		autoridadesRepository.save(autoridad);
	}
	
	public void deleteAutoridad(int id) {
		autoridadesRepository.deleteById(id);
	}
}
