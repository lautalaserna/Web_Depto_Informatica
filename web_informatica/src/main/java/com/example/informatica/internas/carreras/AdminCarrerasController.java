package com.example.informatica.internas.carreras;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.informatica.internas.tipocarrera.TipoCarreraService;

@Controller
public class AdminCarrerasController {
	
	private CarrerasService carrerasService;
	private TipoCarreraService tipocarreraService;
	
	@Autowired
	public AdminCarrerasController(CarrerasService carrerasService, TipoCarreraService tipocarreraService) {
		this.carrerasService = carrerasService;
		this.tipocarreraService = tipocarreraService;
	}
	
	//ADMIN
	@GetMapping("/admin/carreras")
	public String getAdminCarreras(Model model) {
		List<Carreras> carreras = carrerasService.getCarreras();
		model.addAttribute("carreras", carreras);
		return "admin/admincarreras";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/carreras/editar/{id}")
	public String editarCarrera(@PathVariable int id, Model model) {
		//foreign_key id_tipo_carrera
		model.addAttribute("tipocarrera", tipocarreraService.getTipoCarrera());
		//id == 0 significa nuevo
		if(id == 0) {
			Carreras carrera = new Carreras();
			model.addAttribute("carrera", carrera);
		}else {
			model.addAttribute("carrera", carrerasService.getCarrera(id).get());
		}
		return "admin/forms/formcarreras";
	}
	@PostMapping("/admin/carreras/{id}")
	public String actualizarCarrera(@PathVariable int id, @ModelAttribute("carrera") Carreras carrera) {
		//id == 0 significa nuevo
		if(id == 0) {
			carrerasService.addCarreras(carrera);
		}else {
			Carreras carreraExistente = carrerasService.getCarrera(id).get();
			carreraExistente.setId_carrera(id);
			carreraExistente.setId_tipo_carrera(carrera.getId_tipo_carrera());
			carreraExistente.setTitulo(carrera.getTitulo());
			carreraExistente.setUrl(carrera.getUrl());
			carrerasService.updateCarrera(carreraExistente);
		}
		return "redirect:/admin/carreras";
	}
	
	//DELETE
	@GetMapping("/admin/carreras/delete/{id}")
	public String eliminarCarrera(@PathVariable int id) {
		if(id != 0) {
			carrerasService.deleteCarrera(id);
		}
		return "redirect:/admin/carreras";
	}
}




