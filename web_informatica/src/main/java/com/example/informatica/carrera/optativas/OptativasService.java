package com.example.informatica.carrera.optativas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptativasService {

	private IOptativasRepository optativasRepository;
	
	@Autowired
	public OptativasService(IOptativasRepository optativasRepository) {
		this.optativasRepository = optativasRepository;
	}
	
	public List<Optativas> getOptativas() {
		return optativasRepository.findAll();
	}
}
