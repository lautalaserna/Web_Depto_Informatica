package com.example.informatica.institucional.autoridades;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsejoAlumnosService {

	private IConsejoAlumnosRepository consejoAlumnosRepository;
	
	@Autowired
	public ConsejoAlumnosService(IConsejoAlumnosRepository consejoAlumnosRepository) {
		this.consejoAlumnosRepository = consejoAlumnosRepository;
	}
	
	public List<Consejo_Alumnos> getConsejoAlumnos() {
		return consejoAlumnosRepository.findAll();
	}
	
	public void addConsejoAlumnos(Consejo_Alumnos consejoalumnos) {
		consejoAlumnosRepository.save(consejoalumnos);
	}
	
	public Optional<Consejo_Alumnos> getConsejoAlumnos(int id){
		return consejoAlumnosRepository.findById(id);
	}
	
	public void updateConsejoAlumnos(Consejo_Alumnos consejoalumnos) {
		consejoAlumnosRepository.save(consejoalumnos);
	}
	
	public void deleteConsejoAlumnos(int id) {
		consejoAlumnosRepository.deleteById(id);
	}
}
