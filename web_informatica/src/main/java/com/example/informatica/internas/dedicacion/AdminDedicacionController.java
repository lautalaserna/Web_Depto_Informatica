package com.example.informatica.internas.dedicacion;

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
public class AdminDedicacionController {
	
	private DedicacionService dedicacionService;
	
	@Autowired
	public AdminDedicacionController(DedicacionService dedicacionService) {
		this.dedicacionService = dedicacionService;
	}
	
	//ADMIN
	@GetMapping("/admin/dedicacion")
	public String getAdminDedicacion(Model model) {
		List<Dedicacion> dedicacion = dedicacionService.getDedicacion();
		model.addAttribute("dedicacion", dedicacion);
		return "admin/admindedicacion";
	}
	
	
	//CREATE or EDIT
	@GetMapping("/admin/dedicacion/editar/{id}")
	public String editarDedicacion(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Dedicacion dedicacion = new Dedicacion();
			model.addAttribute("dedicacion", dedicacion);
		}else {
			model.addAttribute("dedicacion", dedicacionService.getDedicacion(id).get());
		}
		return "admin/forms/formdedicacion";
	}
	@PostMapping("/admin/dedicacion/{id}")
	public String actualizarDedicacion(@PathVariable int id, @ModelAttribute("dedicacion") Dedicacion dedicacion) {
		//id == 0 significa nuevo
		if(id == 0) {
			dedicacionService.addDedicacion(dedicacion);
		}else {
			Dedicacion dedicacionExistente = dedicacionService.getDedicacion(id).get();
			dedicacionExistente.setId_dedicacion(id);
			dedicacionExistente.setNombre(dedicacion.getNombre());
			dedicacionService.updateDedicacion(dedicacionExistente);
		}
		return "redirect:/admin/dedicacion";
	}
	
	//DELETE
	@GetMapping("/admin/dedicacion/delete/{id}")
	public String eliminarDedicacion(@PathVariable int id) {
		if(id != 0) {
			dedicacionService.deleteDedicacion(id);
		}
		return "redirect:/admin/dedicacion";
	}
	
}




