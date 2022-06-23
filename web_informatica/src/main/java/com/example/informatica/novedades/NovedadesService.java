package com.example.informatica.novedades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class NovedadesService {

	private INovedadesRepository novedadesRepository;
	
	@Autowired
	public NovedadesService(INovedadesRepository novedadesRepository) {
		this.novedadesRepository = novedadesRepository;
	}
	
	public Page<Novedades> getPageNoticias(Pageable pageable) {
		return novedadesRepository.findAll(pageable);
	}
	
	/*
	public List<Novedades> getTrabajos() {
		return novedadesRepository.findAll('Y');
	}*/
	
}
