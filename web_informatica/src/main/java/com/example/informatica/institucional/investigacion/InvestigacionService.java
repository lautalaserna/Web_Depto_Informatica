package com.example.informatica.institucional.investigacion;

import java.util.List;
import java.util.Optional;

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
	
	public void addInvestigacion(Investigacion investigacion) {
		investigacionRepository.save(investigacion);
	}
	
	public Optional<Investigacion> getInvestigacion(int id){
		return investigacionRepository.findById(id);
	}
	
	public void updateInvestigacion(Investigacion investigacion) {
		investigacionRepository.save(investigacion);
	}
	
	public void deleteInvestigacion(int id) {
		investigacionRepository.deleteById(id);
	}
}
