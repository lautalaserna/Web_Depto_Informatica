package com.example.informatica.internas.areas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreasService {

	private IAreasRepository areasRepository;
	
	@Autowired
	public AreasService(IAreasRepository areasRepository) {
		this.areasRepository = areasRepository;
	}
	
	public List<Areas> getAreas() {
		return areasRepository.findAll();
	}
	
	public void addArea(Areas area) {
		areasRepository.save(area);
	}
	
	public Optional<Areas> getArea(int id){
		return areasRepository.findById(id);
	}
	
	public void updateArea(Areas area) {
		areasRepository.save(area);
	}
	
	public void deleteArea(int id) {
		areasRepository.deleteById(id);
	}
}
