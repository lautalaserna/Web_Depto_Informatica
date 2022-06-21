package com.example.informatica.carrera.pps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PPSService {

	private IPPSRepository ppsRepository;
	
	@Autowired
	public PPSService(IPPSRepository ppsRepository) {
		this.ppsRepository = ppsRepository;
	}
	
	public List<PPS> getPPSDisponibles() {
		return ppsRepository.findAll('D');
	}
	
	public List<PPS> getPPSCurso() {
		return ppsRepository.findAll('C');
	}
	
	public List<PPS> getPPSFinalizadas() {
		return ppsRepository.findAll('F');
	}
}
