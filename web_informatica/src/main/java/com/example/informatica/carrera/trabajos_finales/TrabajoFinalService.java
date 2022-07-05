package com.example.informatica.carrera.trabajos_finales;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoFinalService {

	private ITrabajoFinalRepository trabajoFinalRepository;
	
	@Autowired
	public TrabajoFinalService(ITrabajoFinalRepository trabajoFinalRepository) {
		this.trabajoFinalRepository = trabajoFinalRepository;
	}
	
	public List<TrabajoFinal> getTrabajosFinales() {
		return trabajoFinalRepository.findAll();
	}
	
	public void addTrabajoFinal(TrabajoFinal trabajoFinal) {
		trabajoFinalRepository.save(trabajoFinal);
	}
	
	public Optional<TrabajoFinal> getTrabajoFinal(int id){
		return trabajoFinalRepository.findById(id);
	}
	
	public void updateTrabajoFinal(TrabajoFinal trabajoFinal) {
		trabajoFinalRepository.save(trabajoFinal);
	}
	
	public void deleteTrabajoFinal(int id) {
		trabajoFinalRepository.deleteById(id);
	}
}
