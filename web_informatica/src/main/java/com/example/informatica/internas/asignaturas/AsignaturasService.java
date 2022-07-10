package com.example.informatica.internas.asignaturas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignaturasService {

	private IAsignaturasRepository repository;
	
	@Autowired
	public AsignaturasService(IAsignaturasRepository repository) {
		this.repository = repository;
	}
	
	public List<Asignaturas> getAsignaturas() {
		return repository.findAll();
	}
	
	public void addAsignatura(Asignaturas asignatura) {
		repository.save(asignatura);
	}
	
	public Optional<Asignaturas> getAsignatura(int id){
		return repository.findById(id);
	}
	
	public void updateAsignatura(Asignaturas asignatura) {
		repository.save(asignatura);
	}
	
	public void deleteAsignatura(int id) {
		repository.deleteById(id);
	}
}
