package com.example.informatica.internas.tipo_cargo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoCargoService {

	private ITipoCargoRepository repository;
	
	@Autowired
	public TipoCargoService(ITipoCargoRepository repository) {
		this.repository = repository;
	}
	
	public List<TipoCargo> getTipoCargo() {
		return repository.findAll();
	}
	
	public void addTipoCargo(TipoCargo tipocargo) {
		repository.save(tipocargo);
	}
	
	public Optional<TipoCargo> getTipoCargo(int id){
		return repository.findById(id);
	}
	
	public void updateTipoCargo(TipoCargo tipocargo) {
		repository.save(tipocargo);
	}
	
	public void deleteTipoCargo(int id) {
		repository.deleteById(id);
	}
}
