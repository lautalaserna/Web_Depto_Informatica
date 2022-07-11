package com.example.informatica.internas.correlativas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.informatica.internas.asignaturas.AsignaturasService;
import com.example.informatica.internas.tipocarrera.TipoCarreraService;

@Controller
public class AdminCorrelativasController {
	
	private CorrelativasService correlativasService;
	private AsignaturasService asignaturasService;
	
	@Autowired
	public AdminCorrelativasController(CorrelativasService correlativasService, AsignaturasService asignaturasService) {
		this.correlativasService = correlativasService;
		this.asignaturasService = asignaturasService;
	}
	
	//ADMIN
	@GetMapping("/admin/correlativas")
	public String getAdminCorrelativas(Model model) {
		List<Correlativas> correlativas = correlativasService.getCorrelativas();
		model.addAttribute("correlativas", correlativas);
		return "admin/adminocorrelativas";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/correlativas/editar/{id}")
	public String editarCorrelativa(@PathVariable int id, Model model) {
		//foreign_key id_asignatura
		model.addAttribute("asignaturas", asignaturasService.getAsignaturas());
		//id == 0 significa nuevo
		if(id == 0) {
			Correlativas correlativa = new Correlativas();
			model.addAttribute("correlativa", correlativa);
		}else {
			model.addAttribute("correlativa", correlativasService.getCorrelativa(id).get());
		}
		return "admin/forms/formcorrelativas";
	}
	@PostMapping("/admin/correlativas/{id}")
	public String actualizarCorrelativa(@PathVariable int id, @ModelAttribute("correlativa") Correlativas correlativa) {
		//id == 0 significa nuevo
		if(id == 0) {
			correlativasService.addCorrelativa(correlativa);
		}else {
			Correlativas correlativaExistente = correlativasService.getCorrelativa(id).get();
			correlativaExistente.setId_correlativa(id);
			correlativaExistente.setId_asignatura_correlativa(correlativa.getId_asignatura_correlativa());
			correlativaExistente.setId_asignatura_principal(correlativa.getId_asignatura_principal());
			correlativaExistente.setUrl(correlativa.getUrl());
			correlativasService.updateCorrelativa(correlativaExistente);
		}
		return "redirect:/admin/correlativas";
	}
	
	//DELETE
	@GetMapping("/admin/correlativas/delete/{id}")
	public String eliminarCorrelativa(@PathVariable int id) {
		if(id != 0) {
			correlativasService.deleteCorrelativa(id);
		}
		return "redirect:/admin/correlativas";
	}
}




