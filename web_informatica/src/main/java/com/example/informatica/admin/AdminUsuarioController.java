package com.example.informatica.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.informatica.user.Rol;
import com.example.informatica.user.RolService;
import com.example.informatica.user.RolesWrapper;
import com.example.informatica.user.Usuario;
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
			usuarioExistente.setPassword("");
			List<Rol> rolesUsuario = rolService.getRoles(usuarioExistente.getId_usuario());
			
			RolesWrapper wrapper = new RolesWrapper();
			wrapper.setRolesbyListRol(rolesUsuario);
			
			model.addAttribute("usuario", usuarioExistente);
			model.addAttribute("wrapper", wrapper);
		}
		return "admin/forms/formusuarios";
	}
	@PostMapping("/admin/usuarios/{id}")
	public String actualizarUsuario(@PathVariable int id, @ModelAttribute("usuario") Usuario usuario, @ModelAttribute("wrapper") RolesWrapper wrapper) {
		
		
		//id == 0 significa nuevo
		if(id == 0) {
			//no debe existir ningun usuario con el mismo username
			List<Usuario> usuariosExistentes = usuarioService.getUsuarios();
			for(Usuario userExistente : usuariosExistentes) {
				if(userExistente.getUsername().equalsIgnoreCase(usuario.getUsername())) {
					return "usuario ya registrado";
				}
			}
			//contraseña != vacio
			if(usuario.getPassword() == null || usuario.getPassword().equals("")) {
				return "La contraseña no puede ser vacia";
			}
			
			//setear nueva contraseña
			BCryptPasswordEncoder passGen = new BCryptPasswordEncoder();
			usuario.setPassword(passGen.encode(usuario.getPassword()));
			//agrego al usuario
			usuarioService.addUsuario(usuario);
			//obtengo su nuevo id recien generado
			int idGenerado = usuarioService.getUsuarioByUsername(usuario.getUsername()).getId_usuario();
			//a partir de su id asigno sus roles
			rolService.updateRolesByMap(idGenerado, wrapper.getRolesMap());
		}else {
			Usuario usuarioExistente = usuarioService.getUsuario(id).get();
			if(usuario.getPassword() != null && !usuario.getPassword().equals("")) {
				//setear nueva password
				BCryptPasswordEncoder passGen = new BCryptPasswordEncoder();
				usuarioExistente.setPassword(passGen.encode(usuario.getPassword()));
			}
			usuarioExistente.setId_usuario(id);
			usuarioExistente.setUsername(usuario.getUsername());
			//id usuario + roles nuevos
			usuarioService.updateUsuario(usuarioExistente);
			
			if(!isAdmin(id)) {				
				rolService.updateRolesByMap(id, wrapper.getRolesMap());
			}
		}
		return "redirect:/admin";
	}
	
	//DELETE
	@GetMapping("/admin/usuarios/delete/{id}")
	public String eliminarUsuario(@PathVariable int id) {
		if(id != 0) {
			boolean secureDelete = true;
			//no se elimina al usuario con rol admin
			List<Rol> roles = rolService.getRoles(id);
			for(Rol rol : roles) {
				if(rol.getRol().equalsIgnoreCase("admin")) {
					secureDelete = false;
				}
			}
			if(secureDelete) {
				rolService.deleteRolesByUserId(id);
				usuarioService.deleteUsuario(id);
			}
		}
		return "redirect:/admin";
	}
	
	public boolean isAdmin(int id) {
		boolean isadmin = false;
		List<Rol> roles = rolService.getRoles(id);
		//recorre los roles de un usuario para saber si posee el rol "admin" == super usuario
		for(Rol rol : roles) {
			if(rol.getRol().equalsIgnoreCase("admin")) {
				isadmin = true;
			}
		}
		return isadmin;
	}
}
				




