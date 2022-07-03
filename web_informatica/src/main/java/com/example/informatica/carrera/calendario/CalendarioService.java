package com.example.informatica.carrera.calendario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.informatica.carrera.graduados.Graduados;

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
	
	public void addCalendario(Calendario calendario) {
		calendarioRepository.save(calendario);
	}
	
	public Optional<Calendario> getCalendario(int id){
		return calendarioRepository.findById(id);
	}
	
	public void updateCalendario(Calendario calendario) {
		calendarioRepository.save(calendario);
	}
	
	public void deleteCalendario(int id) {
		calendarioRepository.deleteById(id);
	}
}
