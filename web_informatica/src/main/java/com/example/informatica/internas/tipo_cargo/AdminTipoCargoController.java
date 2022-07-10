package com.example.informatica.internas.tipo_cargo;

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
public class AdminTipoCargoController {
	
	private TipoCargoService tipocargoService;
	
	@Autowired
	public AdminTipoCargoController(TipoCargoService tipocargoService) {
		this.tipocargoService = tipocargoService;
	}
	
	//ADMIN
	@GetMapping("/admin/tipocargo")
	public String getAdminTipoCargo(Model model) {
		List<TipoCargo> tipocargo = tipocargoService.getTipoCargo();
		model.addAttribute("tipocargo", tipocargo);
		return "admin/admintipocargo";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/tipocargo/editar/{id}")
	public String editarDedicacion(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			TipoCargo tipocargo = new TipoCargo();
			model.addAttribute("tipocargo", tipocargo);
		}else {
			model.addAttribute("tipocargo", tipocargoService.getTipoCargo(id).get());
		}
		return "admin/forms/formtipocargo";
	}
	@PostMapping("/admin/tipocargo/{id}")
	public String actualizarTipoCargo(@PathVariable int id, @ModelAttribute("tipocargo") TipoCargo tipocargo) {
		//id == 0 significa nuevo
		if(id == 0) {
			tipocargoService.addTipoCargo(tipocargo);
		}else {
			TipoCargo tipocargoExistente = tipocargoService.getTipoCargo(id).get();
			tipocargoExistente.setId_tipo_cargo(tipocargo.getId_tipo_cargo());
			tipocargoExistente.setNombre(tipocargo.getNombre());
			tipocargoService.updateTipoCargo(tipocargoExistente);
		}
		return "redirect:/admin/tipocargo";
	}
	
	//DELETE
	@GetMapping("/admin/tipocargo/delete/{id}")
	public String eliminarTipoCargo(@PathVariable int id) {
		if(id != 0) {
			tipocargoService.deleteTipoCargo(id);
		}
		return "redirect:/admin/tipocargo";
	}
	
}




