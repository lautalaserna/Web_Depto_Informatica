package com.example.informatica.institucional.docente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteService {

	private IDocenteRepository docenteRepository;
	
	@Autowired
	public DocenteService(IDocenteRepository docenteRepository) {
		this.docenteRepository = docenteRepository;
	}
	
	public List<Docente> getDocentes() {
		return docenteRepository.findAll();
	}
}
