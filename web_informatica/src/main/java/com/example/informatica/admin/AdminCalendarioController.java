package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.informatica.carrera.calendario.Calendario;
import com.example.informatica.carrera.calendario.CalendarioService;

@Controller
public class AdminCalendarioController {
	
	private CalendarioService calendarioService;
	
	@Autowired
	public AdminCalendarioController(CalendarioService calendarioService) {
		this.calendarioService = calendarioService;
	}
	
	//ADMIN
	@GetMapping("/admin/calendario")
	public String getAdminCalendario(Model model) {
		List<Calendario> calendario = calendarioService.getCalendario();
		model.addAttribute("calendario", calendario);
		return "admin/admincalendario";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/calendario/editar/{id}")
	public String editarCalendario(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Calendario calendario = new Calendario();
			model.addAttribute("calendario", calendario);
		}else {
			model.addAttribute("calendario", calendarioService.getCalendario(id).get());
		}
		return "admin/forms/formcalendario";
	}
	@PostMapping("/admin/calendario/{id}")
	public String actualizarCalendario(@PathVariable int id, @ModelAttribute("calendario") Calendario calendario) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			calendarioService.addCalendario(calendario);
		}else {
			Calendario calendarioExistente = calendarioService.getCalendario(id).get();
			calendarioExistente.setId_calendario_academico(id);
			calendarioExistente.setFecha_inicio(calendario.getFecha_inicio());
			calendarioExistente.setFecha_fin(calendario.getFecha_fin());
			calendarioExistente.setConcepto(calendario.getConcepto());
			calendarioExistente.setUrl(calendario.getUrl());
			calendarioService.updateCalendario(calendarioExistente);
		}
		return "redirect:/admin/calendario";
	}
	
	//DELETE
	@GetMapping("/admin/calendario/delete/{id}")
	public String eliminarCalendario(@PathVariable int id) {
		if(id != 0) {
			calendarioService.deleteCalendario(id);
		}
		return "redirect:/admin/calendario";
	}
}




