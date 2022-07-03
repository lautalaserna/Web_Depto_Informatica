package com.example.informatica.admin;

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

@Controller
public class AdminGraduadosController {
	
	private GraduadosService graduadosService;
	
	@Autowired
	public AdminGraduadosController(GraduadosService graduadosService) {
		this.graduadosService = graduadosService;
	}
	
	//ADMIN
	@GetMapping("/admin/graduados")
	public String getAdminGraduados(Model model) {
		
		model.addAttribute("headers", List.of("nombre completo","fecha"));
		model.addAttribute("entidad", "graduados");
		List<Graduados> graduados = graduadosService.getGraduados();
		model.addAttribute("graduados", graduados);
		return "admin/admingraduados";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/graduados/editar/{id}")
	public String editarGraduado(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Graduados graduado = new Graduados();
			model.addAttribute("graduado", graduado);
		}else {
			model.addAttribute("graduado", graduadosService.getGraduado(id).get());
		}
		return "admin/forms/formgraduados";
	}
	@PostMapping("/admin/graduados/{id}")
	public String actualizarEstudiante(@PathVariable int id, @ModelAttribute("graduado") Graduados graduado) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			graduadosService.addGraduado(graduado);
		}else {
			Graduados graduadoExistente = graduadosService.getGraduado(id).get();
			graduadoExistente.setId_graduado(id);
			graduadoExistente.setNombre_completo(graduado.getNombre_completo());
			graduadoExistente.setFecha(graduado.getFecha());
			graduadoExistente.setUrl(graduado.getUrl());
			graduadosService.updateGraduado(graduadoExistente);
		}
		return "redirect:/admin/graduados";
	}
	
	//DELETE
	@GetMapping("/admin/graduados/delete/{id}")
	public String eliminarGraduado(@PathVariable int id) {
		if(id != 0) {
			graduadosService.deleteGraduado(id);
		}
		return "redirect:/admin/graduados";
	}
}




