package com.example.informatica.internas.asignaturas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.informatica.carrera.graduados.Graduados;
import com.example.informatica.carrera.graduados.GraduadosService;
import com.example.informatica.internas.areas.Areas;
import com.example.informatica.internas.areas.AreasService;

@Controller
public class AdminAsignaturasController {
	
	private AsignaturasService asignaturasService;
	private AreasService areasService;
	
	@Autowired
	public AdminAsignaturasController(AsignaturasService asignaturasService, AreasService areasService) {
		this.asignaturasService = asignaturasService;
		this.areasService = areasService;
	}
	
	//ADMIN
	@GetMapping("/admin/asignaturas")
	public String getAdminAsignaturas(Model model) {
		List<Asignaturas> asignaturas = asignaturasService.getAsignaturas();
		model.addAttribute("asignaturas", asignaturas);
		return "admin/adminasignaturas";
	}
	
	
	//CREATE or EDIT
	@GetMapping("/admin/asignaturas/editar/{id}")
	public String editarAsignatura(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Asignaturas asignatura = new Asignaturas();
			List<Areas> areas = areasService.getAreas();
			
			model.addAttribute("asignatura", asignatura);
			model.addAttribute("areas", areas);
			
		}else {
			List<Areas> areas = areasService.getAreas();
			model.addAttribute("asignatura", asignaturasService.getAsignatura(id).get());
			model.addAttribute("areas", areas);
		}
		return "admin/forms/formasignaturas";
	}
	@PostMapping("/admin/asignaturas/{id}")
	public String actualizarAsignatura(@PathVariable int id, @ModelAttribute("asignatura") Asignaturas asignatura) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			asignaturasService.addAsignatura(asignatura);
		}else {
			Asignaturas asignaturaExistente = asignaturasService.getAsignatura(id).get();
			asignaturaExistente.setId_asignatura(id);
			asignaturaExistente.setTitulo(asignatura.getTitulo());
			asignaturaExistente.setCodigo(asignatura.getCodigo());
			asignaturaExistente.setCreditos_grado(asignatura.getCreditos_grado());
			asignaturaExistente.setId_area(asignatura.getId_area());
			asignaturaExistente.setUrl(asignatura.getUrl());
			asignaturasService.updateAsignatura(asignaturaExistente);
		}
		return "redirect:/admin/asignaturas";
	}
	
	//DELETE
	@GetMapping("/admin/asignaturas/delete/{id}")
	public String eliminarAsignatura(@PathVariable int id) {
		if(id != 0) {
			asignaturasService.deleteAsignatura(id);
		}
		return "redirect:/admin/asignaturas";
	}
	
}




