package com.example.informatica.institucional.autoridades;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsejoDepartamentalService {

	private IConsejoDepartamentalRepository consejoDepartamentalRepository;
	
	@Autowired
	public ConsejoDepartamentalService(IConsejoDepartamentalRepository consejoDepartamentalRepository) {
		this.consejoDepartamentalRepository = consejoDepartamentalRepository;
	}
	
	public List<Consejo_Departamental> getConsejoDepartamental() {
		return consejoDepartamentalRepository.findAll();
	}
	
	public void addConsejoDepartamental(Consejo_Departamental consejodepartamental) {
		consejoDepartamentalRepository.save(consejodepartamental);
	}
	
	public Optional<Consejo_Departamental> getConsejoDepartamental(int id){
		return consejoDepartamentalRepository.findById(id);
	}
	
	public void updateConsejoDepartamental(Consejo_Departamental consejodepartamental) {
		consejoDepartamentalRepository.save(consejodepartamental);
	}
	
	public void deleteConsejoDepartamental(int id) {
		consejoDepartamentalRepository.deleteById(id);
	}
}
