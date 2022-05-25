package com.example.informatica.institucional.autoridades;

import java.util.List;

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
}
