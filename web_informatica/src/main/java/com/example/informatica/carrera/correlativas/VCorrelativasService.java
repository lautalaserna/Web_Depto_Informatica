package com.example.informatica.carrera.correlativas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VCorrelativasService {

	private IVCorrelativasRepository correlativasRepository;
	
	@Autowired
	public VCorrelativasService(IVCorrelativasRepository correlativasRepository) {
		this.correlativasRepository = correlativasRepository;
	}
	
	public List<VCorrelativas> getCorrelativas() {
		return correlativasRepository.findAll();
	}
}
