package com.example.informatica.internas.cargos;

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
import com.example.informatica.internas.asignaturas.Asignaturas;
import com.example.informatica.internas.asignaturas.AsignaturasService;
import com.example.informatica.internas.dedicacion.Dedicacion;
import com.example.informatica.internas.dedicacion.DedicacionService;
import com.example.informatica.internas.docentes.Docentes;
import com.example.informatica.internas.docentes.DocentesService;
import com.example.informatica.internas.tipo_cargo.TipoCargo;
import com.example.informatica.internas.tipo_cargo.TipoCargoService;

@Controller
public class AdminCargosController {
	
	private CargosService cargosService;
	private AsignaturasService asignaturasService;
	private TipoCargoService tipocargoService;
	private DedicacionService dedicacionService;
	private DocentesService docentesService;
	
	@Autowired
	public AdminCargosController(CargosService cargosService) {
		this.cargosService = cargosService;
	}
	
	//ADMIN
	@GetMapping("/admin/cargos")
	public String getAdminCargos(Model model) {
		List<Cargos> cargos = cargosService.getCargos();
		model.addAttribute("cargos", cargos);
		return "admin/admincargos";
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/cargos/editar/{id}")
	public String editarDedicacion(@PathVariable int id, Model model) {
		//foreign keys combo
		//id_asignatura, id_tipo_cargo, id_dedicacion, id_docente
		List<Asignaturas> asignaturas = asignaturasService.getAsignaturas();
		List<TipoCargo> tipocargo = tipocargoService.getTipoCargo();
		List<Dedicacion> dedicacion = dedicacionService.getDedicacion();
		List<Docentes> docentes = docentesService.getDocentes();
		model.addAttribute("asignaturas", asignaturas);
		model.addAttribute("dedicacion", dedicacion);
		model.addAttribute("tipocargo", tipocargo);
		model.addAttribute("docentes", docentes);
		
		//id == 0 significa nuevo
		if(id == 0) {
			Cargos cargos = new Cargos();
			model.addAttribute("cargo", cargos);
		}else {
			model.addAttribute("cargo", cargosService.getCargo(id).get());
		}
		return "admin/forms/formcargos";
	}
	@PostMapping("/admin/cargos/{id}")
	public String actualizarCargos(@PathVariable int id, @ModelAttribute("cargo") Cargos cargo) {
		//id == 0 significa nuevo
		if(id == 0) {
			cargosService.addCargo(cargo);
		}else {
			Cargos cargoExistente = cargosService.getCargo(id).get();
			cargoExistente.setId_cargo(id);
			cargoExistente.setClasificacion(cargo.getClasificacion());
			cargoExistente.setId_asignatura(cargo.getId_asignatura());
			cargoExistente.setId_dedicacion(cargo.getId_dedicacion());
			cargoExistente.setId_docente(cargo.getId_docente());
			cargoExistente.setId_tipo_cargo(cargo.getId_tipo_cargo());
			cargosService.updateCargo(cargoExistente);
		}
		return "redirect:/admin/cargos";
	}
	
	//DELETE
	@GetMapping("/admin/cargos/delete/{id}")
	public String eliminarCargo(@PathVariable int id) {
		if(id != 0) {
			cargosService.deleteCargo(id);
		}
		return "redirect:/admin/cargos";
	}
	
}




