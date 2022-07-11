package com.example.informatica.internas.tipocarrera;

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
public class AdminTipoCarreraController {
	
	private TipoCarreraService tipocarreraService;
	
	@Autowired
	public AdminTipoCarreraController(TipoCarreraService tipocarreraService) {
		this.tipocarreraService = tipocarreraService;
	}
	
	//ADMIN
	@GetMapping("/admin/tipocarrera")
	public String getAdminTipoCarrera(Model model) {
		List<TipoCarrera> tipocarrera = tipocarreraService.getTipoCarrera();
		model.addAttribute("tipocarrera", tipocarrera);
		return "admin/admintipocarrera";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/tipocarrera/editar/{id}")
	public String editarTipoCarrera(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			TipoCarrera tipocarrera = new TipoCarrera();
			model.addAttribute("tipocarrera", tipocarrera);
		}else {
			model.addAttribute("tipocarrera", tipocarreraService.getTipoCarrera(id).get());
		}
		return "admin/forms/formtipocarrera";
	}
	@PostMapping("/admin/tipocarrera/{id}")
	public String actualizarTipoCarrera(@PathVariable int id, @ModelAttribute("tipocarrera") TipoCarrera tipocarrera) {
		//id == 0 significa nuevo
		if(id == 0) {
			tipocarreraService.addTipoCarrera(tipocarrera);
		}else {
			TipoCarrera tipocarreraExistente = tipocarreraService.getTipoCarrera(id).get();
			tipocarreraExistente.setId_tipo_carrera(id);
			tipocarreraExistente.setNombre(tipocarrera.getNombre());
			tipocarreraExistente.setUrl(tipocarrera.getUrl());			
			tipocarreraService.updateTipoCarrera(tipocarreraExistente);
		}
		return "redirect:/admin/tipocarrera";
	}
	
	//DELETE
	@GetMapping("/admin/tipocarrera/delete/{id}")
	public String eliminarTipoCarrera(@PathVariable int id) {
		if(id != 0) {
			tipocarreraService.deleteTipoCarrera(id);
		}
		return "redirect:/admin/tipocarrera";
	}
	
}




