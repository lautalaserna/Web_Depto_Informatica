package com.example.informatica.internas.cargos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargosService {

	private ICargosRepository repository;
	
	@Autowired
	public CargosService(ICargosRepository repository) {
		this.repository = repository;
	}
	
	public List<Cargos> getCargos() {
		return repository.findAll();
	}
	
	public void addCargo(Cargos cargo) {
		repository.save(cargo);
	}
	
	public Optional<Cargos> getCargo(int id){
		return repository.findById(id);
	}
	
	public void updateCargo(Cargos cargo) {
		repository.save(cargo);
	}
	
	public void deleteCargo(int id) {
		repository.deleteById(id);
	}
}
