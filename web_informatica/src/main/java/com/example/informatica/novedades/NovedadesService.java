package com.example.informatica.novedades;

import java.util.List;
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
	
	public List<Novedades> getNovedades(){
		return novedadesRepository.findAll();
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
	
	public void addNovedad(Novedades novedad) {
		novedadesRepository.save(novedad);
	}
	
	public void updateNovedad(Novedades novedad) {
		novedadesRepository.save(novedad);
	}
	
	public void deleteNovedad(int id) {
		novedadesRepository.deleteById(id);
	}
	
}
