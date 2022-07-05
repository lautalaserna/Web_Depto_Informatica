package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.informatica.carrera.pps.PPS;
import com.example.informatica.carrera.pps.PPSService;

@Controller
public class AdminPPSController {
	
	private PPSService ppsService;
	
	@Autowired
	public AdminPPSController(PPSService ppsService) {
		this.ppsService = ppsService;
	}
	
	//ADMIN
	@GetMapping("/admin/pps")
	public String getAdminPPS(Model model) {
		List<PPS> pps = ppsService.getPPS();
		model.addAttribute("pps", pps);
		return "admin/adminpps";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/pps/editar/{id}")
	public String editarPPS(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			PPS pps = new PPS();
			model.addAttribute("pps", pps);
		}else {
			model.addAttribute("pps", ppsService.getPPS(id).get());
		}
		return "admin/forms/formpps";
	}
	@PostMapping("/admin/pps/{id}")
	public String actualizarPPS(@PathVariable int id, @ModelAttribute("pps") PPS pps) {
		
		//id == 0 significa nuevo
		if(id == 0) {
			ppsService.addPPS(pps);
		}else {
			PPS ppsExistente = ppsService.getPPS(id).get();
			ppsExistente.setId_pps(id);
			ppsExistente.setEntidad(pps.getEntidad());
			ppsExistente.setEstado(pps.getEstado());
			ppsExistente.setEstudiantes(pps.getEstudiantes());
			ppsExistente.setFecha_fin(pps.getFecha_fin());
			ppsExistente.setFecha_inicio(pps.getFecha_inicio());
			ppsExistente.setIs_contratacion(pps.getIs_contratacion());
			ppsExistente.setIs_pdts(pps.getIs_pdts());
			ppsExistente.setIs_pps(pps.getIs_pps());
			ppsExistente.setIs_psc(pps.getIs_psc());
			ppsExistente.setLugar(pps.getLugar());
			ppsExistente.setObjetivo(pps.getObjetivo());
			ppsExistente.setPresupuesto(pps.getPresupuesto());
			ppsExistente.setTutores(pps.getTutores());
			ppsExistente.setUrl(pps.getUrl());
			
			ppsService.updatePPS(ppsExistente);
		}
		return "redirect:/admin/pps";
	}
	
	//DELETE
	@GetMapping("/admin/pps/delete/{id}")
	public String eliminarPPS(@PathVariable int id) {
		if(id != 0) {
			ppsService.deletePPS(id);
		}
		return "redirect:/admin/pps";
	}
}




