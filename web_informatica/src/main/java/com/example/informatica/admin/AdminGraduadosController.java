package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.informatica.carrera.graduados.Graduados;
import com.example.informatica.carrera.graduados.GraduadosService;

@Controller
public class AdminGraduadosController {
	
	private GraduadosService graduadosService;
	
	@Autowired
	public AdminGraduadosController(GraduadosService graduadosService) {
		this.graduadosService = graduadosService;
	}
	
	//ADMIN
	@GetMapping("/admin_graduados")
	public String getAdminGraduados(Model model) {
		List<Graduados> graduados = graduadosService.getGraduados();
		model.addAttribute("graduados", graduados);
		return "admin/admingraduados";
	}
	//CREATE
	@GetMapping("/admin_graduados_nuevo")
	public String createGraduado(Model model) {
		Graduados graduado = new Graduados();
		model.addAttribute("graduado", graduado);
		return "admin/create/creategraduados";
	}
	@PostMapping("/admin_graduados_nuevo")
	public String addGraduado(@ModelAttribute("graduado") Graduados graduado) {
		graduadosService.addGraduado(graduado);
		return "redirect:/admin_graduados";
	}
	//EDIT
	//@GetMapping()
	//public String editGraduado() {
	//}
	
	//DELETE
	//@GetMapping("/admin_graduados_delete")
	//public 
}