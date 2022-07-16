package com.example.informatica.user;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.informatica.carrera.graduados.Graduados;

@Service
public class RolService {

	private IRolRepository rolRepository;
	
	@Autowired
	public RolService(IRolRepository rolRepository) {
		this.rolRepository = rolRepository;
	}
	
	public List<Rol> getRoles(int id_usuario) {
		return rolRepository.findRolesByUserId(id_usuario);
	}
	
	public void addRol(Rol rol) {
		rolRepository.save(rol);
	}
	
	public Optional<Rol> getRol(int id){
		return rolRepository.findById(id);
	}
	
	public void updateRol(Rol rol) {
		rolRepository.save(rol);
	}
	
	public void deleteRol(int id) {
		rolRepository.deleteById(id);
	}
	
	public void deleteRolesByUserId(int id) {
		rolRepository.deleteRolesByUserId(id);
	}

	public void updateRolesByMap(int usuario_id, HashMap<String, Boolean> map) {
		//borrado de roles previos
		rolRepository.deleteRolesByUserId(usuario_id);
		//asignacion de nuevos roles
		for(String key: map.keySet()) {
			if(map.get(key)){
				Rol nuevoRol = new Rol();
				nuevoRol.setId_usuario(usuario_id);
				nuevoRol.setRol(key);
				rolRepository.save(nuevoRol);
			}
		}
	}	
}
