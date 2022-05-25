package com.example.informatica.institucional.investigacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestigacionService {

	private IInvestigacionRepository investigacionRepository;
	
	@Autowired
	public InvestigacionService(IInvestigacionRepository investigacionRepository) {
		this.investigacionRepository = investigacionRepository;
	}
	
	public List<Investigacion> getInvestigacion() {
		return investigacionRepository.findAll();
	}
}
