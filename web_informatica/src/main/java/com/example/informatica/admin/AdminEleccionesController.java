package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.informatica.institucional.elecciones.Eleccion;
import com.example.informatica.institucional.elecciones.EleccionService;

@Controller
public class AdminEleccionesController {
	
	private EleccionService eleccionService;
	
	@Autowired
	public AdminEleccionesController(EleccionService eleccionService) {
		this.eleccionService = eleccionService;
	}
	
	//ADMIN
	@GetMapping("/admin/elecciones")
	public String getAdminElecciones(Model model) {
		List<Eleccion> elecciones = eleccionService.getElecciones();
		model.addAttribute("elecciones", elecciones);
		return "admin/adminelecciones";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/elecciones/editar/{id}")
	public String editarEleccion(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Eleccion eleccion = new Eleccion();
			model.addAttribute("eleccion", eleccion);
		}else {
			model.addAttribute("eleccion", eleccionService.getEleccion(id).get());
		}
		return "admin/forms/formelecciones";
	}
	@PostMapping("/admin/elecciones/{id}")
	public String actualizarEleccion(@PathVariable int id, @ModelAttribute("eleccion") Eleccion eleccion) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			eleccionService.addEleccion(eleccion);
		}else {
			Eleccion eleccionExistente = eleccionService.getEleccion(id).get();
			eleccionExistente.setId_eleccion(id);
			eleccionExistente.setDni(eleccion.getDni());
			eleccionExistente.setPostulante(eleccion.getPostulante());
			eleccionExistente.setVotos(eleccion.getVotos());
			eleccionExistente.setUrl(eleccion.getUrl());
			
			eleccionService.updateEleccion(eleccionExistente);
		}
		return "redirect:/admin/elecciones";
	}
	
	//DELETE
	@GetMapping("/admin/elecciones/delete/{id}")
	public String eliminarEleccion(@PathVariable int id) {
		if(id != 0) {
			eleccionService.deleteEleccion(id);
		}
		return "redirect:/admin/elecciones";
	}
}




