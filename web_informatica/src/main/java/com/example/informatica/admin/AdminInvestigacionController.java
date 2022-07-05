package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.informatica.institucional.investigacion.Investigacion;
import com.example.informatica.institucional.investigacion.InvestigacionService;

@Controller
public class AdminInvestigacionController {
	
	private InvestigacionService investigacionService;
	
	@Autowired
	public AdminInvestigacionController(InvestigacionService investigacionService) {
		this.investigacionService = investigacionService;
	}
	
	//ADMIN
	@GetMapping("/admin/investigacion")
	public String getAdminInvestigacion(Model model) {
		List<Investigacion> investigacion = investigacionService.getInvestigacion();
		model.addAttribute("investigacion", investigacion);
		return "admin/admininvestigacion";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/investigacion/editar/{id}")
	public String editarInvestigacion(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Investigacion investigacion = new Investigacion();
			model.addAttribute("investigacion", investigacion);
		}else {
			model.addAttribute("investigacion", investigacionService.getInvestigacion(id).get());
		}
		return "admin/forms/forminvestigacion";
	}
	@PostMapping("/admin/investigacion/{id}")
	public String actualizarInvestigacion(@PathVariable int id, @ModelAttribute("investigacion") Investigacion investigacion) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			investigacionService.addInvestigacion(investigacion);
		}else {
			Investigacion investigacionExistente = investigacionService.getInvestigacion(id).get();
			investigacionExistente.setId_investigacion(id);
			investigacionExistente.setIntegrantes(investigacion.getIntegrantes());
			investigacionExistente.setObjetivo(investigacion.getObjetivo());
			investigacionExistente.setTitulo(investigacion.getTitulo());
			investigacionExistente.setUrl(investigacion.getUrl());
			
			investigacionService.updateInvestigacion(investigacionExistente);
		}
		return "redirect:/admin/investigacion";
	}
	
	//DELETE
	@GetMapping("/admin/investigacion/delete/{id}")
	public String eliminarInvestigacion(@PathVariable int id) {
		if(id != 0) {
			investigacionService.deleteInvestigacion(id);
		}
		return "redirect:/admin/investigacion";
	}
}




