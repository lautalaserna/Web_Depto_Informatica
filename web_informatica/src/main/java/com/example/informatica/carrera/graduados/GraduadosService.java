package com.example.informatica.carrera.graduados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraduadosService {

	private IGraduadosRepository graduadosRepository;
	
	@Autowired
	public GraduadosService(IGraduadosRepository graduadosRepository) {
		this.graduadosRepository = graduadosRepository;
	}
	
	public List<Graduados> getGraduados() {
		return graduadosRepository.findAll();
	}
	
	public void addGraduado(Graduados graduado) {
		graduadosRepository.save(graduado);
	}
}
