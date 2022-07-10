package com.example.informatica.internas.tipocarrera;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoCarreraService {

	private ITipoCarreraRepository repository;
	
	@Autowired
	public TipoCarreraService(ITipoCarreraRepository repository) {
		this.repository = repository;
	}
	
	public List<TipoCarrera> getTipoCarrera() {
		return repository.findAll();
	}
	
	public void addTipoCarrera(TipoCarrera tipocarrera) {
		repository.save(tipocarrera);
	}
	
	public Optional<TipoCarrera> getTipoCarrera(int id){
		return repository.findById(id);
	}
	
	public void updateTipoCarrera(TipoCarrera tipocarrera) {
		repository.save(tipocarrera);
	}
	
	public void deleteTipoCarrera(int id) {
		repository.deleteById(id);
	}
}
