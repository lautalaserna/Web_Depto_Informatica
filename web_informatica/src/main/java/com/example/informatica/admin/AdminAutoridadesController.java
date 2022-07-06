package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.informatica.institucional.autoridades.Autoridad;
import com.example.informatica.institucional.autoridades.AutoridadService;
import com.example.informatica.institucional.autoridades.ConsejoAlumnosService;
import com.example.informatica.institucional.autoridades.ConsejoDepartamentalService;
import com.example.informatica.institucional.autoridades.Consejo_Alumnos;
import com.example.informatica.institucional.autoridades.Consejo_Departamental;

@Controller
public class AdminAutoridadesController {
	
	private AutoridadService autoridadesService;
	private ConsejoDepartamentalService consejodepartamentalService;
	private ConsejoAlumnosService consejoalumnosService;
	
	
	@Autowired
	public AdminAutoridadesController(AutoridadService autoridadesService,
			ConsejoDepartamentalService consejodepartamentalService, ConsejoAlumnosService consejoalumnosService) {
		this.autoridadesService = autoridadesService;
		this.consejodepartamentalService = consejodepartamentalService;
		this.consejoalumnosService = consejoalumnosService;
	}
	
	//ADMIN
	//devuelve en el model autoridades, consejeros departamentales y consejeros alumnos
	@GetMapping("/admin/autoridades")
	public String getAdminAutoridades(Model model) {
		List<Autoridad> autoridades = autoridadesService.getAutoridades();
		List<Consejo_Departamental> consejodepartamental = consejodepartamentalService.getConsejoDepartamental();
		List<Consejo_Alumnos> consejoalumnos = consejoalumnosService.getConsejoAlumnos();
		model.addAttribute("autoridades", autoridades);
		model.addAttribute("consejodepartamental", consejodepartamental);
		model.addAttribute("consejoalumnos", consejoalumnos);
		return "admin/adminautoridades";
	}
	
	//CREATE or EDIT AUTORIDADES
	@GetMapping("/admin/autoridades/editar/{id}")
	public String editarAutoridad(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Autoridad autoridad = new Autoridad();
			model.addAttribute("autoridad", autoridad);
		}else {
			model.addAttribute("autoridad", autoridadesService.getAutoridad(id).get());
		}
		return "admin/forms/formautoridades";
	}
	@PostMapping("/admin/autoridades/{id}")
	public String actualizarAutoridad(@PathVariable int id, @ModelAttribute("autoridad") Autoridad autoridad) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			autoridadesService.addAutoridad(autoridad);
		}else {
			Autoridad autoridadExistente = autoridadesService.getAutoridad(id).get();
			autoridadExistente.setId_autoridad(id);
			autoridadExistente.setDirector(autoridad.getDirector());
			autoridadExistente.setVicedirector(autoridad.getVicedirector());
			autoridadExistente.setUrl(autoridad.getUrl());
			autoridadExistente.setImg_url_dir(autoridad.getImg_url_dir());
			autoridadExistente.setImg_url_vice(autoridad.getImg_url_vice());
			autoridadesService.updateAutoridad(autoridadExistente);
		}
		return "redirect:/admin/autoridades";
	}
	
	//CREATE or EDIT CONSEJO DEPARTAMENTAL
	@GetMapping("/admin/consejodepartamental/editar/{id}")
	public String editarConsejoDepartamental(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Consejo_Departamental consejodepartamental = new Consejo_Departamental();
			model.addAttribute("consejodepartamental", consejodepartamental);
		}else {
			model.addAttribute("consejodepartamental", consejodepartamentalService.getConsejoDepartamental(id).get());
		}
		return "admin/forms/formconsejodepartamental";
	}
	@PostMapping("/admin/consejodepartamental/{id}")
	public String actualizarConsejoDepartamental(@PathVariable int id, @ModelAttribute("consejodepartamental") Consejo_Departamental consejodepartamental) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			consejodepartamentalService.addConsejoDepartamental(consejodepartamental);
		}else {
			Consejo_Departamental consejodepartamentalExistente = consejodepartamentalService.getConsejoDepartamental(id).get();
			consejodepartamentalExistente.setId_consejo_departamental(id);
			consejodepartamentalExistente.setNombre(consejodepartamental.getNombre());
			consejodepartamentalExistente.setTipo(consejodepartamental.getTipo());
			consejodepartamentalExistente.setUrl(consejodepartamental.getUrl());
			consejodepartamentalService.updateConsejoDepartamental(consejodepartamentalExistente);
		}
		return "redirect:/admin/autoridades";
	}
	
	//CREATE or EDIT CONSEJO ALUMNOS
	@GetMapping("/admin/consejoalumnos/editar/{id}")
	public String editarConsejoAlumnos(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Consejo_Alumnos consejoalumnos = new Consejo_Alumnos();
			model.addAttribute("consejoalumnos", consejoalumnos);
		}else {
			model.addAttribute("consejoalumnos", consejoalumnosService.getConsejoAlumnos(id).get());
		}
		return "admin/forms/formconsejoalumnos";
	}
	@PostMapping("/admin/consejoalumnos/{id}")
	public String actualizarConsejoAlumnos(@PathVariable int id, @ModelAttribute("consejoalumnos") Consejo_Alumnos consejoalumnos) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			consejoalumnosService.addConsejoAlumnos(consejoalumnos);
		}else {
			Consejo_Alumnos consejoalumnosExistente = consejoalumnosService.getConsejoAlumnos(id).get();
			consejoalumnosExistente.setId_consejo_alumnos(id);
			consejoalumnosExistente.setNombre(consejoalumnos.getNombre());
			consejoalumnosExistente.setTipo(consejoalumnos.getTipo());
			consejoalumnosExistente.setUrl(consejoalumnos.getUrl());
			consejoalumnosService.updateConsejoAlumnos(consejoalumnosExistente);
		}
		return "redirect:/admin/autoridades";
	}
	
	//DELETE AUTORIDAD
	@GetMapping("/admin/autoridad/delete/{id}")
	public String eliminarAutoridad(@PathVariable int id) {
		if(id != 0) {
			autoridadesService.deleteAutoridad(id);
		}
		return "redirect:/admin/autoridades";
	}
	
	//DELETE CONSEJO DEPARTAMENTAL
	@GetMapping("/admin/consejodepartamental/delete/{id}")
	public String eliminarConsejoDepartamental(@PathVariable int id) {
		if(id != 0) {
			consejodepartamentalService.deleteConsejoDepartamental(id);
		}
		return "redirect:/admin/autoridades";
	}
		
	//DELETE CONSEJO ALUMNOS
	@GetMapping("/admin/consejoalumnos/delete/{id}")
	public String eliminarConsejoAlumnos(@PathVariable int id) {
		if(id != 0) {
			consejoalumnosService.deleteConsejoAlumnos(id);
		}
		return "redirect:/admin/autoridades";
	}
}




