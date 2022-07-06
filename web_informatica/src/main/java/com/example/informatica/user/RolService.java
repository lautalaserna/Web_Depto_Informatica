package com.example.informatica.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
