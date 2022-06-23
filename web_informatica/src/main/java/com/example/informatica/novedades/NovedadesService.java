package com.example.informatica.novedades;

import java.util.Optional;

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
		return novedadesRepository.findAll('N',pageable);
	}
	
	public Optional<Novedades> getNovedad(int id) {
		return novedadesRepository.findById(id);
	}
	
	
	public Page<Novedades> getPageTrabajos(Pageable pageable) {
		return novedadesRepository.findAll('Y',pageable);
	}
	
}
