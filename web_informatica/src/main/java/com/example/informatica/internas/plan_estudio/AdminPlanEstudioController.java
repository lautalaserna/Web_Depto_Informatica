package com.example.informatica.internas.plan_estudio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.informatica.internas.asignaturas.AsignaturasService;
import com.example.informatica.internas.carreras.CarrerasService;
import com.example.informatica.internas.tipocarrera.TipoCarreraService;

@Controller
public class AdminPlanEstudioController {
	
	private PlanEstudioService planestudioService;
	private AsignaturasService asignaturasService;
	private CarrerasService carrerasService;
	
	@Autowired
	public AdminPlanEstudioController(PlanEstudioService planestudioService, AsignaturasService asignaturasService, CarrerasService carrerasService) {
		this.planestudioService = planestudioService;
		this.asignaturasService = asignaturasService;
		this.carrerasService = carrerasService;
	}
	
	//ADMIN
	@GetMapping("/admin/planestudio")
	public String getAdminPlanEstudio(Model model) {
		List<PlanEstudio> planestudio = planestudioService.getPlanEstudios();
		model.addAttribute("planestudio", planestudio);
		return "admin/adminplanestudio";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/planestudio/editar/{id}")
	public String editarPlanEstudio(@PathVariable int id, Model model) {
		//foreign_keys id_asignatura e id_carrera
		model.addAttribute("asignaturas", asignaturasService.getAsignaturas());
		model.addAttribute("carreras", carrerasService.getCarreras());
		//id == 0 significa nuevo
		if(id == 0) {
			PlanEstudio planestudio = new PlanEstudio();
			model.addAttribute("planestudio", planestudio);
		}else {
			model.addAttribute("planestudio", planestudioService.getPlanEstudios(id).get());
		}
		return "admin/forms/formplanestudio";
	}
	@PostMapping("/admin/planestudio/{id}")
	public String actualizarPlanEstudio(@PathVariable int id, @ModelAttribute("planestudio") PlanEstudio planestudio) {
		//id == 0 significa nuevo
		if(id == 0) {
			planestudioService.addPlanEstudios(planestudio);
		}else {
			PlanEstudio planestudioExistente = planestudioService.getPlanEstudios(id).get();
			planestudioExistente.setId_plan_estudio(id);
			planestudioExistente.setAnio(planestudio.getAnio());
			planestudioExistente.setCuatrimestre(planestudio.getCuatrimestre());
			planestudioExistente.setId_asignatura(planestudio.getId_asignatura());
			planestudioExistente.setId_carrera(planestudio.getId_carrera());
			planestudioExistente.setUrl(planestudio.getUrl());
			planestudioService.updatePlanEstudios(planestudioExistente);
		}
		return "redirect:/admin/planestudio";
	}
	
	//DELETE
	@GetMapping("/admin/planestudio/delete/{id}")
	public String eliminarPlanEstudio(@PathVariable int id) {
		if(id != 0) {
			planestudioService.deletePlanEstudios(id);
		}
		return "redirect:/admin/planestudio";
	}
}




