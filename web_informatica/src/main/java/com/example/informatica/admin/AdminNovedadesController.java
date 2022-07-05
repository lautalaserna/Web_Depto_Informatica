package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.informatica.novedades.Novedades;
import com.example.informatica.novedades.NovedadesService;

@Controller
public class AdminNovedadesController {
	
	private NovedadesService novedadesService;
	
	@Autowired
	public AdminNovedadesController(NovedadesService novedadesService) {
		this.novedadesService = novedadesService;
	}
	
	//ADMIN
	@GetMapping("/admin/novedades")
	public String getAdminNovedades(Model model) {
		List<Novedades> novedades = novedadesService.getNovedades();
		model.addAttribute("novedades", novedades);
		return "admin/adminnovedades";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/novedades/editar/{id}")
	public String editarNovedad(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Novedades novedad = new Novedades();
			model.addAttribute("novedad", novedad);
		}else {
			model.addAttribute("novedad", novedadesService.getNovedad(id).get());
		}
		return "admin/forms/formnovedades";
	}
	@PostMapping("/admin/novedades/{id}")
	public String actualizarNovedad(@PathVariable int id, @ModelAttribute("novedad") Novedades novedad) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			novedadesService.addNovedad(novedad);
		}else {
			Novedades novedadExistente = novedadesService.getNovedad(id).get();
			novedadExistente.setId_novedad(id);
			novedadExistente.setImgurl(novedad.getImgurl());
			novedadExistente.setContenido(novedad.getContenido());
			novedadExistente.setFecha(novedad.getFecha());
			novedadExistente.setInfo(novedad.getInfo());
			novedadExistente.setIs_bolsa_trabajo(novedad.getIs_bolsa_trabajo());
			novedadExistente.setTitulo(novedad.getTitulo());
			novedadExistente.setUrl(novedad.getUrl());
			
			novedadesService.updateNovedad(novedadExistente);
		}
		return "redirect:/admin/novedades";
	}
	
	//DELETE
	@GetMapping("/admin/novedades/delete/{id}")
	public String eliminarNovedad(@PathVariable int id) {
		if(id != 0) {
			novedadesService.deleteNovedad(id);
		}
		return "redirect:/admin/novedades";
	}
}




