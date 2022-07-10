package com.example.informatica.carrera.optativas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VOptativasService {

	private IVOptativasRepository optativasRepository;
	
	@Autowired
	public VOptativasService(IVOptativasRepository optativasRepository) {
		this.optativasRepository = optativasRepository;
	}
	
	public List<VOptativas> getOptativas() {
		return optativasRepository.findAll();
	}
}
