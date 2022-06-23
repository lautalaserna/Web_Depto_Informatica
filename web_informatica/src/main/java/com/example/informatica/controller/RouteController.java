package com.example.informatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	/*
	 * ####### CARRERA ####### 
	 */
	
	@GetMapping("/plan")
	public String plan() {
		return "plan";
	}
	
	@GetMapping("/optativas")
	public String optativas() {
		return "optativas";
	}
	
	@GetMapping("/calendario")
	public String calendario() {
		return "calendario";
	}
	
	@GetMapping("/graduados")
	public String graduados() {
		return "graduados";
	}
	
	@GetMapping("/trabajosfinales")
	public String proyectosfinales() {
		return "trabajosfinales";
	}
	
	@GetMapping("/pps")
	public String pps() {
		return "pps";
	}
	
	/*
	 * ####### INSTITUCIONAL ####### 
	 */
	
	@GetMapping("/autoridades")
	public String autoridades() {
		return "autoridades";
	}
	
	@GetMapping("/docentes")
	public String docentes() {
		return "docentes";
	}
	
	@GetMapping("/investigacion")
	public String investigacion() {
		return "investigacion";
	}
	
	@GetMapping("/elecciones")
	public String elecciones() {
		return "elecciones";
	}
	
	/*
	 * ####### NOVEDADES ####### 
	 */
	
	/*
	@GetMapping("/bolsatrabajo")
	public String bolsaTrabajo() {
		return "bolsatrabajo";
	}
	
	@GetMapping("/noticias")
	public String noticias() {
		return "noticias";
	}
	*/
	/*
	 * ####### CONTACTO ####### 
	 */
	
	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
}
