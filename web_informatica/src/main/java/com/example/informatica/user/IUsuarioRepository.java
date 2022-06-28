package com.example.informatica.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query(value = "SELECT * FROM usuarios WHERE username = ?1",
		    nativeQuery = true)
	Usuario findByUsername(String username);

}
