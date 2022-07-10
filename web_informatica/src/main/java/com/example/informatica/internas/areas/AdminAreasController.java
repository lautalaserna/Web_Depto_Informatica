package com.example.informatica.internas.areas;

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
public class AdminAreasController {
	
	private AreasService areasService;
	
	@Autowired
	public AdminAreasController(AreasService areasService) {
		this.areasService = areasService;
	}
	
	//ADMIN
	@GetMapping("/admin/areas")
	public String getAdminAreas(Model model) {
		List<Areas> areas = areasService.getAreas();
		model.addAttribute("area", areas);
		return "admin/adminareas";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/areas/editar/{id}")
	public String editarArea(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Areas area = new Areas();
			model.addAttribute("area", area);
		}else {
			model.addAttribute("area", areasService.getArea(id).get());
		}
		return "admin/forms/formareas";
	}
	@PostMapping("/admin/areas/{id}")
	public String actualizarArea(@PathVariable int id, @ModelAttribute("area") Areas area) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			areasService.addArea(area);
		}else {
			Areas areaExistente = areasService.getArea(id).get();
			areaExistente.setId_area(id);
			areaExistente.setTitulo(area.getTitulo());
			areaExistente.setUrl(area.getUrl());
			
			areasService.updateArea(areaExistente);
		}
		return "redirect:/admin/areas";
	}
	
	//DELETE
	@GetMapping("/admin/areas/delete/{id}")
	public String eliminarArea(@PathVariable int id) {
		if(id != 0) {
			areasService.deleteArea(id);
		}
		return "redirect:/admin/areas";
	}
}




