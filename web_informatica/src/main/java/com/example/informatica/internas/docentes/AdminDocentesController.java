package com.example.informatica.internas.docentes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminDocentesController {
	
	private DocentesService docentesService;
	
	@Autowired
	public AdminDocentesController(DocentesService docentesService) {
		this.docentesService = docentesService;
	}
	
	//ADMIN
	@GetMapping("/admin/docentes")
	public String getAdminDocentes(Model model) {
		List<Docentes> docentes = docentesService.getDocentes();
		model.addAttribute("docentes", docentes);
		return "admin/admindocentes";
	}
	
	
	//CREATE or EDIT
	@GetMapping("/admin/docentes/editar/{id}")
	public String editarDocente(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Docentes docente = new Docentes();
			model.addAttribute("docente", docente);
		}else {
			model.addAttribute("docente", docentesService.getDocente(id).get());
		}
		return "admin/forms/formdocentes";
	}
	@PostMapping("/admin/docentes/{id}")
	public String actualizarDocente(@PathVariable int id, @ModelAttribute("docente") Docentes docente) {
		//id == 0 significa nuevo
		if(id == 0) {
			docentesService.addDocente(docente);
		}else {
			Docentes docenteExistente = docentesService.getDocente(id).get();
			docenteExistente.setId_docente(id);
			docenteExistente.setDni(docente.getDni());
			docenteExistente.setEmail(docente.getEmail());
			docenteExistente.setImg_url(docente.getImg_url());
			docenteExistente.setNombre_completo(docente.getNombre_completo());
			docenteExistente.setTitulo(docente.getTitulo());
			docenteExistente.setUrl(docente.getUrl());
			docentesService.updateDocente(docenteExistente);
		}
		return "redirect:/admin/docentes";
	}
	
	//DELETE
	@GetMapping("/admin/docentes/delete/{id}")
	public String eliminarDocente(@PathVariable int id) {
		if(id != 0) {
			docentesService.deleteDocente(id);
		}
		return "redirect:/admin/docentes";
	}
	
}




