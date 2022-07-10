package com.example.informatica.internas.docentes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocentesService {

	private IDocentesRepository repository;
	
	@Autowired
	public DocentesService(IDocentesRepository repository) {
		this.repository = repository;
	}
	
	public List<Docentes> getDocentes() {
		return repository.findAll();
	}
	
	public void addDocente(Docentes docente) {
		repository.save(docente);
	}
	
	public Optional<Docentes> getDocente(int id){
		return repository.findById(id);
	}
	
	public void updateDocente(Docentes docente) {
		repository.save(docente);
	}
	
	public void deleteDocente(int id) {
		repository.deleteById(id);
	}
}
