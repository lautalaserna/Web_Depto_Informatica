package com.example.informatica.novedades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovedadesService {

	private INovedadesRepository novedadesRepository;
	
	@Autowired
	public NovedadesService(INovedadesRepository novedadesRepository) {
		this.novedadesRepository = novedadesRepository;
	}
	
	public List<Novedades> getNoticias() {
		return novedadesRepository.findAll('N');
	}
	
	public List<Novedades> getTrabajos() {
		return novedadesRepository.findAll('Y');
	}
	
}
