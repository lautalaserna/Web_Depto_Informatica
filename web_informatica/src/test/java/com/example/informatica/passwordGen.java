package com.example.informatica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class passwordGen {

	@Test
	public void generatePassword() {
		BCryptPasswordEncoder passGen = new BCryptPasswordEncoder();
		System.out.println(passGen.encode("test"));
	}
	
	@Test
	public void generateRoles() {
		String roles = "uno, dos, tres, cuatro, cinco";
		String[] lista = roles.split(", ");
		
		for(int i=0; i<lista.length; i++) {			
			System.out.println(lista[i]);
		}
		
	}

}
