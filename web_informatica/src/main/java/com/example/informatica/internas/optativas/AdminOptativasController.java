package com.example.informatica.internas.optativas;

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
public class AdminOptativasController {
	
	private OptativasService optativasService;
	private AsignaturasService asignaturasService;
	
	@Autowired
	public AdminOptativasController(OptativasService optativasService, AsignaturasService asignaturasService) {
		this.optativasService = optativasService;
		this.asignaturasService = asignaturasService;
	}
	
	//ADMIN
	@GetMapping("/admin/optativas")
	public String getAdminOptativas(Model model) {
		List<Optativas> optativas = optativasService.getOptativas();
		model.addAttribute("optativas", optativas);
		return "admin/adminoptativas";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/optativas/editar/{id}")
	public String editarOptativa(@PathVariable int id, Model model) {
		//foreign_key id_asignatura
		model.addAttribute("asignaturas", asignaturasService.getAsignaturas());
		//id == 0 significa nuevo
		if(id == 0) {
			Optativas optativa = new Optativas();
			model.addAttribute("optativa", optativa);
		}else {
			model.addAttribute("optativa", optativasService.getOptativa(id).get());
		}
		return "admin/forms/formoptativas";
	}
	@PostMapping("/admin/optativas/{id}")
	public String actualizarOptativa(@PathVariable int id, @ModelAttribute("optativa") Optativas optativa) {
		//id == 0 significa nuevo
		if(id == 0) {
			optativasService.addOptativa(optativa);
		}else {
			Optativas optativaExistente = optativasService.getOptativa(id).get();
			optativaExistente.setId_optativa(id);
			optativaExistente.setCuatrimestre(optativa.getCuatrimestre());
			optativaExistente.setId_asignatura(optativa.getId_asignatura());
			optativaExistente.setUrl(optativa.getUrl());
			optativasService.updateOptativa(optativaExistente);
		}
		return "redirect:/admin/optativas";
	}
	
	//DELETE
	@GetMapping("/admin/optativas/delete/{id}")
	public String eliminarOptativa(@PathVariable int id) {
		if(id != 0) {
			optativasService.deleteOptativa(id);
		}
		return "redirect:/admin/optativas";
	}
}




