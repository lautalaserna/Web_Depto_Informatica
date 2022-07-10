package com.example.informatica.admin;

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
import com.example.informatica.user.Usuario;
import com.example.informatica.user.UsuarioDetailsService;
import com.example.informatica.user.UsuarioService;

@Controller
public class AdminIndexController {
	
	private UsuarioDetailsService usuarioService;
	
	@Autowired
	public AdminIndexController(UsuarioDetailsService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	//ADMIN
	@GetMapping("/admin")
	public String admin(Model model) {
		List<Usuario> usuarios = usuarioService.getUsuarios();
		model.addAttribute("usuarios", usuarios);
		return "admin/admin";
	}
	
}




