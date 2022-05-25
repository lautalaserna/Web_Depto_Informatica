package com.example.informatica.carrera.calendario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarioService {

	private ICalendarioRepository calendarioRepository;
	
	@Autowired
	public CalendarioService(ICalendarioRepository calendarioRepository) {
		this.calendarioRepository = calendarioRepository;
	}
	
	public List<Calendario> getCalendario() {
		return calendarioRepository.findAll();
	}
}
