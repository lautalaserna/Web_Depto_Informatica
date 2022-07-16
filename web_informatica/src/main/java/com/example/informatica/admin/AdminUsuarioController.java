package com.example.informatica.admin;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.informatica.user.Rol;
import com.example.informatica.user.RolMap;
import com.example.informatica.user.RolService;
import com.example.informatica.user.RolesWrapper;
import com.example.informatica.user.SingleRol;
import com.example.informatica.user.Usuario;
import com.example.informatica.user.UsuarioDTO;
import com.example.informatica.user.UsuarioDetailsService;

@Controller
public class AdminUsuarioController {
	
	private UsuarioDetailsService usuarioService;
	private RolService rolService;
	
	@Autowired
	public AdminUsuarioController(UsuarioDetailsService usuarioService, RolService rolService) {
		this.usuarioService = usuarioService;
		this.rolService = rolService;
	}
	
	//CREATE or EDIT
	@GetMapping("/admin/usuarios/editar/{id}")
	public String editarUsuario(@PathVariable int id, Model model) {
		//id == 0 significa nuevo
		if(id == 0) {
			Usuario usuario = new Usuario();
			RolesWrapper wrapper = new RolesWrapper();
			
			model.addAttribute("usuario", usuario);
			model.addAttribute("wrapper", wrapper);
			
		}else {
			Usuario usuarioExistente = usuarioService.getUsuario(id).get();
			List<Rol> rolesUsuario = rolService.getRoles(usuarioExistente.getId_usuario());
			RolMap rolmap = new RolMap();
			for(Rol rol : rolesUsuario ) {
				rolmap.put(rol.getRol(), true);
			}
			model.addAttribute("usuario", usuarioExistente);
			model.addAttribute("roles", rolmap.getMap());
		}
		return "admin/forms/formusuarios";
	}
	@PostMapping("/admin/usuarios/{id}")
	public String actualizarUsuario(@PathVariable int id, @ModelAttribute("usuario") Usuario usuario, @ModelAttribute("wrapper") RolesWrapper wrapper) {
		
		//@RequestParam("wrapper") RolesWrapper wrapper
		//id == 0 significa nuevo
		if(id == 0) {
			
			//usuarioService.addUsuario(usuario);
			//rolService.updateRolesByMap(id, rolmap.getMap());
			
			//usuarioService.addUsuario(usuario);
			
			/*
			for(String key : usuariodto.getMap().keySet()) {
				System.out.println(key);
				System.out.println(usuariodto.getMap().get(key));
			}
			*/
			
			
		}else {
			
			/*
			Usuario usuarioExistente = usuarioService.getUsuario(id).get();
			usuarioExistente.setId_usuario(id);
			usuarioExistente.setUsername(usuario.getUsername());
			
			//si la pw no viene vacia, es porque hay que editarla
			if(!(usuario.getPassword() == null || usuario.getPassword() == "")) {
				//usuarioExistente.setPassword(); //llamar a userdetailsservice
			}
			
			//id usuario + roles nuevos
			usuarioService.updateUsuario(usuarioExistente);
			rolService.updateRolesByMap(id, roles.getMap());
			*/
		}
		return "redirect:/admin/admin";
	}
	
	//DELETE
	@GetMapping("/admin/usuarios/delete/{id}")
	public String eliminarUsuario(@PathVariable int id) {
		if(id != 0) {
			usuarioService.deleteUsuario(id);
			rolService.deleteRolesByUserId(id);
		}
		return "redirect:/admin/admin";
	}
}




