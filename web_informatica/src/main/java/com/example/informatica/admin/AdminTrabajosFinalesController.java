package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.informatica.carrera.trabajos_finales.TrabajoFinal;
import com.example.informatica.carrera.trabajos_finales.TrabajoFinalService;

@Controller
public class AdminTrabajosFinalesController {
	
	private TrabajoFinalService trabajoFinalService;
	
	@Autowired
	public AdminTrabajosFinalesController(TrabajoFinalService trabajoFinalService) {
		this.trabajoFinalService = trabajoFinalService;
	}
	
	//ADMIN
	@GetMapping("/admin/trabajosfinales")
	public String getAdminGraduados(Model model) {
		List<TrabajoFinal> trabajoFinal = trabajoFinalService.getTrabajosFinales();
		model.addAttribute("trabajosFinales", trabajoFinal);
		return "admin/admingraduados";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/trabajosfinales/editar/{id}")
	public String editarTrabajoFinal(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			TrabajoFinal trabajoFinal = new TrabajoFinal();
			model.addAttribute("trabajoFinal", trabajoFinal);
		}else {
			model.addAttribute("trabajoFinal", trabajoFinalService.getTrabajoFinal(id).get());
		}
		return "admin/forms/formtrabajosfinales";
	}
	@PostMapping("/admin/trabajosfinales/{id}")
	public String actualizarTrabajoFinal(@PathVariable int id, @ModelAttribute("trabajofinal") TrabajoFinal trabajoFinal) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			trabajoFinalService.addTrabajoFinal(trabajoFinal);
		}else {
			TrabajoFinal trabajoFinalExistente = trabajoFinalService.getTrabajoFinal(id).get();
			trabajoFinalExistente.setId_trabajo_final(id);
			trabajoFinalExistente.setDemandante(trabajoFinal.getDemandante());
			trabajoFinalExistente.setDirectores(trabajoFinal.getDemandante());
			trabajoFinalExistente.setEstudiantes(trabajoFinal.getEstudiantes());
			trabajoFinalExistente.setIs_concluido(trabajoFinal.getIs_concluido());
			trabajoFinalExistente.setTitulo(trabajoFinal.getTitulo());
			trabajoFinalExistente.setUrl(trabajoFinal.getUrl());
			
			trabajoFinalService.updateTrabajoFinal(trabajoFinalExistente);
		}
		return "redirect:/admin/trabajosfinales";
	}
	
	//DELETE
	@GetMapping("/admin/trabajosfinales/delete/{id}")
	public String eliminarTrabajoFinal(@PathVariable int id) {
		if(id != 0) {
			trabajoFinalService.deleteTrabajoFinal(id);
		}
		return "redirect:/admin/trabajosfinales";
	}
}




