package com.example.informatica.carrera.correlativas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrelativasService {

	private ICorrelativasRepository correlativasRepository;
	
	@Autowired
	public CorrelativasService(ICorrelativasRepository correlativasRepository) {
		this.correlativasRepository = correlativasRepository;
	}
	
	public List<Correlativas> getCorrelativas() {
		return correlativasRepository.findAll();
	}
}
