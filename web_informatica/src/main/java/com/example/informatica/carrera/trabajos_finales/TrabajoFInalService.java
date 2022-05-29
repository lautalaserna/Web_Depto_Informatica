package com.example.informatica.carrera.trabajos_finales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoFInalService {

	private ITrabajoFinalRepository trabajoFinalRepository;
	
	@Autowired
	public TrabajoFInalService(ITrabajoFinalRepository trabajoFinalRepository) {
		this.trabajoFinalRepository = trabajoFinalRepository;
	}
	
	public List<TrabajoFinal> getTrabajosFinales() {
		return trabajoFinalRepository.findAll();
	}
}
